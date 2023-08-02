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
import com.finbourne.luminesce.model.FeedbackLevel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * FeedbackEventArgs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedbackEventArgs {
  public static final String SERIALIZED_NAME_WHEN = "when";
  @SerializedName(SERIALIZED_NAME_WHEN)
  private OffsetDateTime when;

  public static final String SERIALIZED_NAME_SESSION_ID = "sessionId";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private UUID sessionId;

  public static final String SERIALIZED_NAME_EXECUTION_ID = "executionId";
  @SerializedName(SERIALIZED_NAME_EXECUTION_ID)
  private UUID executionId;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private FeedbackLevel level;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private String sender;

  public static final String SERIALIZED_NAME_STATE_ID = "stateId";
  @SerializedName(SERIALIZED_NAME_STATE_ID)
  private Integer stateId;

  public static final String SERIALIZED_NAME_MESSAGE_TEMPLATE = "messageTemplate";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TEMPLATE)
  private String messageTemplate;

  public static final String SERIALIZED_NAME_PROPERTY_VALUES = "propertyValues";
  @SerializedName(SERIALIZED_NAME_PROPERTY_VALUES)
  private List<Object> propertyValues = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public FeedbackEventArgs when(OffsetDateTime when) {
    this.when = when; 
    return this;
  }

   /**
   * Get when
   * @return when
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }


  public FeedbackEventArgs sessionId(UUID sessionId) {
    this.sessionId = sessionId; 
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(value = "")
  public UUID getSessionId() {
    return sessionId;
  }

  public void setSessionId(UUID sessionId) {
    this.sessionId = sessionId;
  }


  public FeedbackEventArgs executionId(UUID executionId) {
    this.executionId = executionId; 
    return this;
  }

   /**
   * Get executionId
   * @return executionId
  **/
  @ApiModelProperty(value = "")
  public UUID getExecutionId() {
    return executionId;
  }

  public void setExecutionId(UUID executionId) {
    this.executionId = executionId;
  }


  public FeedbackEventArgs level(FeedbackLevel level) {
    this.level = level; 
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(value = "")
  public FeedbackLevel getLevel() {
    return level;
  }

  public void setLevel(FeedbackLevel level) {
    this.level = level;
  }


  public FeedbackEventArgs sender(String sender) {
    this.sender = sender; 
    return this;
  }

   /**
   * Get sender
   * @return sender
  **/
  @ApiModelProperty(value = "")
  public String getSender() {
    return sender;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }


  public FeedbackEventArgs stateId(Integer stateId) {
    this.stateId = stateId; 
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public Integer getStateId() {
    return stateId;
  }

  public void setStateId(Integer stateId) {
    this.stateId = stateId;
  }


  public FeedbackEventArgs messageTemplate(String messageTemplate) {
    this.messageTemplate = messageTemplate; 
    return this;
  }

   /**
   * Get messageTemplate
   * @return messageTemplate
  **/
  @ApiModelProperty(value = "")
  public String getMessageTemplate() {
    return messageTemplate;
  }

  public void setMessageTemplate(String messageTemplate) {
    this.messageTemplate = messageTemplate;
  }


  public FeedbackEventArgs propertyValues(List<Object> propertyValues) {
    this.propertyValues = propertyValues; 
    return this;
  }

  public FeedbackEventArgs addPropertyValuesItem(Object propertyValuesItem) {
   
    if (this.propertyValues == null) {
      this.propertyValues = new ArrayList<>();
    }
    this.propertyValues.add(propertyValuesItem);
    return this;
  }

   /**
   * Get propertyValues
   * @return propertyValues
  **/
  @ApiModelProperty(value = "")
  public List<Object> getPropertyValues() {
    return propertyValues;
  }

  public void setPropertyValues(List<Object> propertyValues) {
    this.propertyValues = propertyValues;
  }


   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
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
    sb.append("class FeedbackEventArgs {\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    messageTemplate: ").append(toIndentedString(messageTemplate)).append("\n");
    sb.append("    propertyValues: ").append(toIndentedString(propertyValues)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
