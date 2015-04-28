package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Feedback  {
  
  private String apiKey = null;

  
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

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    
    sb.append("  apiKey: ").append(apiKey).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
