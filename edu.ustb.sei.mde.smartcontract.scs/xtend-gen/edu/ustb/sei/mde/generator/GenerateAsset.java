package edu.ustb.sei.mde.generator;

import edu.ustb.sei.mde.smartContractSpecification.Asset;
import edu.ustb.sei.mde.smartContractSpecification.Field;
import edu.ustb.sei.mde.smartContractSpecification.PrimitiveType;
import edu.ustb.sei.mde.smartContractSpecification.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenerateAsset {
  public static String parseAsset(final Asset asset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pragma solidity ^0.4.22;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contract ");
    String _name = asset.getName();
    _builder.append(_name);
    _builder.append("A{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("struct ");
    String _name_1 = asset.getName();
    _builder.append(_name_1, "\t");
    _builder.append("type{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    CharSequence _Attribute = GenerateAsset.Attribute(asset);
    _builder.append(_Attribute, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _GetterAndSetter = GenerateAsset.GetterAndSetter(asset);
    _builder.append(_GetterAndSetter, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("            ");
    CharSequence _defaultInfo = GenerateAsset.defaultInfo(asset);
    _builder.append(_defaultInfo, "            ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public static CharSequence Attribute(final Asset asset) {
    String result = "";
    if ((asset instanceof Asset)) {
      EList<Field> _fields = asset.getFields();
      for (final Field f : _fields) {
        {
          Type q = f.getType();
          String _result = result;
          CharSequence _typeName = GenerateAsset.getTypeName(q);
          String _plus = (_typeName + " ");
          String _name = f.getName();
          String _plus_1 = (_plus + _name);
          String _plus_2 = (_plus_1 + ";\n");
          result = (_result + _plus_2);
        }
      }
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
  
  public static CharSequence GetterAndSetter(final Asset asset) {
    String result = "";
    if ((asset instanceof Asset)) {
      EList<Field> _fields = asset.getFields();
      for (final Field f : _fields) {
        String _result = result;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("function get");
        String _name = f.getName();
        _builder.append(_name);
        _builder.append("(address a) returns(");
        CharSequence _typeName = GenerateAsset.getTypeName(f.getType());
        _builder.append(_typeName);
        _builder.append(" _result){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("uint num = _userlist[a];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("return _");
        String _name_1 = asset.getName();
        _builder.append(_name_1, "\t");
        _builder.append("Entity[num].");
        String _name_2 = f.getName();
        _builder.append(_name_2, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("function set");
        String _name_3 = f.getName();
        _builder.append(_name_3);
        _builder.append("(address a, ");
        CharSequence _typeName_1 = GenerateAsset.getTypeName(f.getType());
        _builder.append(_typeName_1);
        _builder.append(" b){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("uint num = _userlist[a];");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("_");
        String _name_4 = asset.getName();
        _builder.append(_name_4, "\t");
        _builder.append("Entity[num].");
        String _name_5 = f.getName();
        _builder.append(_name_5, "\t");
        _builder.append(" = b;");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        _builder.newLine();
        result = (_result + _builder);
      }
    }
    return result;
  }
  
  public static CharSequence defaultInfo(final Asset asset) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("function register");
    String _name = asset.getName();
    _builder.append(_name);
    _builder.append("() public {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("//USER CODE HERE");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//CHECK");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("function unregister");
    String _name_1 = asset.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("() public {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("//USER CODE HERE");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//CHECK");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("function transfer");
    String _name_2 = asset.getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("() public {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("//USER CODE HERE");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("//CHECK");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
