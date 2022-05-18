/*
 * FINBOURNE Honeycomb Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.9.16
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.luminesce.model.BackgroundQueryProgressResponse;
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
 * BackgroundMultiQueryProgressResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BackgroundMultiQueryProgressResponse {
  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private String progress;

  public static final String SERIALIZED_NAME_FEEDBACK = "feedback";
  @SerializedName(SERIALIZED_NAME_FEEDBACK)
  private List<FeedbackEventArgs> feedback = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TaskStatus status;

  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<BackgroundQueryProgressResponse> queries = null;


  public BackgroundMultiQueryProgressResponse progress(String progress) {
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


  public BackgroundMultiQueryProgressResponse feedback(List<FeedbackEventArgs> feedback) {
    this.feedback = feedback; 
    return this;
  }

  public BackgroundMultiQueryProgressResponse addFeedbackItem(FeedbackEventArgs feedbackItem) {
   
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


  public BackgroundMultiQueryProgressResponse status(TaskStatus status) {
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


  public BackgroundMultiQueryProgressResponse queries(List<BackgroundQueryProgressResponse> queries) {
    this.queries = queries; 
    return this;
  }

  public BackgroundMultiQueryProgressResponse addQueriesItem(BackgroundQueryProgressResponse queriesItem) {
   
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @ApiModelProperty(value = "")
  public List<BackgroundQueryProgressResponse> getQueries() {
    return queries;
  }

  public void setQueries(List<BackgroundQueryProgressResponse> queries) {
    this.queries = queries;
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
    sb.append("class BackgroundMultiQueryProgressResponse {\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
