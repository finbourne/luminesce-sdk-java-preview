/*
 * FINBOURNE Honeycomb Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.8.9
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.luminesce.model.ConditionAttributes;
import com.finbourne.luminesce.model.DataType;
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
 * Column
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Column {
  public static final String SERIALIZED_NAME_IS_PRIMARY_KEY = "isPrimaryKey";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_KEY)
  private Boolean isPrimaryKey;

  public static final String SERIALIZED_NAME_IS_MAIN = "isMain";
  @SerializedName(SERIALIZED_NAME_IS_MAIN)
  private Boolean isMain;

  public static final String SERIALIZED_NAME_IS_REQUIRED_BY_PROVIDER = "isRequiredByProvider";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED_BY_PROVIDER)
  private Boolean isRequiredByProvider;

  public static final String SERIALIZED_NAME_CLIENT_IDS = "clientIds";
  @SerializedName(SERIALIZED_NAME_CLIENT_IDS)
  private List<String> clientIds = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private DataType type;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_CONDITION_USAGE = "conditionUsage";
  @SerializedName(SERIALIZED_NAME_CONDITION_USAGE)
  private ConditionAttributes conditionUsage;

  public static final String SERIALIZED_NAME_SAMPLE_VALUES = "sampleValues";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VALUES)
  private String sampleValues;

  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private String allowedValues;


  public Column isPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey; 
    return this;
  }

   /**
   * Get isPrimaryKey
   * @return isPrimaryKey
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsPrimaryKey() {
    return isPrimaryKey;
  }

  public void setIsPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey;
  }


  public Column isMain(Boolean isMain) {
    this.isMain = isMain; 
    return this;
  }

   /**
   * Get isMain
   * @return isMain
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsMain() {
    return isMain;
  }

  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }


  public Column isRequiredByProvider(Boolean isRequiredByProvider) {
    this.isRequiredByProvider = isRequiredByProvider; 
    return this;
  }

   /**
   * Get isRequiredByProvider
   * @return isRequiredByProvider
  **/
  @ApiModelProperty(value = "")
  public Boolean getIsRequiredByProvider() {
    return isRequiredByProvider;
  }

  public void setIsRequiredByProvider(Boolean isRequiredByProvider) {
    this.isRequiredByProvider = isRequiredByProvider;
  }


  public Column clientIds(List<String> clientIds) {
    this.clientIds = clientIds; 
    return this;
  }

  public Column addClientIdsItem(String clientIdsItem) {
   
    if (this.clientIds == null) {
      this.clientIds = new ArrayList<>();
    }
    this.clientIds.add(clientIdsItem);
    return this;
  }

   /**
   * Get clientIds
   * @return clientIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getClientIds() {
    return clientIds;
  }

  public void setClientIds(List<String> clientIds) {
    this.clientIds = clientIds;
  }


   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }



  public Column type(DataType type) {
    this.type = type; 
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public DataType getType() {
    return type;
  }

  public void setType(DataType type) {
    this.type = type;
  }


  public Column description(String description) {
    this.description = description; 
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Column displayName(String displayName) {
    this.displayName = displayName; 
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Column conditionUsage(ConditionAttributes conditionUsage) {
    this.conditionUsage = conditionUsage; 
    return this;
  }

   /**
   * Get conditionUsage
   * @return conditionUsage
  **/
  @ApiModelProperty(value = "")
  public ConditionAttributes getConditionUsage() {
    return conditionUsage;
  }

  public void setConditionUsage(ConditionAttributes conditionUsage) {
    this.conditionUsage = conditionUsage;
  }


  public Column sampleValues(String sampleValues) {
    this.sampleValues = sampleValues; 
    return this;
  }

   /**
   * Get sampleValues
   * @return sampleValues
  **/
  @ApiModelProperty(value = "")
  public String getSampleValues() {
    return sampleValues;
  }

  public void setSampleValues(String sampleValues) {
    this.sampleValues = sampleValues;
  }


  public Column allowedValues(String allowedValues) {
    this.allowedValues = allowedValues; 
    return this;
  }

   /**
   * Get allowedValues
   * @return allowedValues
  **/
  @ApiModelProperty(value = "")
  public String getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(String allowedValues) {
    this.allowedValues = allowedValues;
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
    sb.append("class Column {\n");
    sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    isRequiredByProvider: ").append(toIndentedString(isRequiredByProvider)).append("\n");
    sb.append("    clientIds: ").append(toIndentedString(clientIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    conditionUsage: ").append(toIndentedString(conditionUsage)).append("\n");
    sb.append("    sampleValues: ").append(toIndentedString(sampleValues)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
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
