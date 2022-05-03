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
import com.finbourne.luminesce.model.Link;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * BackgroundMultiQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BackgroundMultiQueryResponse {
  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private UUID executionId;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Link progress;

  public static final String SERIALIZED_NAME_CANCEL = "cancel";
  @SerializedName(SERIALIZED_NAME_CANCEL)
  private Link cancel;

  public static final String SERIALIZED_NAME_FETCH_JSON = "fetchJson";
  @SerializedName(SERIALIZED_NAME_FETCH_JSON)
  private List<Link> fetchJson = null;

  public static final String SERIALIZED_NAME_FETCH_JSON_PROPER = "fetchJsonProper";
  @SerializedName(SERIALIZED_NAME_FETCH_JSON_PROPER)
  private List<Link> fetchJsonProper = null;

  public static final String SERIALIZED_NAME_FETCH_CSV = "fetchCsv";
  @SerializedName(SERIALIZED_NAME_FETCH_CSV)
  private List<Link> fetchCsv = null;

  public static final String SERIALIZED_NAME_FETCH_PIPE = "fetchPipe";
  @SerializedName(SERIALIZED_NAME_FETCH_PIPE)
  private List<Link> fetchPipe = null;

  public static final String SERIALIZED_NAME_FETCH_EXCEL = "fetchExcel";
  @SerializedName(SERIALIZED_NAME_FETCH_EXCEL)
  private List<Link> fetchExcel = null;

  public static final String SERIALIZED_NAME_FETCH_SQLITE = "fetchSqlite";
  @SerializedName(SERIALIZED_NAME_FETCH_SQLITE)
  private List<Link> fetchSqlite = null;


   /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")
  public UUID getExecutionId() {
    return executionId;
  }



  public BackgroundMultiQueryResponse progress(Link progress) {
    this.progress = progress; 
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(value = "")
  public Link getProgress() {
    return progress;
  }

  public void setProgress(Link progress) {
    this.progress = progress;
  }


  public BackgroundMultiQueryResponse cancel(Link cancel) {
    this.cancel = cancel; 
    return this;
  }

   /**
   * Get cancel
   * @return cancel
  **/
  @ApiModelProperty(value = "")
  public Link getCancel() {
    return cancel;
  }

  public void setCancel(Link cancel) {
    this.cancel = cancel;
  }


   /**
   * Get fetchJson
   * @return fetchJson
  **/
  @ApiModelProperty(value = "")
  public List<Link> getFetchJson() {
    return fetchJson;
  }



   /**
   * Get fetchJsonProper
   * @return fetchJsonProper
  **/
  @ApiModelProperty(value = "")
  public List<Link> getFetchJsonProper() {
    return fetchJsonProper;
  }



   /**
   * Get fetchCsv
   * @return fetchCsv
  **/
  @ApiModelProperty(value = "")
  public List<Link> getFetchCsv() {
    return fetchCsv;
  }



   /**
   * Get fetchPipe
   * @return fetchPipe
  **/
  @ApiModelProperty(value = "")
  public List<Link> getFetchPipe() {
    return fetchPipe;
  }



   /**
   * Get fetchExcel
   * @return fetchExcel
  **/
  @ApiModelProperty(value = "")
  public List<Link> getFetchExcel() {
    return fetchExcel;
  }



   /**
   * Get fetchSqlite
   * @return fetchSqlite
  **/
  @ApiModelProperty(value = "")
  public List<Link> getFetchSqlite() {
    return fetchSqlite;
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
    sb.append("class BackgroundMultiQueryResponse {\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    fetchJson: ").append(toIndentedString(fetchJson)).append("\n");
    sb.append("    fetchJsonProper: ").append(toIndentedString(fetchJsonProper)).append("\n");
    sb.append("    fetchCsv: ").append(toIndentedString(fetchCsv)).append("\n");
    sb.append("    fetchPipe: ").append(toIndentedString(fetchPipe)).append("\n");
    sb.append("    fetchExcel: ").append(toIndentedString(fetchExcel)).append("\n");
    sb.append("    fetchSqlite: ").append(toIndentedString(fetchSqlite)).append("\n");
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
