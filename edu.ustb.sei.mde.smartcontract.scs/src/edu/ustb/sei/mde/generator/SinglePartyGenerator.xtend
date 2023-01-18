package edu.ustb.sei.mde.generator

import edu.ustb.sei.mde.smartContractSpecification.SingleParty
import edu.ustb.sei.mde.smartContractSpecification.Party
import edu.ustb.sei.mde.smartContractSpecification.InternalParty
import edu.ustb.sei.mde.smartContractSpecification.Type
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType

class SinglePartyGenerator {
	
	def static parseParty(SingleParty p) {
		return '''
		pragma solidity >=0.4.0 <0.6.0;
		
		contract «p.getName»T{
			
			«PartyGenerator.Attribute(p)»
			«PartyGenerator.DefaultAttribute(p)»
			«RoleAttribute(p)»
			«BasicOperation(p)»
			«GetterAndSetter(p)»
			«ActionsCount(p)»
		}
		'''
	}
	
	def static CharSequence RoleAttribute(SingleParty p) {
		var result = '';
		result += '''
		address _«p.getName»Address;
		uint _max;
		
		'''
		return result;
	}
	def static CharSequence BasicOperation(SingleParty p) {
		var result = '';
		result += '''
		function «p.getName»T(){
			_max = now*1000;
		}
		
		function regist(address a) public {
			_«p.getName»Address = a;
		}
		
		function getAddress() public returns (address a){
			return _«p.getName»Address;
		}
		
		''';
		return result;
	}
	
	def static CharSequence GetterAndSetter(SingleParty p) {
		var result = ''
		if(p instanceof InternalParty){
			for(f : p.getFields){
				result += '''
				function get«f.getName»() returns(«PartyGenerator.getTypeName(f.getType)» _result){
					return «f.getName»;
				}
				
				function set«f.getName»( «PartyGenerator.getTypeName(f.getType)» a){
					«f.getName» = a;
				}
				
				''';
			}
		}
		return result;
	}
	
	def static CharSequence ActionsCount(SingleParty p) {
		var result = ''
		for(f : p.getActions){
			if(f.used){
				result += '''
				function «f.getName»Done(){
					_«f.getName»Time = now;
					_is«f.getName»Done = true;
				}
				
				function «f.getName»Time() returns (uint result){
				    if(_is«f.getName»Done){
				        return _«f.getName»Time;
				    }
				    return _max;
				}
				
				''';
			}
		}
		return result;
	}
	
//	'''
//			struct «e.getName»type{
//				«FOR f : e.fields»
//					«f.getType.getName» «f.getName»;
//				«ENDFOR»
//				«FOR f : e.actions»
//					bool is«f.getName»Done;
//					uint «f.getName»Time;
//				«ENDFOR»
//				address add;
//			}
//			«e.getName»type «e.getName»;
//			int «e.getName»num;
//			mapping(address => uint) get«e.getName»num;
//			
//		'''
}