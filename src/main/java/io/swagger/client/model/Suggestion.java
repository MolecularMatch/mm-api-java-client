package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Suggestion  {
  
  private String term = null;
  private String alias = null;

  
  /**
   * term the user is looking for
   **/
  @ApiModelProperty(value = "term the user is looking for")
  @JsonProperty("term")
  public String getTerm() {
    return term;
  }
  public void setTerm(String term) {
    this.term = term;
  }

  
  /**
   * alias of the term the user might be looking for
   **/
  @ApiModelProperty(value = "alias of the term the user might be looking for")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suggestion {\n");
    
    sb.append("  term: ").append(term).append("\n");
    sb.append("  alias: ").append(alias).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
