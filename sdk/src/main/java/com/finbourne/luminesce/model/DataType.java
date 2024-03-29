/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.235
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
 * Gets or Sets DataType
 */
@JsonAdapter(DataType.Adapter.class)
public enum DataType {
  
  BOOLEAN("Boolean"),
  
  DATE("Date"),
  
  DATETIME("DateTime"),
  
  DECIMAL("Decimal"),
  
  DOUBLE("Double"),
  
  INT("Int"),
  
  BIGINT("BigInt"),
  
  TEXT("Text"),
  
  TABLE("Table");

  private String value;

  DataType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataType fromValue(String value) {
    for (DataType b : DataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DataType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DataType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DataType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DataType.fromValue(value);
    }
  }
}

