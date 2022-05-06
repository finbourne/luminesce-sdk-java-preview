/*
 * FINBOURNE Honeycomb Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7.51
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.luminesce.model.BackgroundQueryState;
import com.finbourne.luminesce.model.TaskStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BackgroundQueryCancelResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BackgroundQueryCancelResponse {
  public static final String SERIALIZED_NAME_HAD_DATA = "hadData";
  @SerializedName(SERIALIZED_NAME_HAD_DATA)
  private Boolean hadData;

  public static final String SERIALIZED_NAME_PREVIOUS_STATUS = "previousStatus";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_STATUS)
  private TaskStatus previousStatus;

  public static final String SERIALIZED_NAME_PREVIOUS_STATE = "previousState";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_STATE)
  private BackgroundQueryState previousState;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;


  public BackgroundQueryCancelResponse hadData(Boolean hadData) {
    this.hadData = hadData; 
    return this;
  }

   /**
   * Get hadData
   * @return hadData
  **/
  @ApiModelProperty(value = "")
  public Boolean getHadData() {
    return hadData;
  }

  public void setHadData(Boolean hadData) {
    this.hadData = hadData;
  }


  public BackgroundQueryCancelResponse previousStatus(TaskStatus previousStatus) {
    this.previousStatus = previousStatus; 
    return this;
  }

   /**
   * Get previousStatus
   * @return previousStatus
  **/
  @ApiModelProperty(value = "")
  public TaskStatus getPreviousStatus() {
    return previousStatus;
  }

  public void setPreviousStatus(TaskStatus previousStatus) {
    this.previousStatus = previousStatus;
  }


  public BackgroundQueryCancelResponse previousState(BackgroundQueryState previousState) {
    this.previousState = previousState; 
    return this;
  }

   /**
   * Get previousState
   * @return previousState
  **/
  @ApiModelProperty(value = "")
  public BackgroundQueryState getPreviousState() {
    return previousState;
  }

  public void setPreviousState(BackgroundQueryState previousState) {
    this.previousState = previousState;
  }


  public BackgroundQueryCancelResponse progress(String progress) {
    this.progress = progress; 
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(value = "")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundQueryCancelResponse {\n");
    sb.append("    hadData: ").append(toIndentedString(hadData)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
    sb.append("    previousState: ").append(toIndentedString(previousState)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
