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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Aggregation function type
 */
@JsonAdapter(AggregateFunction.Adapter.class)
public enum AggregateFunction {
  
  COUNT("count"),
  
  COUNT_DISTINCT("count_distinct"),
  
  SUM("sum"),
  
  TOTAL("total"),
  
  AVG("avg"),
  
  MIN("min"),
  
  MAX("max"),
  
  GROUP_CONCAT("group_concat");

  private String value;

  AggregateFunction(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AggregateFunction fromValue(String value) {
    for (AggregateFunction b : AggregateFunction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<AggregateFunction> {
    @Override
    public void write(final JsonWriter jsonWriter, final AggregateFunction enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AggregateFunction read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AggregateFunction.fromValue(value);
    }
  }
}

