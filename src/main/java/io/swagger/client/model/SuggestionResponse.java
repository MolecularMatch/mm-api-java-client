package io.swagger.client.model;

import io.swagger.client.model.Suggestion;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class SuggestionResponse  {
  
  private Integer total = null;
  private Integer maxScore = null;
  private List<Suggestion> hits = new ArrayList<Suggestion>() ;

  
  /**
   * total number of records being returned
   **/
  @ApiModelProperty(value = "total number of records being returned")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * the highest scoring suggestion
   **/
  @ApiModelProperty(value = "the highest scoring suggestion")
  @JsonProperty("max_score")
  public Integer getMaxScore() {
    return maxScore;
  }
  public void setMaxScore(Integer maxScore) {
    this.maxScore = maxScore;
  }

  
  /**
   * list of suggestions for the user
   **/
  @ApiModelProperty(value = "list of suggestions for the user")
  @JsonProperty("hits")
  public List<Suggestion> getHits() {
    return hits;
  }
  public void setHits(List<Suggestion> hits) {
    this.hits = hits;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionResponse {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  maxScore: ").append(maxScore).append("\n");
    sb.append("  hits: ").append(hits).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
