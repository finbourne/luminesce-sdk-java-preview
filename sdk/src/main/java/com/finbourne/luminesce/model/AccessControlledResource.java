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
import com.finbourne.luminesce.model.AccessControlledAction;
import com.finbourne.luminesce.model.AccessControlledResourceIdentifierPartSchemaAttribute;
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
 * AccessControlledResource
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccessControlledResource {
  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private String application;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTIONS = "actions";
  @SerializedName(SERIALIZED_NAME_ACTIONS)
  private List<AccessControlledAction> actions = null;

  public static final String SERIALIZED_NAME_IDENTIFIER_PARTS = "identifierParts";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_PARTS)
  private List<AccessControlledResourceIdentifierPartSchemaAttribute> identifierParts = null;


  public AccessControlledResource application(String application) {
    this.application = application; 
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @ApiModelProperty(value = "")
  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }


  public AccessControlledResource name(String name) {
    this.name = name; 
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public AccessControlledResource description(String description) {
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


  public AccessControlledResource actions(List<AccessControlledAction> actions) {
    this.actions = actions; 
    return this;
  }

  public AccessControlledResource addActionsItem(AccessControlledAction actionsItem) {
   
    if (this.actions == null) {
      this.actions = new ArrayList<>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(value = "")
  public List<AccessControlledAction> getActions() {
    return actions;
  }

  public void setActions(List<AccessControlledAction> actions) {
    this.actions = actions;
  }


  public AccessControlledResource identifierParts(List<AccessControlledResourceIdentifierPartSchemaAttribute> identifierParts) {
    this.identifierParts = identifierParts; 
    return this;
  }

  public AccessControlledResource addIdentifierPartsItem(AccessControlledResourceIdentifierPartSchemaAttribute identifierPartsItem) {
   
    if (this.identifierParts == null) {
      this.identifierParts = new ArrayList<>();
    }
    this.identifierParts.add(identifierPartsItem);
    return this;
  }

   /**
   * Get identifierParts
   * @return identifierParts
  **/
  @ApiModelProperty(value = "")
  public List<AccessControlledResourceIdentifierPartSchemaAttribute> getIdentifierParts() {
    return identifierParts;
  }

  public void setIdentifierParts(List<AccessControlledResourceIdentifierPartSchemaAttribute> identifierParts) {
    this.identifierParts = identifierParts;
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
    sb.append("class AccessControlledResource {\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    identifierParts: ").append(toIndentedString(identifierParts)).append("\n");
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
