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
import com.finbourne.luminesce.model.Aggregation;
import com.finbourne.luminesce.model.DataType;
import com.finbourne.luminesce.model.FilterTermDesign;
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
 * Treatment of a single field within a QueryDesign
 */
@ApiModel(description = "Treatment of a single field within a QueryDesign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FieldDesign {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_DATA_TYPE = "dataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataType dataType;

  public static final String SERIALIZED_NAME_SHOULD_SELECT = "shouldSelect";
  @SerializedName(SERIALIZED_NAME_SHOULD_SELECT)
  private Boolean shouldSelect;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<FilterTermDesign> filters = null;

  public static final String SERIALIZED_NAME_AGGREGATIONS = "aggregations";
  @SerializedName(SERIALIZED_NAME_AGGREGATIONS)
  private List<Aggregation> aggregations = null;


  public FieldDesign name(String name) {
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


  public FieldDesign alias(String alias) {
    this.alias = alias; 
    return this;
  }

   /**
   * Alias if any (if none the Name is used)
   * @return alias
  **/
  @ApiModelProperty(value = "Alias if any (if none the Name is used)")
  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }


  public FieldDesign dataType(DataType dataType) {
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


  public FieldDesign shouldSelect(Boolean shouldSelect) {
    this.shouldSelect = shouldSelect; 
    return this;
  }

   /**
   * Should this be selected? False would imply it is only being filtered on.  Ignored when Aggregations are present
   * @return shouldSelect
  **/
  @ApiModelProperty(value = "Should this be selected? False would imply it is only being filtered on.  Ignored when Aggregations are present")
  public Boolean getShouldSelect() {
    return shouldSelect;
  }

  public void setShouldSelect(Boolean shouldSelect) {
    this.shouldSelect = shouldSelect;
  }


  public FieldDesign filters(List<FilterTermDesign> filters) {
    this.filters = filters; 
    return this;
  }

  public FieldDesign addFiltersItem(FilterTermDesign filtersItem) {
   
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * Filter clauses to apply to this field (And&#39;ed together)
   * @return filters
  **/
  @ApiModelProperty(value = "Filter clauses to apply to this field (And'ed together)")
  public List<FilterTermDesign> getFilters() {
    return filters;
  }

  public void setFilters(List<FilterTermDesign> filters) {
    this.filters = filters;
  }


  public FieldDesign aggregations(List<Aggregation> aggregations) {
    this.aggregations = aggregations; 
    return this;
  }

  public FieldDesign addAggregationsItem(Aggregation aggregationsItem) {
   
    if (this.aggregations == null) {
      this.aggregations = new ArrayList<>();
    }
    this.aggregations.add(aggregationsItem);
    return this;
  }

   /**
   * Aggregations to apply (as opposed to simply selecting)
   * @return aggregations
  **/
  @ApiModelProperty(value = "Aggregations to apply (as opposed to simply selecting)")
  public List<Aggregation> getAggregations() {
    return aggregations;
  }

  public void setAggregations(List<Aggregation> aggregations) {
    this.aggregations = aggregations;
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
    sb.append("class FieldDesign {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    shouldSelect: ").append(toIndentedString(shouldSelect)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    aggregations: ").append(toIndentedString(aggregations)).append("\n");
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
