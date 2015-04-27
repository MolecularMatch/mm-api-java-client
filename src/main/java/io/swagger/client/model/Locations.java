package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.client.model.Location;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Locations  {
  
  private Boolean us = null;
  private Boolean intl = null;
  private Integer count = null;
  private Integer recruitingCount = null;
  private BigDecimal nearestLocationDistance = null;
  private Location nearestLocation = null;

  
  /**
   * Whether the trial has a United States location or not
   **/
  @ApiModelProperty(value = "Whether the trial has a United States location or not")
  @JsonProperty("us")
  public Boolean getUs() {
    return us;
  }
  public void setUs(Boolean us) {
    this.us = us;
  }

  
  /**
   * Whether the trial has an international location or not
   **/
  @ApiModelProperty(value = "Whether the trial has an international location or not")
  @JsonProperty("intl")
  public Boolean getIntl() {
    return intl;
  }
  public void setIntl(Boolean intl) {
    this.intl = intl;
  }

  
  /**
   * Number of locations participating in the trial
   **/
  @ApiModelProperty(value = "Number of locations participating in the trial")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   * Number of locations for this trial that are currently recruiting
   **/
  @ApiModelProperty(value = "Number of locations for this trial that are currently recruiting")
  @JsonProperty("recruitingCount")
  public Integer getRecruitingCount() {
    return recruitingCount;
  }
  public void setRecruitingCount(Integer recruitingCount) {
    this.recruitingCount = recruitingCount;
  }

  
  /**
   * Distance to the nearest location given the geopoint information provided
   **/
  @ApiModelProperty(value = "Distance to the nearest location given the geopoint information provided")
  @JsonProperty("nearestLocationDistance")
  public BigDecimal getNearestLocationDistance() {
    return nearestLocationDistance;
  }
  public void setNearestLocationDistance(BigDecimal nearestLocationDistance) {
    this.nearestLocationDistance = nearestLocationDistance;
  }

  
  /**
   * Information about the nearest location based on the provided geopoint information
   **/
  @ApiModelProperty(value = "Information about the nearest location based on the provided geopoint information")
  @JsonProperty("nearestLocation")
  public Location getNearestLocation() {
    return nearestLocation;
  }
  public void setNearestLocation(Location nearestLocation) {
    this.nearestLocation = nearestLocation;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Locations {\n");
    
    sb.append("  us: ").append(us).append("\n");
    sb.append("  intl: ").append(intl).append("\n");
    sb.append("  count: ").append(count).append("\n");
    sb.append("  recruitingCount: ").append(recruitingCount).append("\n");
    sb.append("  nearestLocationDistance: ").append(nearestLocationDistance).append("\n");
    sb.append("  nearestLocation: ").append(nearestLocation).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
