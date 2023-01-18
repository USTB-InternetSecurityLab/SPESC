package edu.ustb.sei.mde.generator

import edu.ustb.sei.mde.smartContractSpecification.Party
import edu.ustb.sei.mde.smartContractSpecification.InternalParty
import edu.ustb.sei.mde.smartContractSpecification.Type
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType
import edu.ustb.sei.mde.smartContractSpecification.SingleParty
import edu.ustb.sei.mde.smartContractSpecification.GroupParty

class PartyGenerator {
	
	def static parseParty(Party p) {
		if(p instanceof SingleParty) {
			SinglePartyGenerator.parseParty(p);
		}
		else if(p instanceof GroupParty) {
			GroupPartyGenerator.parseParty(p);
		}
	}
	
	def static CharSequence Attribute(Party p) {
		var result = ''
		if(p instanceof InternalParty){
			for(f : p.getFields){
				var q = f.type;
				result += q.getTypeName + ' ' + f.getName + ';\n';
			}
			result += "\n";
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
	
	def static CharSequence DefaultAttribute(Party p) {
		var result = ''
		for(f : p.getActions){
			if(f.used){
				result += "//attributes of action" + f.getName + "\n";
				//该个体是否完成该动作
				result += "bool _is" + f.getName + "Done;" + "\n";
				//该个体完成该动作的时间
				result += "uint _" + f.getName + "Time;" + "\n\n";
			}
		}
		return result;
	}
}