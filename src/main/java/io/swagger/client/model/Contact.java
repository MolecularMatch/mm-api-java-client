package io.swagger.client.model;


import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Contact  {
  
  private String firstName = null;
  private String lastName = null;
  private String middleName = null;
  private String phoneExt = null;
  private String phone = null;
  private String email = null;

  
  /**
   * First name of the contact
   **/
  @ApiModelProperty(value = "First name of the contact")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Last name of the contact
   **/
  @ApiModelProperty(value = "Last name of the contact")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Middle name of the contact
   **/
  @ApiModelProperty(value = "Middle name of the contact")
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * Phone number extension
   **/
  @ApiModelProperty(value = "Phone number extension")
  @JsonProperty("phone_ext")
  public String getPhoneExt() {
    return phoneExt;
  }
  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  
  /**
   * Phone number for the contact
   **/
  @ApiModelProperty(value = "Phone number for the contact")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Email for the contact
   **/
  @ApiModelProperty(value = "Email for the contact")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  middleName: ").append(middleName).append("\n");
    sb.append("  phoneExt: ").append(phoneExt).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
