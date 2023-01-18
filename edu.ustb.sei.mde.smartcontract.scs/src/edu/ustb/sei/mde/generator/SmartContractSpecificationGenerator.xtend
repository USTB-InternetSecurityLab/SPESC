/*
 * generated by Xtext 2.12.0
 */
package edu.ustb.sei.mde.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import edu.ustb.sei.mde.smartContractSpecification.Contract
import edu.ustb.sei.mde.smartContractSpecification.Field
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType
import edu.ustb.sei.mde.smartContractSpecification.ComplexType
import edu.ustb.sei.mde.smartContractSpecification.Term
import edu.ustb.sei.mde.smartContractSpecification.TransferOperation
import edu.ustb.sei.mde.smartContractSpecification.Deposit
import edu.ustb.sei.mde.smartContractSpecification.Withdraw
import edu.ustb.sei.mde.smartContractSpecification.Transfer
import edu.ustb.sei.mde.smartContractSpecification.Expression
import edu.ustb.sei.mde.smartContractSpecification.Party
import edu.ustb.sei.mde.smartContractSpecification.Type
import edu.ustb.sei.mde.smartContractSpecification.RelationalExpression
import edu.ustb.sei.mde.smartContractSpecification.SlotRef
import edu.ustb.sei.mde.smartContractSpecification.AdditiveExpression
import edu.ustb.sei.mde.smartContractSpecification.IntegerConstant
import edu.ustb.sei.mde.smartContractSpecification.StringConstant
import edu.ustb.sei.mde.smartContractSpecification.MultiplicativeExpression
import edu.ustb.sei.mde.smartContractSpecification.Asset
import edu.ustb.sei.mde.smartContractSpecification.Deposit

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SmartContractSpecificationGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(e: resource.allContents.toIterable.filter(Contract)) {
			fsa.generateFile(
	            e.getName + "/" + e.getName + ".sol",
	            e.compileContract);
	            
			for(f : e.getParties){
	        	fsa.generateFile(
		            e.getName + "/" + f.getName + "T.sol",
		            PartyGenerator.parseParty(f));
	        }
	        for(f : e.getAssets) {
	        	fsa.generateFile(
	        		e.getName + "/" + f.getName + "A.sol",
	        		GenerateAsset.parseAsset(f)
	        	)
	        }

//            fsa.generateFile(
//	            e.getName + "C",
//	            e.chain);
	    }
	}
	
	def CharSequence chain(Contract e){
		var result = ''''{"contract":{"parties":{«FOR f : e.getParties»«f.chain»,«ENDFOR»''';
		result = result.substring(0,result.length-1);
		result += '''},"terms":{«FOR f : e.getTerms»«f.chain»,«ENDFOR»'''
		result = result.substring(0,result.length-1);
		result += '''}}}' ''';
		return result;
	}
	def CharSequence chain(Party e)'''
	"p":"«e.getName»"'''
	def CharSequence chain(Term e){
		var result = '''"«e.getName»":{"condition":{"executor":"«e.getParty.getName»"''';
		if(e.getCondition !== null)
			result += ''',«e.getCondition.chain(1)»'''
		result += '''},"acts":{«FOR f : e.getTransferOperations»«f.chain»,«ENDFOR»''';
		result = result.substring(0,result.length-1);
		if(e.getPostCondition !== null) {
			result += '''},"postcondition":{«e.getPostCondition.chain(1)»''';
		}
		result += '''}}''';
		return result;
	}
	def CharSequence chain(Expression e, int type){
		var result = "";
		if(type == 1) {
			if(e instanceof RelationalExpression)
				result = '''"«e.getLeft.chain(1)»":"«e.getRight.chain(1)»"''';
			if(e instanceof SlotRef)
				result = e.getSlot.getName;
			if(e instanceof StringConstant)
				result = e.getValue;
		} else {
			if(e instanceof RelationalExpression)
				result = '''"value":"«e.getRight.chain(4)»''';
			if(e instanceof SlotRef)
			{
				if(type == 3) {
					
				} else if(type == 0) {
					result = '''«e.getSlot.getName»''';
				} else {
					result = '''«e.getSlot.getName»"''';
				}
			}
			if(e instanceof AdditiveExpression)
				result = '''«e.getLeft.chain(4)»,"ops":{"op":{"opname":"«e.getOperator»","opnumber":«e.getRight.chain(4)»}}''';
			if(e instanceof MultiplicativeExpression)
				result = '''«e.getLeft.chain(4)»,"ops":{"op":{"opname":"«e.getOperator»","opnumber":«e.getRight.chain(4)»}}''';
			if(e instanceof IntegerConstant)
				result = '''«e.getValue»''';
		}
		return result;
	}
	def CharSequence chain(TransferOperation e){
		var result = "";
		if(e instanceof Deposit)
			result = '''"act":{"name":"deposit",«e.getMoney.getCondition.chain(0)»}'''
		if(e instanceof Withdraw)
			result = '''"act":{"name":"withdraw",«e.getMoney.getCondition.chain(0)»}'''
		return result;
	}
	
	def CharSequence compileContract(Contract e){
		var a = '';
		a = '''
		pragma solidity >=0.4.0 <0.6.0;
				
		«FOR f : e.getParties»
			import "./«f.getName»T.sol";
		«ENDFOR»
		«FOR f : e.getAssets»
			import "./«f.getName»A.sol";
		«ENDFOR»
		contract «e.getName» {
			
			«FOR f : e.getParties»
				«f.getName»T «f.getName»;
			«ENDFOR»
			
			«FOR f : e.getFields»
				«f.compileFields»
			«ENDFOR»
			
			uint start;
			«FOR f : e.getTypes»
				«(f as ComplexType).compileTypes»
			«ENDFOR»
			
			«compileConstructor(e)»

			«compileModifier(e)»
			«FOR f : e.getTerms»
				«f.compileTerms»
			«ENDFOR»
		}
		'''
		return a;
	}
	
	def CharSequence compileFields(Field e){
		var a = '';
		var type = e.getType();
		if(type instanceof PrimitiveType){
			a = type.getInstanceType() + ' ' + e.getName + ';';
		}
		else if(type instanceof ComplexType){
			a = type.getName() + ' ' + e.getName + ';';
		}
		else if(type instanceof Party)
			a = 'address ' + e.name + ';';
		return a;
	}
	
	def CharSequence compileTypes(ComplexType e) '''
		struct «e.getName»{
			«FOR f : e.fields»
				«f.compileFields»
			«ENDFOR»
		}
	'''
// 编译资产，生成资产中定义的字段，并默认生成三个方法
	def CharSequence compileAssets(Asset e) '''
		struct «e.getName»{
			«FOR f : e.fields»
				«f.compileFields»
			«ENDFOR»
		}

		function register«e.getName»() public {
			//USER CODE HERE
	
			//CHECK
		}

		function unregister«e.getName»() public {
			//USER CODE HERE
	
			//CHECK
		}

		function transfer«e.getName»() public {
			//USER CODE HERE
			
			//CHECK
		}
	'''

		
	
	def CharSequence compileConstructor(Contract e)'''
		function «e.getName»(){
			start = now;
			«FOR f : e.getParties»
				«f.getName» = new «f.getName»T();
			«ENDFOR»
		}
	'''
	
	def CharSequence compileModifier(Contract e){
		var result = '';
		//角色限制
		for(f : e.getParties){
			if(f.getName != 'everyone'){
				result += '''
				modifier only«f.getName»{
					require(«f.getName».contains(msg.sender));
					_;
				}
				
				'''
			}
		}
		//逻辑限制
		for(f : e.getTerms){
			if(f.getCondition !== null){
				result += '''
				modifier «f.getName»Modifier{
					require(«f.getCondition.compile(20,0)»);
					'''
				for(t : f.transferOperations) 
					if(t instanceof Deposit) 
						result += '\t' + t.compileTransfer();
				result += '''
					_;
				}
				
				'''
				if (f.getBreachOperations().length != 0) {
					result += '''
					modifier «f.getName»BreachModifier{
						require(!(«f.getCondition.compile(20,0)»));
						'''
					for(t : f.transferOperations) 
						if(t instanceof Deposit) 
							result += '\t' + t.compileTransfer();
					result += '''
						_;
					}
					
					'''
				}
			}
		}
		return result;
	}
	
	def static CharSequence getTypeName(Type p){
		if(p instanceof PrimitiveType){
			return p.getInstanceType;
		} else{
			return p.getName;
		}
	}
	
	def CharSequence compileTerms(Term e){
		var result = "";
		result += '''function «e.action.getName»('''
		var p = (e.eContainer as Contract).parties.findFirst[a|a.name == e.party.name];
		var q = p.actions.findFirst[a|a.name == e.action.name];
		var r = q.parameters;
		for(af : r){
			result += af.type.getTypeName + ' ' + af.getName + ', ';			
		}
		if(r.size != 0)
			result = result.substring(0,result.length-2);
		result += ") ";
		result += '''only«e.party.getName»() ''';
		if(e.getCondition() !== null)
			result += e.getName + "Modifier() ";
		result += "public ";
		if(e.getTransferOperations().length != 0)
			result += "payable ";
		result += "{\n";
		result += "\t//USER CODE HERE\n";
		if(e.getPostCondition() !== null){
			result += '''	«e.getPostCondition().compile(20,2)»''';
			result += ";\n";
		}
		if(e.getTransferOperations() !== null){
			for(f : e.getTransferOperations()){
				if(!(f instanceof Deposit))
					result += "\t" + f.compileTransfer();
			}
		}
		result += "\t//CHECK\n";
		if(e.getPostCondition() !== null){
			result += "\t" + e.getPostCondition().compilePostCondition();
		}
		result += "\n}\n\n"
		// 生成违约条款
		if (e.getBreachOperations().length != 0) {
			result += '''function «e.action.getName»Breach('''
			for(af : r){
				result += af.type.getTypeName + ' ' + af.getName + ', ';			
			}
			if(r.size != 0)
				result = result.substring(0,result.length-2);
			result += ") ";
			result += '''only«e.party.getName»() ''';
			if(e.getCondition() !== null)
				result += e.getName + "BreachModifier() ";
			result += "public ";
			if(e.getTransferOperations().length != 0)
				result += "payable ";
			result += "{\n";
			result += "\t//USER CODE HERE\n";
			if(e.getPostCondition() !== null){
				result += '''	«e.getPostCondition().compile(20,2)»''';
				result += ";\n";
			}
			if(e.getBreachOperations() !== null){
				for(f : e.getBreachOperations()){
					if(!(f instanceof Deposit))
						result += "\t" + f.compileTransfer();
				}
			}
			result += "\t//CHECK\n";
			if(e.getPostCondition() !== null){
				result += "\t" + e.getPostCondition().compilePostCondition();
			}
			result += "\n}\n\n"
		}
		
		return result;
	}
	
	def CharSequence compileTransfer(TransferOperation e){
		if (e instanceof Deposit) 
			return '''
			require(«e.getMoney().getCondition().compile(20,0)»);
			'''
		if (e instanceof Withdraw) 
			return '''
			msg.sender.transfer(«e.getMoney().getCondition().compile(20,0)»);
			'''
		if (e instanceof Transfer) 
			return'''
			«e.getAccount().compile(20,0)».transfer(«e.getMoney().getCondition().compile(20,0)»);
			'''
	}
	
	def CharSequence compilePostCondition(Expression e){
		return'''
		assert(«e.compile(20,0)»);'''
	}
	
}