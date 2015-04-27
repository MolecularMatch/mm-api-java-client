package io.swagger.client.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Tag  {
  
  private String term = null;
  private String filterType = null;
  private String facet = null;
  private BigDecimal priority = null;

  
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

  
  /**
   * The domain that this tag is associated with, see <a href=\"api.html#facet\">facet types</a> for more information
   **/
  @ApiModelProperty(value = "The domain that this tag is associated with, see <a href=\"api.html#facet\">facet types</a> for more information")
  @JsonProperty("facet")
  public String getFacet() {
    return facet;
  }
  public void setFacet(String facet) {
    this.facet = facet;
  }

  
  /**
   * Relevance of the tag with 1 being the best and higher numbers being lower relevance.  0 means that tag was inferred by another tag.
   **/
  @ApiModelProperty(value = "Relevance of the tag with 1 being the best and higher numbers being lower relevance.  0 means that tag was inferred by another tag.")
  @JsonProperty("priority")
  public BigDecimal getPriority() {
    return priority;
  }
  public void setPriority(BigDecimal priority) {
    this.priority = priority;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("  term: ").append(term).append("\n");
    sb.append("  filterType: ").append(filterType).append("\n");
    sb.append("  facet: ").append(facet).append("\n");
    sb.append("  priority: ").append(priority).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
