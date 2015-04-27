package io.swagger.client.model;

import java.math.BigDecimal;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Geo  {
  
  private BigDecimal lat = null;
  private BigDecimal lon = null;

  
  /**
   * Latitude coordinates
   **/
  @ApiModelProperty(value = "Latitude coordinates")
  @JsonProperty("lat")
  public BigDecimal getLat() {
    return lat;
  }
  public void setLat(BigDecimal lat) {
    this.lat = lat;
  }

  
  /**
   * Longitude coordinates
   **/
  @ApiModelProperty(value = "Longitude coordinates")
  @JsonProperty("lon")
  public BigDecimal getLon() {
    return lon;
  }
  public void setLon(BigDecimal lon) {
    this.lon = lon;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geo {\n");
    
    sb.append("  lat: ").append(lat).append("\n");
    sb.append("  lon: ").append(lon).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
