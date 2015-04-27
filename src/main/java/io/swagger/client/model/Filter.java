package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Filter  {
  
  private String term = null;
  private String facet = null;
  private String filterType = null;

  
  /**
   * The filter term, see <a href=\"api.html#filter\">Filter</a> for more information
   **/
  @ApiModelProperty(value = "The filter term, see <a href=\"api.html#filter\">Filter</a> for more information")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }

  
  /**
   * Type of filter to run, see <a href=\"api.html#facet\">Facet</a> for more information
   **/
  @ApiModelProperty(value = "Type of filter to run, see <a href=\"api.html#facet\">Facet</a> for more information")
  @JsonProperty("facet")
  public String getFacet() {
    return facet;
  }
  public void setFacet(String facet) {
    this.facet = facet;
  }

  
  /**
   * include or exclude for whether you want this filter to apply to the inclusion or exclusion criteria of a trial, however the prefered method for exclude is to add a \"-\" in front of the facet, see <a href=\"api.html#excludeFilter\">Exclude Filter</a> for more information
   **/
  @ApiModelProperty(value = "include or exclude for whether you want this filter to apply to the inclusion or exclusion criteria of a trial, however the prefered method for exclude is to add a \"-\" in front of the facet, see <a href=\"api.html#excludeFilter\">Exclude Filter</a> for more information")
  @JsonProperty("filterType")
  public String getFilterType() {
    return filterType;
  }
  public void setFilterType(String filterType) {
    this.filterType = filterType;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    
    sb.append("  term: ").append(term).append("\n");
    sb.append("  facet: ").append(facet).append("\n");
    sb.append("  filterType: ").append(filterType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
