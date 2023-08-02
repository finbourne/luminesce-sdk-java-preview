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
import com.finbourne.luminesce.model.BackgroundQueryState;
import com.finbourne.luminesce.model.Column;
import com.finbourne.luminesce.model.FeedbackEventArgs;
import com.finbourne.luminesce.model.TaskStatus;
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

/**
 * BackgroundQueryProgressResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BackgroundQueryProgressResponse {
  public static final String SERIALIZED_NAME_HAS_DATA = "hasData";
  @SerializedName(SERIALIZED_NAME_HAS_DATA)
  private Boolean hasData;

  public static final String SERIALIZED_NAME_ROW_COUNT = "rowCount";
  @SerializedName(SERIALIZED_NAME_ROW_COUNT)
  private Integer rowCount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatus status;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private BackgroundQueryState state;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private List<FeedbackEventArgs> feedback = null;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_QUERY_NAME = "queryName";
  @SerializedName(SERIALIZED_NAME_QUERY_NAME)
  private String queryName;

  public static final String SERIALIZED_NAME_COLUMNS_AVAILABLE = "columnsAvailable";
  @SerializedName(SERIALIZED_NAME_COLUMNS_AVAILABLE)
  private List<Column> columnsAvailable = null;


  public BackgroundQueryProgressResponse hasData(Boolean hasData) {
    this.hasData = hasData; 
    return this;
  }

   /**
   * Is there currently data for this Query?
   * @return hasData
  **/
  @ApiModelProperty(value = "Is there currently data for this Query?")
  public Boolean getHasData() {
    return hasData;
  }

  public void setHasData(Boolean hasData) {
    this.hasData = hasData;
  }


  public BackgroundQueryProgressResponse rowCount(Integer rowCount) {
    this.rowCount = rowCount; 
    return this;
  }

   /**
   * Number of rows of data held. -1 if none as yet.
   * @return rowCount
  **/
  @ApiModelProperty(value = "Number of rows of data held. -1 if none as yet.")
  public Integer getRowCount() {
    return rowCount;
  }

  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }


  public BackgroundQueryProgressResponse status(TaskStatus status) {
    this.status = status; 
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public TaskStatus getStatus() {
    return status;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }


  public BackgroundQueryProgressResponse state(BackgroundQueryState state) {
    this.state = state; 
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public BackgroundQueryState getState() {
    return state;
  }

  public void setState(BackgroundQueryState state) {
    this.state = state;
  }


  public BackgroundQueryProgressResponse progress(String progress) {
    this.progress = progress; 
    return this;
  }

   /**
   * The full progress log (up to this point at least)
   * @return progress
  **/
  @ApiModelProperty(value = "The full progress log (up to this point at least)")
  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }


  public BackgroundQueryProgressResponse feedback(List<FeedbackEventArgs> feedback) {
    this.feedback = feedback; 
    return this;
  }

  public BackgroundQueryProgressResponse addFeedbackItem(FeedbackEventArgs feedbackItem) {
   
    if (this.feedback == null) {
      this.feedback = new ArrayList<>();
    }
    this.feedback.add(feedbackItem);
    return this;
  }

   /**
   * Individual Feedback Messages (to replace Progress).  A given message will be returned from only one call.
   * @return feedback
  **/
  @ApiModelProperty(value = "Individual Feedback Messages (to replace Progress).  A given message will be returned from only one call.")
  public List<FeedbackEventArgs> getFeedback() {
    return feedback;
  }

  public void setFeedback(List<FeedbackEventArgs> feedback) {
    this.feedback = feedback;
  }


  public BackgroundQueryProgressResponse query(String query) {
    this.query = query; 
    return this;
  }

   /**
   * The LuminesceSql of the original request
   * @return query
  **/
  @ApiModelProperty(value = "The LuminesceSql of the original request")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public BackgroundQueryProgressResponse queryName(String queryName) {
    this.queryName = queryName; 
    return this;
  }

   /**
   * The QueryName given in the original request
   * @return queryName
  **/
  @ApiModelProperty(value = "The QueryName given in the original request")
  public String getQueryName() {
    return queryName;
  }

  public void setQueryName(String queryName) {
    this.queryName = queryName;
  }


  public BackgroundQueryProgressResponse columnsAvailable(List<Column> columnsAvailable) {
    this.columnsAvailable = columnsAvailable; 
    return this;
  }

  public BackgroundQueryProgressResponse addColumnsAvailableItem(Column columnsAvailableItem) {
   
    if (this.columnsAvailable == null) {
      this.columnsAvailable = new ArrayList<>();
    }
    this.columnsAvailable.add(columnsAvailableItem);
    return this;
  }

   /**
   * When HasData is true this is the schema of columns that will be returned if the data is requested
   * @return columnsAvailable
  **/
  @ApiModelProperty(value = "When HasData is true this is the schema of columns that will be returned if the data is requested")
  public List<Column> getColumnsAvailable() {
    return columnsAvailable;
  }

  public void setColumnsAvailable(List<Column> columnsAvailable) {
    this.columnsAvailable = columnsAvailable;
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
    sb.append("class BackgroundQueryProgressResponse {\n");
    sb.append("    hasData: ").append(toIndentedString(hasData)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    queryName: ").append(toIndentedString(queryName)).append("\n");
    sb.append("    columnsAvailable: ").append(toIndentedString(columnsAvailable)).append("\n");
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
