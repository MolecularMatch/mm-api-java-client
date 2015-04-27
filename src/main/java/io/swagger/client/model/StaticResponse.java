package io.swagger.client.model;

import io.swagger.client.model.Filter;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class StaticResponse  {
  
  private Integer total = null;
  private List<Filter> rows = new ArrayList<Filter>() ;

  
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
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("rows")
  public List<Filter> getRows() {
    return rows;
  }
  public void setRows(List<Filter> rows) {
    this.rows = rows;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticResponse {\n");
    
    sb.append("  total: ").append(total).append("\n");
    sb.append("  rows: ").append(rows).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
