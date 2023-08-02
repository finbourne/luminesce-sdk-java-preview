/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.234
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.model;

import java.util.Objects;
import java.util.Arrays;
import com.finbourne.luminesce.model.AvailableField;
import com.finbourne.luminesce.model.FieldDesign;
import com.finbourne.luminesce.model.OrderByTermDesign;
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
 * Representation of a \&quot;designable Query\&quot; suitable for formatting to SQL or being built from compliant SQL.
 */
@ApiModel(description = "Representation of a \"designable Query\" suitable for formatting to SQL or being built from compliant SQL.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QueryDesign {
  public static final String SERIALIZED_NAME_TABLE_NAME = "tableName";
  @SerializedName(SERIALIZED_NAME_TABLE_NAME)
  private String tableName;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldDesign> fields = new ArrayList<>();

  public static final String SERIALIZED_NAME_ORDER_BY = "orderBy";
  @SerializedName(SERIALIZED_NAME_ORDER_BY)
  private List<OrderByTermDesign> orderBy = null;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings = null;

  public static final String SERIALIZED_NAME_AVAILABLE_FIELDS = "availableFields";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_FIELDS)
  private List<AvailableField> availableFields = null;


  public QueryDesign tableName(String tableName) {
    this.tableName = tableName; 
    return this;
  }

   /**
   * Name of the table being designed
   * @return tableName
  **/
  @ApiModelProperty(required = true, value = "Name of the table being designed")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }


  public QueryDesign alias(String alias) {
    this.alias = alias; 
    return this;
  }

   /**
   * Alias for the table in the generated SQL, if any
   * @return alias
  **/
  @ApiModelProperty(value = "Alias for the table in the generated SQL, if any")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public QueryDesign fields(List<FieldDesign> fields) {
    this.fields = fields; 
    return this;
  }

  public QueryDesign addFieldsItem(FieldDesign fieldsItem) {
   
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Fields to be selected, aggregated over and/or filtered on
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "Fields to be selected, aggregated over and/or filtered on")
  public List<FieldDesign> getFields() {
    return fields;
  }

  public void setFields(List<FieldDesign> fields) {
    this.fields = fields;
  }


  public QueryDesign orderBy(List<OrderByTermDesign> orderBy) {
    this.orderBy = orderBy; 
    return this;
  }

  public QueryDesign addOrderByItem(OrderByTermDesign orderByItem) {
   
    if (this.orderBy == null) {
      this.orderBy = new ArrayList<>();
    }
    this.orderBy.add(orderByItem);
    return this;
  }

   /**
   * Order By clauses to apply
   * @return orderBy
  **/
  @ApiModelProperty(value = "Order By clauses to apply")
  public List<OrderByTermDesign> getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(List<OrderByTermDesign> orderBy) {
    this.orderBy = orderBy;
  }


  public QueryDesign limit(Integer limit) {
    this.limit = limit; 
    return this;
  }

   /**
   * Row limit to apply, if any
   * @return limit
  **/
  @ApiModelProperty(value = "Row limit to apply, if any")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public QueryDesign warnings(List<String> warnings) {
    this.warnings = warnings; 
    return this;
  }

  public QueryDesign addWarningsItem(String warningsItem) {
   
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Any warnings to show the user when converting from SQL to this representation
   * @return warnings
  **/
  @ApiModelProperty(value = "Any warnings to show the user when converting from SQL to this representation")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  public QueryDesign availableFields(List<AvailableField> availableFields) {
    this.availableFields = availableFields; 
    return this;
  }

  public QueryDesign addAvailableFieldsItem(AvailableField availableFieldsItem) {
   
    if (this.availableFields == null) {
      this.availableFields = new ArrayList<>();
    }
    this.availableFields.add(availableFieldsItem);
    return this;
  }

   /**
   * Fields that are known to be available for design when parsing SQL
   * @return availableFields
  **/
  @ApiModelProperty(value = "Fields that are known to be available for design when parsing SQL")
  public List<AvailableField> getAvailableFields() {
    return availableFields;
  }

  public void setAvailableFields(List<AvailableField> availableFields) {
    this.availableFields = availableFields;
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
    sb.append("class QueryDesign {\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    availableFields: ").append(toIndentedString(availableFields)).append("\n");
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
