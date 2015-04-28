package io.swagger.client.model;

import io.swagger.client.model.Feedback;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class FeedbackResponse  {
  
  private String id = null;
  private String message = null;
  private Boolean success = null;
  private Feedback data = null;

  
  /**
   * id of the feedback incident
   **/
  @ApiModelProperty(value = "id of the feedback incident")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * message from the server
   **/
  @ApiModelProperty(value = "message from the server")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * true if the request was successful, false otherwise
   **/
  @ApiModelProperty(value = "true if the request was successful, false otherwise")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public Feedback getData() {
    return data;
  }
  public void setData(Feedback data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  success: ").append(success).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
