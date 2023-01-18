package edu.ustb.sei.mde.generator

import edu.ustb.sei.mde.smartContractSpecification.Party
import edu.ustb.sei.mde.smartContractSpecification.InternalParty
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType
import edu.ustb.sei.mde.smartContractSpecification.Type
import edu.ustb.sei.mde.smartContractSpecification.GroupParty

class GroupPartyGenerator {
	
	def static  parseParty(GroupParty p){
		return '''
		pragma solidity >=0.4.0 <0.6.0;
		
		contract «p.getName»T{
			
			struct «p.getName»type{
				address _«p.getName»address;
				
				«PartyGenerator.Attribute(p)»
				«PartyGenerator.DefaultAttribute(p)»
			}
			
			«RoleAttribute(p)»
			«BasicOperation(p)»
			«GetterAndSetter(p)»
			«ActionsCount(p)»
		}
		'''
	}
	
	def static CharSequence RoleAttribute(GroupParty p) {
		var result = ''
		result += 'uint _max;//time max\n';//时间上限
		result += 'uint _sum;//total member of this party\n';//这个角色的总人数
		
		for(f : p.getActions){
			//每个动作的完成和计时
			result += '''
			uint _«f.getName»DoneNum;
			uint[] _«f.getName»Time;
			
			''';
		}
		//用于初始化和维护成员
		result += '''
		«p.getName»type _Empty;//used to initialize
		«p.getName»type[] _«p.getName»Entity;
		mapping(address=>uint) _userlist;
		
		'''
		return result;
	}
	
	def static CharSequence BasicOperation(GroupParty p) {
		var result = ''
		result += '''
		function «p.getName»T(){
			«FOR f : p.getActions»
			_«f.getName»DoneNum = 0;
			
			«ENDFOR»
			_«p.getName»Entity.push(_Empty);
			_max = now*1000;
		}
		
		function getSum() public returns(uint c){
			return _sum;
		}
		
		function add(address a) public {
			_«p.getName»Entity.push(_Empty);
			_userlist[a] = _sum;
			_sum ++;
		}
		
		function remove(address a) public {
			uint num = _userlist[a];
			_«p.getName»Entity[num] = _«p.getName»Entity[_sum-1];
			_userlist[_«p.getName»Entity[num]._«p.getName»address] = num;
			delete(_«p.getName»Entity[num]);
			delete(_userlist[a]);
			_sum --;
		}
		
		function getList() public returns (address[]){
			address[] a;
			for(uint i = 0; i < _sum; i ++)
		        a[i] = _«p.getName»Entity[i]._«p.getName»address;
			return a;
		}
		
		function contains(address a) public returns (bool b){
			return _userlist[a] != 0;
		}
		
		''';
		return result;
	}
	
	def static CharSequence GetterAndSetter(GroupParty p) {
		var result = ''
		if(p instanceof InternalParty){
			for(f : p.getFields){
				result += '''
				function get«f.getName»(address a) returns(«PartyGenerator.getTypeName(f.getType)» _result){
					uint num = _userlist[a];
					return _«p.getName»Entity[num].«f.getName»;
				}
				
				function set«f.getName»(address a, «PartyGenerator.getTypeName(f.getType)» b){
					uint num = _userlist[a];
					_«p.getName»Entity[num].«f.getName» = b;
				}
				
				''';
			}
		}
		return result;
	}
	
	def static CharSequence ActionsCount(GroupParty p) {
		var result = ''
		for(f : p.getActions){
			if(f.used){
				result += '''
				function «f.getName»Done(address a){
				    uint num = _userlist[a];
					_«p.getName»Entity[num]._«f.getName»Time = now;
					_«p.getName»Entity[num]._is«f.getName»Done = true;
					_«f.getName»Time.push(_«p.getName»Entity[num]._«f.getName»Time);
					_«f.getName»DoneNum ++;
				}
				
				function «f.getName»Time(address a) returns (uint result){
				    uint num = _userlist[a];
				    if(_«p.getName»Entity[num]._is«f.getName»Done){
				        return _«p.getName»Entity[num]._«f.getName»Time;
				    }
				    return _max;
				}
							
				function «f.getName»AllTime() returns (uint result){
				    if(_«f.getName»DoneNum == _max-1){
				        return _«f.getName»Time[_«f.getName»DoneNum-1];
				    }
				    return _max;
				}
				
				function «f.getName»SomeTime() returns (uint result){
				    if(_«f.getName»DoneNum >= 1){
				        return _«f.getName»Time[0];
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