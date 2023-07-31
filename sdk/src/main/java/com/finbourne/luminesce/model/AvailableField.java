/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.213
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.luminesce.model.DataType;
import com.finbourne.luminesce.model.FieldType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information about a field that can be designed on (regardless if it currently is)  Kind of a \&quot;mini-available catalog entry\&quot;
 */
@ApiModel(description = "Information about a field that can be designed on (regardless if it currently is)  Kind of a \"mini-available catalog entry\"")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvailableField {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataType dataType;

  public static final String SERIALIZED_NAME_FIELD_TYPE = "fieldType";
  @SerializedName(SERIALIZED_NAME_FIELD_TYPE)
  private FieldType fieldType;

  public static final String SERIALIZED_NAME_IS_MAIN = "isMain";
  @SerializedName(SERIALIZED_NAME_IS_MAIN)
  private Boolean isMain;

  public static final String SERIALIZED_NAME_IS_PRIMARY_KEY = "isPrimaryKey";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_KEY)
  private Boolean isPrimaryKey;


  public AvailableField name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Name of the Field
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the Field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AvailableField dataType(DataType dataType) {
    this.dataType = dataType; 
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }


  public AvailableField fieldType(FieldType fieldType) {
    this.fieldType = fieldType; 
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(required = true, value = "")
  public FieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }


  public AvailableField isMain(Boolean isMain) {
    this.isMain = isMain; 
    return this;
  }

   /**
   * Is this a Main Field within the Provider
   * @return isMain
  **/
  @ApiModelProperty(value = "Is this a Main Field within the Provider")
  public Boolean getIsMain() {
    return isMain;
  }

  public void setIsMain(Boolean isMain) {
    this.isMain = isMain;
  }


  public AvailableField isPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey; 
    return this;
  }

   /**
   * Is this a member of the PrimaryKey of the Provider
   * @return isPrimaryKey
  **/
  @ApiModelProperty(value = "Is this a member of the PrimaryKey of the Provider")
  public Boolean getIsPrimaryKey() {
    return isPrimaryKey;
  }

  public void setIsPrimaryKey(Boolean isPrimaryKey) {
    this.isPrimaryKey = isPrimaryKey;
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
    sb.append("class AvailableField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    isMain: ").append(toIndentedString(isMain)).append("\n");
    sb.append("    isPrimaryKey: ").append(toIndentedString(isPrimaryKey)).append("\n");
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
