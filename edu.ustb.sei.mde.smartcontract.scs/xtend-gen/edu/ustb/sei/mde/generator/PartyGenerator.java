package edu.ustb.sei.mde.generator;

import edu.ustb.sei.mde.generator.GroupPartyGenerator;
import edu.ustb.sei.mde.generator.SinglePartyGenerator;
import edu.ustb.sei.mde.smartContractSpecification.Action;
import edu.ustb.sei.mde.smartContractSpecification.Field;
import edu.ustb.sei.mde.smartContractSpecification.GroupParty;
import edu.ustb.sei.mde.smartContractSpecification.InternalParty;
import edu.ustb.sei.mde.smartContractSpecification.Party;
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType;
import edu.ustb.sei.mde.smartContractSpecification.SingleParty;
import edu.ustb.sei.mde.smartContractSpecification.Type;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class PartyGenerator {
  public static String parseParty(final Party p) {
    String _xifexpression = null;
    if ((p instanceof SingleParty)) {
      _xifexpression = SinglePartyGenerator.parseParty(((SingleParty)p));
    } else {
      String _xifexpression_1 = null;
      if ((p instanceof GroupParty)) {
        _xifexpression_1 = GroupPartyGenerator.parseParty(((GroupParty)p));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public static CharSequence Attribute(final Party p) {
    String result = "";
    if ((p instanceof InternalParty)) {
      EList<Field> _fields = ((InternalParty)p).getFields();
      for (final Field f : _fields) {
        {
          Type q = f.getType();
          String _result = result;
          CharSequence _typeName = PartyGenerator.getTypeName(q);
          String _plus = (_typeName + " ");
          String _name = f.getName();
          String _plus_1 = (_plus + _name);
          String _plus_2 = (_plus_1 + ";\n");
          result = (_result + _plus_2);
        }
      }
      String _result = result;
      result = (_result + "\n");
    }
    return result;
  }
  
  public static CharSequence getTypeName(final Type p) {
    if ((p instanceof PrimitiveType)) {
      return ((PrimitiveType)p).getInstanceType();
    } else {
      return p.getName();
    }
  }
  
  public static CharSequence DefaultAttribute(final Party p) {
    String result = "";
    EList<Action> _actions = p.getActions();
    for (final Action f : _actions) {
      boolean _isUsed = f.isUsed();
      if (_isUsed) {
        String _result = result;
        String _name = f.getName();
        String _plus = ("//attributes of action" + _name);
        String _plus_1 = (_plus + "\n");
        result = (_result + _plus_1);
        String _result_1 = result;
        String _name_1 = f.getName();
        String _plus_2 = ("bool _is" + _name_1);
        String _plus_3 = (_plus_2 + "Done;");
        String _plus_4 = (_plus_3 + "\n");
        result = (_result_1 + _plus_4);
        String _result_2 = result;
        String _name_2 = f.getName();
        String _plus_5 = ("uint _" + _name_2);
        String _plus_6 = (_plus_5 + "Time;");
        String _plus_7 = (_plus_6 + "\n\n");
        result = (_result_2 + _plus_7);
      }
    }
    return result;
  }
}
