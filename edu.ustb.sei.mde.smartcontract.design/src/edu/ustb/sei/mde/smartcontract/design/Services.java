package edu.ustb.sei.mde.smartcontract.design;

import edu.ustb.sei.mde.smartContractSpecification.*;

import org.eclipse.emf.ecore.EObject;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public String compileDeal(EObject self) {
    	String a = "";
    	if(self instanceof Deposit) {
    		a += ((Term) self.eContainer()).getParty().getName() + " Deposit ";
    		a += ((Deposit) self).getMoney().getRelationOperator().compile();
    		a += ' ' + ((Deposit) self).getMoney().getCondition().compile(20,1);
    	} else if(self instanceof Withdraw) {
    		a += ((Term) self.eContainer()).getParty().getName() + " Withdraw ";
    		a += ((Withdraw) self).getMoney().getRelationOperator().compile();
    		a += ' ' + ((Withdraw) self).getMoney().getCondition().compile(20,1);
    	} else if(self instanceof Transfer) {
    		a += " Transfer " + ((Transfer) self).getMoney().getRelationOperator().compile();
    		a += " " + ((Transfer) self).getMoney().getCondition().compile(20,1);
    		a += " to " + ((Transfer) self).getAccount().compile(20,1);
    	} else {
    		a += "Invalid Type!(service compileDeal)";
    	}
    	return a;
    }
}
