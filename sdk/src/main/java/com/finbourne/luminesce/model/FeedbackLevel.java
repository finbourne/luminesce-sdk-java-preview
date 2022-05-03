/*
 * FINBOURNE Honeycomb Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7.42
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
 * Gets or Sets FeedbackLevel
 */
@JsonAdapter(FeedbackLevel.Adapter.class)
public enum FeedbackLevel {
  
  NONE("None"),
  
  PROGRESS("Progress"),
  
  DEBUG("Debug"),
  
  INFORMATION("Information"),
  
  WARNING("Warning"),
  
  ERROR("Error"),
  
  EXECUTIONKEEPALIVE("ExecutionKeepAlive"),
  
  PROGRESSANDDEBUG("ProgressAndDebug"),
  
  PROGRESSANDINFORMATION("ProgressAndInformation"),
  
  PROGRESSANDWARNING("ProgressAndWarning"),
  
  PROGRESSANDERROR("ProgressAndError");

  private String value;

  FeedbackLevel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeedbackLevel fromValue(String value) {
    for (FeedbackLevel b : FeedbackLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FeedbackLevel> {
    @Override
    public void write(final JsonWriter jsonWriter, final FeedbackLevel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FeedbackLevel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FeedbackLevel.fromValue(value);
    }
  }
}

