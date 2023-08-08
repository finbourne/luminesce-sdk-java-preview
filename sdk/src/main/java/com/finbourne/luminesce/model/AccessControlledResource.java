/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.265
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.finbourne.luminesce.JSON;

/**
 * AccessControlledResource
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
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
  private List<AccessControlledAction> actions;

  public static final String SERIALIZED_NAME_IDENTIFIER_PARTS = "identifierParts";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER_PARTS)
  private List<AccessControlledResourceIdentifierPartSchemaAttribute> identifierParts;

  public AccessControlledResource() {
  }

  public AccessControlledResource application(String application) {
    this.application = application; 
    return this;
  }

   /**
   * Get application
   * @return application
  **/
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return super.hashCode();  
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("application");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("actions");
    openapiFields.add("identifierParts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AccessControlledResource
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AccessControlledResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AccessControlledResource is not found in the empty JSON string", AccessControlledResource.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AccessControlledResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AccessControlledResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()) && !jsonObj.get("application").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `application` to be a primitive type in the JSON string but got `%s`", jsonObj.get("application").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("actions") != null && !jsonObj.get("actions").isJsonNull()) {
        JsonArray jsonArrayactions = jsonObj.getAsJsonArray("actions");
        if (jsonArrayactions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("actions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `actions` to be an array in the JSON string but got `%s`", jsonObj.get("actions").toString()));
          }

          // validate the optional field `actions` (array)
          for (int i = 0; i < jsonArrayactions.size(); i++) {
            AccessControlledAction.validateJsonElement(jsonArrayactions.get(i));
          };
        }
      }
      if (jsonObj.get("identifierParts") != null && !jsonObj.get("identifierParts").isJsonNull()) {
        JsonArray jsonArrayidentifierParts = jsonObj.getAsJsonArray("identifierParts");
        if (jsonArrayidentifierParts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("identifierParts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `identifierParts` to be an array in the JSON string but got `%s`", jsonObj.get("identifierParts").toString()));
          }

          // validate the optional field `identifierParts` (array)
          for (int i = 0; i < jsonArrayidentifierParts.size(); i++) {
            AccessControlledResourceIdentifierPartSchemaAttribute.validateJsonElement(jsonArrayidentifierParts.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccessControlledResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccessControlledResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccessControlledResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccessControlledResource.class));

       return (TypeAdapter<T>) new TypeAdapter<AccessControlledResource>() {
           @Override
           public void write(JsonWriter out, AccessControlledResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccessControlledResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccessControlledResource given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccessControlledResource
  * @throws IOException if the JSON string is invalid with respect to AccessControlledResource
  */
  public static AccessControlledResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccessControlledResource.class);
  }

 /**
  * Convert an instance of AccessControlledResource to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

