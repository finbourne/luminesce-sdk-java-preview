/*
 * FINBOURNE Honeycomb Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7.95
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

/**
 * BackgroundQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BackgroundQueryResponse {
  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private String executionId;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Link progress;

  public static final String SERIALIZED_NAME_CANCEL = "cancel";
  @SerializedName(SERIALIZED_NAME_CANCEL)
  private Link cancel;

  public static final String SERIALIZED_NAME_FETCH_JSON = "fetchJson";
  @SerializedName(SERIALIZED_NAME_FETCH_JSON)
  private Link fetchJson;

  public static final String SERIALIZED_NAME_FETCH_JSON_PROPER = "fetchJsonProper";
  @SerializedName(SERIALIZED_NAME_FETCH_JSON_PROPER)
  private Link fetchJsonProper;

  public static final String SERIALIZED_NAME_FETCH_CSV = "fetchCsv";
  @SerializedName(SERIALIZED_NAME_FETCH_CSV)
  private Link fetchCsv;

  public static final String SERIALIZED_NAME_FETCH_PIPE = "fetchPipe";
  @SerializedName(SERIALIZED_NAME_FETCH_PIPE)
  private Link fetchPipe;

  public static final String SERIALIZED_NAME_FETCH_EXCEL = "fetchExcel";
  @SerializedName(SERIALIZED_NAME_FETCH_EXCEL)
  private Link fetchExcel;

  public static final String SERIALIZED_NAME_FETCH_SQLITE = "fetchSqlite";
  @SerializedName(SERIALIZED_NAME_FETCH_SQLITE)
  private Link fetchSqlite;

  public static final String SERIALIZED_NAME_HISTOGRAM = "histogram";
  @SerializedName(SERIALIZED_NAME_HISTOGRAM)
  private Link histogram;


  public BackgroundQueryResponse executionId(String executionId) {
    this.executionId = executionId; 
    return this;
  }

   /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")
  public String getExecutionId() {
    return executionId;
  }

  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public BackgroundQueryResponse progress(Link progress) {
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


  public BackgroundQueryResponse cancel(Link cancel) {
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


  public BackgroundQueryResponse fetchJson(Link fetchJson) {
    this.fetchJson = fetchJson; 
    return this;
  }

   /**
   * Get fetchJson
   * @return fetchJson
  **/
  @ApiModelProperty(value = "")
  public Link getFetchJson() {
    return fetchJson;
  }

  public void setFetchJson(Link fetchJson) {
    this.fetchJson = fetchJson;
  }


  public BackgroundQueryResponse fetchJsonProper(Link fetchJsonProper) {
    this.fetchJsonProper = fetchJsonProper; 
    return this;
  }

   /**
   * Get fetchJsonProper
   * @return fetchJsonProper
  **/
  @ApiModelProperty(value = "")
  public Link getFetchJsonProper() {
    return fetchJsonProper;
  }

  public void setFetchJsonProper(Link fetchJsonProper) {
    this.fetchJsonProper = fetchJsonProper;
  }


  public BackgroundQueryResponse fetchCsv(Link fetchCsv) {
    this.fetchCsv = fetchCsv; 
    return this;
  }

   /**
   * Get fetchCsv
   * @return fetchCsv
  **/
  @ApiModelProperty(value = "")
  public Link getFetchCsv() {
    return fetchCsv;
  }

  public void setFetchCsv(Link fetchCsv) {
    this.fetchCsv = fetchCsv;
  }


  public BackgroundQueryResponse fetchPipe(Link fetchPipe) {
    this.fetchPipe = fetchPipe; 
    return this;
  }

   /**
   * Get fetchPipe
   * @return fetchPipe
  **/
  @ApiModelProperty(value = "")
  public Link getFetchPipe() {
    return fetchPipe;
  }

  public void setFetchPipe(Link fetchPipe) {
    this.fetchPipe = fetchPipe;
  }


  public BackgroundQueryResponse fetchExcel(Link fetchExcel) {
    this.fetchExcel = fetchExcel; 
    return this;
  }

   /**
   * Get fetchExcel
   * @return fetchExcel
  **/
  @ApiModelProperty(value = "")
  public Link getFetchExcel() {
    return fetchExcel;
  }

  public void setFetchExcel(Link fetchExcel) {
    this.fetchExcel = fetchExcel;
  }


  public BackgroundQueryResponse fetchSqlite(Link fetchSqlite) {
    this.fetchSqlite = fetchSqlite; 
    return this;
  }

   /**
   * Get fetchSqlite
   * @return fetchSqlite
  **/
  @ApiModelProperty(value = "")
  public Link getFetchSqlite() {
    return fetchSqlite;
  }

  public void setFetchSqlite(Link fetchSqlite) {
    this.fetchSqlite = fetchSqlite;
  }


  public BackgroundQueryResponse histogram(Link histogram) {
    this.histogram = histogram; 
    return this;
  }

   /**
   * Get histogram
   * @return histogram
  **/
  @ApiModelProperty(value = "")
  public Link getHistogram() {
    return histogram;
  }

  public void setHistogram(Link histogram) {
    this.histogram = histogram;
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
    sb.append("class BackgroundQueryResponse {\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    cancel: ").append(toIndentedString(cancel)).append("\n");
    sb.append("    fetchJson: ").append(toIndentedString(fetchJson)).append("\n");
    sb.append("    fetchJsonProper: ").append(toIndentedString(fetchJsonProper)).append("\n");
    sb.append("    fetchCsv: ").append(toIndentedString(fetchCsv)).append("\n");
    sb.append("    fetchPipe: ").append(toIndentedString(fetchPipe)).append("\n");
    sb.append("    fetchExcel: ").append(toIndentedString(fetchExcel)).append("\n");
    sb.append("    fetchSqlite: ").append(toIndentedString(fetchSqlite)).append("\n");
    sb.append("    histogram: ").append(toIndentedString(histogram)).append("\n");
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
