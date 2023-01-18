package edu.ustb.sei.mde.generator;

import edu.ustb.sei.mde.generator.PartyGenerator;
import edu.ustb.sei.mde.smartContractSpecification.Action;
import edu.ustb.sei.mde.smartContractSpecification.Field;
import edu.ustb.sei.mde.smartContractSpecification.InternalParty;
import edu.ustb.sei.mde.smartContractSpecification.SingleParty;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class SinglePartyGenerator {
  public static String parseParty(final SingleParty p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pragma solidity >=0.4.0 <0.6.0;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contract ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("T{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _Attribute = PartyGenerator.Attribute(p);
    _builder.append(_Attribute, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _DefaultAttribute = PartyGenerator.DefaultAttribute(p);
    _builder.append(_DefaultAttribute, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _RoleAttribute = SinglePartyGenerator.RoleAttribute(p);
    _builder.append(_RoleAttribute, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _BasicOperation = SinglePartyGenerator.BasicOperation(p);
    _builder.append(_BasicOperation, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _GetterAndSetter = SinglePartyGenerator.GetterAndSetter(p);
    _builder.append(_GetterAndSetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _ActionsCount = SinglePartyGenerator.ActionsCount(p);
    _builder.append(_ActionsCount, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static CharSequence RoleAttribute(final SingleParty p) {
    String result = "";
    String _result = result;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("address _");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("Address;");
    _builder.newLineIfNotEmpty();
    _builder.append("uint _max;");
    _builder.newLine();
    _builder.newLine();
    result = (_result + _builder);
    return result;
  }
  
  public static CharSequence BasicOperation(final SingleParty p) {
    String result = "";
    String _result = result;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append("T(){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("_max = now*1000;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function regist(address a) public {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("_");
    String _name_1 = p.getName();
    _builder.append(_name_1, "\t");
    _builder.append("Address = a;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("function getAddress() public returns (address a){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return _");
    String _name_2 = p.getName();
    _builder.append(_name_2, "\t");
    _builder.append("Address;");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    result = (_result + _builder);
    return result;
  }
  
  public static CharSequence GetterAndSetter(final SingleParty p) {
    String result = "";
    if ((p instanceof InternalParty)) {
      EList<Field> _fields = p.getFields();
      for (final Field f : _fields) {
        String _result = result;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("function get");
        String _name = f.getName();
        _builder.append(_name);
        _builder.append("() returns(");
        CharSequence _typeName = PartyGenerator.getTypeName(f.getType());
        _builder.append(_typeName);
        _builder.append(" _result){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("return ");
        String _name_1 = f.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("function set");
        String _name_2 = f.getName();
        _builder.append(_name_2);
        _builder.append("( ");
        CharSequence _typeName_1 = PartyGenerator.getTypeName(f.getType());
        _builder.append(_typeName_1);
        _builder.append(" a){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _name_3 = f.getName();
        _builder.append(_name_3, "\t");
        _builder.append(" = a;");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        result = (_result + _builder);
      }
    }
    return result;
  }
  
  public static CharSequence ActionsCount(final SingleParty p) {
    String result = "";
    EList<Action> _actions = p.getActions();
    for (final Action f : _actions) {
      boolean _isUsed = f.isUsed();
      if (_isUsed) {
        String _result = result;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("function ");
        String _name = f.getName();
        _builder.append(_name);
        _builder.append("Done(){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("_");
        String _name_1 = f.getName();
        _builder.append(_name_1, "\t");
        _builder.append("Time = now;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("_is");
        String _name_2 = f.getName();
        _builder.append(_name_2, "\t");
        _builder.append("Done = true;");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("function ");
        String _name_3 = f.getName();
        _builder.append(_name_3);
        _builder.append("Time() returns (uint result){");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("if(_is");
        String _name_4 = f.getName();
        _builder.append(_name_4, "    ");
        _builder.append("Done){");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("return _");
        String _name_5 = f.getName();
        _builder.append(_name_5, "        ");
        _builder.append("Time;");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return _max;");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        result = (_result + _builder);
      }
    }
    return result;
  }
}
