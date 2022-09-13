/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.11.207
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
 * Gets or Sets MultiQueryDefinitionType
 */
@JsonAdapter(MultiQueryDefinitionType.Adapter.class)
public enum MultiQueryDefinitionType {
  
  INSTRUMENT("Instrument"),
  
  EXPIRY("Expiry"),
  
  CORPORATEACTIONS("CorporateActions"),
  
  EDIINSTRUMENT("EdiInstrument"),
  
  EDIINSTRUMENTWRITER("EdiInstrumentWriter"),
  
  TESTING("Testing"),
  
  MARKETPLACECLIENTLOADHISTORY("MarketplaceClientLoadHistory"),
  
  INSIGHTSMETRICSENTITLEMENT("InsightsMetricsEntitlement");

  private String value;

  MultiQueryDefinitionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MultiQueryDefinitionType fromValue(String value) {
    for (MultiQueryDefinitionType b : MultiQueryDefinitionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<MultiQueryDefinitionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MultiQueryDefinitionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MultiQueryDefinitionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MultiQueryDefinitionType.fromValue(value);
    }
  }
}

