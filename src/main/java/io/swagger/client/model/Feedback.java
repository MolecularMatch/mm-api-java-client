package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Feedback  {
  
  private String apiKey = null;
  private String searchKey = null;
  private String drugId = null;
  private String reason = null;
  private String message = null;
  private String url = null;

  
  /**
   * the key that was used to submit the feedback
   **/
  @ApiModelProperty(value = "the key that was used to submit the feedback")
  @JsonProperty("apiKey")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  
  /**
   * the search key that was provided while reporting the feedback
   **/
  @ApiModelProperty(value = "the search key that was provided while reporting the feedback")
  @JsonProperty("searchKey")
  public String getSearchKey() {
    return searchKey;
  }
  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }

  
  /**
   * the id of the drug that was being reported
   **/
  @ApiModelProperty(value = "the id of the drug that was being reported")
  @JsonProperty("drugId")
  public String getDrugId() {
    return drugId;
  }
  public void setDrugId(String drugId) {
    this.drugId = drugId;
  }

  
  /**
   * pre defined reason for categorizing the problem [Other, Currently Closed, Irrelevant, Out of Order - Move Down, Out of Order - Move Up, Wrong Mutation, Wrong Tumor Type]
   **/
  @ApiModelProperty(value = "pre defined reason for categorizing the problem [Other, Currently Closed, Irrelevant, Out of Order - Move Down, Out of Order - Move Up, Wrong Mutation, Wrong Tumor Type]")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }

  
  /**
   * detailed message for the incident being created
   **/
  @ApiModelProperty(value = "detailed message for the incident being created")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * url to reproduce the search results
   **/
  @ApiModelProperty(value = "url to reproduce the search results")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    
    sb.append("  apiKey: ").append(apiKey).append("\n");
    sb.append("  searchKey: ").append(searchKey).append("\n");
    sb.append("  drugId: ").append(drugId).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
