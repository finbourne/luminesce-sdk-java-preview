/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.202
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets BinaryOperator
 */
@JsonAdapter(BinaryOperator.Adapter.class)
public enum BinaryOperator {
  
  AND("And"),
  
  OR("Or"),
  
  ADD("Add"),
  
  SUBTRACT("Subtract"),
  
  MULTIPLY("Multiply"),
  
  DIVIDE("Divide"),
  
  MOD("Mod"),
  
  LT("Lt"),
  
  LTE("Lte"),
  
  GT("Gt"),
  
  GTE("Gte"),
  
  EQ("Eq"),
  
  NEQ("Neq"),
  
  IN("In"),
  
  NOTIN("NotIn"),
  
  IS("Is"),
  
  ISNOT("IsNot"),
  
  BITSHIFTLEFT("BitShiftLeft"),
  
  BITSHIFTRIGHT("BitShiftRight"),
  
  BITWISEAND("BitwiseAnd"),
  
  BITWISEOR("BitwiseOr"),
  
  CONCATENATE("Concatenate"),
  
  LIKE("Like"),
  
  NOTLIKE("NotLike"),
  
  GLOB("Glob"),
  
  NOTGLOB("NotGlob"),
  
  REGEXP("Regexp"),
  
  NOTREGEXP("NotRegexp");

  private String value;

  BinaryOperator(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BinaryOperator fromValue(String value) {
    for (BinaryOperator b : BinaryOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BinaryOperator> {
    @Override
    public void write(final JsonWriter jsonWriter, final BinaryOperator enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BinaryOperator read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BinaryOperator.fromValue(value);
    }
  }
}

