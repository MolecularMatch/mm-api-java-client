package io.swagger.client.model;

import io.swagger.client.model.Geo;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Location  {
  
  private String name = null;
  private String city = null;
  private String state = null;
  private String zip = null;
  private String country = null;
  private String firstName = null;
  private String lastName = null;
  private String middleName = null;
  private String phoneExt = null;
  private String phone = null;
  private String email = null;
  private String status = null;
  private Geo geo = null;

  
  /**
   * The name of the trial location
   **/
  @ApiModelProperty(value = "The name of the trial location")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * City of the location
   **/
  @ApiModelProperty(value = "City of the location")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }

  
  /**
   * State of the location
   **/
  @ApiModelProperty(value = "State of the location")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }

  
  /**
   * Zip of the location
   **/
  @ApiModelProperty(value = "Zip of the location")
  @JsonProperty("zip")
  public String getZip() {
    return zip;
  }
  public void setZip(String zip) {
    this.zip = zip;
  }

  
  /**
   * Country of the location
   **/
  @ApiModelProperty(value = "Country of the location")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * First name of the person running the trial at this location
   **/
  @ApiModelProperty(value = "First name of the person running the trial at this location")
  @JsonProperty("first_name")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * Last name of the person running the trial at this location
   **/
  @ApiModelProperty(value = "Last name of the person running the trial at this location")
  @JsonProperty("last_name")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * Middle name of the person running the trial at this location
   **/
  @ApiModelProperty(value = "Middle name of the person running the trial at this location")
  @JsonProperty("middle_name")
  public String getMiddleName() {
    return middleName;
  }
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  
  /**
   * Phone extension for the person running the trial at this location
   **/
  @ApiModelProperty(value = "Phone extension for the person running the trial at this location")
  @JsonProperty("phone_ext")
  public String getPhoneExt() {
    return phoneExt;
  }
  public void setPhoneExt(String phoneExt) {
    this.phoneExt = phoneExt;
  }

  
  /**
   * Phone number for the person running the trial at this location
   **/
  @ApiModelProperty(value = "Phone number for the person running the trial at this location")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  
  /**
   * Email address for the person running the trial at this location
   **/
  @ApiModelProperty(value = "Email address for the person running the trial at this location")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * Current enrollment status of this location
   **/
  @ApiModelProperty(value = "Current enrollment status of this location")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Geopoint information for this location
   **/
  @ApiModelProperty(value = "Geopoint information for this location")
  @JsonProperty("geo")
  public Geo getGeo() {
    return geo;
  }
  public void setGeo(Geo geo) {
    this.geo = geo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  state: ").append(state).append("\n");
    sb.append("  zip: ").append(zip).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  middleName: ").append(middleName).append("\n");
    sb.append("  phoneExt: ").append(phoneExt).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  geo: ").append(geo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
