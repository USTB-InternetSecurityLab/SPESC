package edu.ustb.sei.mde.generator

import edu.ustb.sei.mde.smartContractSpecification.Asset
import edu.ustb.sei.mde.smartContractSpecification.InternalParty
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType
import edu.ustb.sei.mde.smartContractSpecification.Type

class GenerateAsset {
	
	def static  parseAsset(Asset asset){
		return '''
		pragma solidity ^0.4.22;
		
		contract «asset.getName»A{
			
			struct «asset.getName»type{
				«Attribute(asset)»
			}			
			«GetterAndSetter(asset)»
            «defaultInfo(asset)»
		}
		'''
	}
	
	def static CharSequence Attribute(Asset asset) {
		var result = ''
		if(asset instanceof Asset){
			for(f : asset.getFields){
				var q = f.type;
				result += q.getTypeName + ' ' + f.getName + ';\n';
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
	
	def static CharSequence GetterAndSetter(Asset asset) {
		var result = ''
		if(asset instanceof Asset){
			for(f : asset.getFields){
				result += '''
				function get«f.getName»(address a) returns(«f.getType.getTypeName» _result){
					uint num = _userlist[a];
					return _«asset.getName»Entity[num].«f.getName»;
				}
				
				function set«f.getName»(address a, «f.getType.getTypeName» b){
					uint num = _userlist[a];
					_«asset.getName»Entity[num].«f.getName» = b;
				}
				
				''';
			}
		}
		return result;
	}
	
    def static CharSequence defaultInfo(Asset asset) {
        return '''
        function register«asset.getName»() public {
			//USER CODE HERE
	
			//CHECK
		}

		function unregister«asset.getName»() public {
			//USER CODE HERE
	
			//CHECK
		}

		function transfer«asset.getName»() public {
			//USER CODE HERE
			
			//CHECK
		}
    }
    '''
	}
}
