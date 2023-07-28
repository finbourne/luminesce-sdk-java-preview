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
 * Gets or Sets ConditionAttributes
 */
@JsonAdapter(ConditionAttributes.Adapter.class)
public enum ConditionAttributes {
  
  NONE("None"),
  
  NORMAL("Normal"),
  
  REQUIRED("Required"),
  
  MAIN("Main");

  private String value;

  ConditionAttributes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ConditionAttributes fromValue(String value) {
    for (ConditionAttributes b : ConditionAttributes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ConditionAttributes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ConditionAttributes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ConditionAttributes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ConditionAttributes.fromValue(value);
    }
  }
}

