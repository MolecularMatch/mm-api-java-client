package io.swagger.client.model;

import io.swagger.client.model.Locations;
import java.util.*;
import io.swagger.client.model.Tag;
import io.swagger.client.model.Contact;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Trial  {
  
  private String id = null;
  private String briefTitle = null;
  private List<Locations> locations = new ArrayList<Locations>() ;
  private Contact overallContact = null;
  private String phase = null;
  private String startDate = null;
  private String status = null;
  private String studyType = null;
  private String title = null;
  private List<String> phases = new ArrayList<String>() ;
  private List<Tag> tags = new ArrayList<Tag>() ;

  
  /**
   * ID of the trial
   **/
  @ApiModelProperty(required = true, value = "ID of the trial")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Summary information of the trial
   **/
  @ApiModelProperty(value = "Summary information of the trial")
  @JsonProperty("briefTitle")
  public String getBriefTitle() {
    return briefTitle;
  }
  public void setBriefTitle(String briefTitle) {
    this.briefTitle = briefTitle;
  }

  
  /**
   * Information about the locations for the trial
   **/
  @ApiModelProperty(value = "Information about the locations for the trial")
  @JsonProperty("locations")
  public List<Locations> getLocations() {
    return locations;
  }
  public void setLocations(List<Locations> locations) {
    this.locations = locations;
  }

  
  /**
   * Contact information for the trial
   **/
  @ApiModelProperty(value = "Contact information for the trial")
  @JsonProperty("overallContact")
  public Contact getOverallContact() {
    return overallContact;
  }
  public void setOverallContact(Contact overallContact) {
    this.overallContact = overallContact;
  }

  
  /**
   * Phase of the trial, see <a href=\"api.html#PHASE\">Phase</a> for more information
   **/
  @ApiModelProperty(value = "Phase of the trial, see <a href=\"api.html#PHASE\">Phase</a> for more information")
  @JsonProperty("phase")
  public String getPhase() {
    return phase;
  }
  public void setPhase(String phase) {
    this.phase = phase;
  }

  
  /**
   * Starting date of the trial
   **/
  @ApiModelProperty(value = "Starting date of the trial")
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  
  /**
   * Status of the trial, see <a href=\"api.html#STATUS\">Status</a> for more information
   **/
  @ApiModelProperty(value = "Status of the trial, see <a href=\"api.html#STATUS\">Status</a> for more information")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The trial study type, see <a href=\"api.html#TRIALTYPE\">Trial Type</a> for more information
   **/
  @ApiModelProperty(value = "The trial study type, see <a href=\"api.html#TRIALTYPE\">Trial Type</a> for more information")
  @JsonProperty("studyType")
  public String getStudyType() {
    return studyType;
  }
  public void setStudyType(String studyType) {
    this.studyType = studyType;
  }

  
  /**
   * Title of the trial
   **/
  @ApiModelProperty(value = "Title of the trial")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Array of phases parsed out cleanly, so a Phase I/II will have [\"Phase 1\", \"Phase 2\"] which makes it easier to display
   **/
  @ApiModelProperty(value = "Array of phases parsed out cleanly, so a Phase I/II will have [\"Phase 1\", \"Phase 2\"] which makes it easier to display")
  @JsonProperty("phases")
  public List<String> getPhases() {
    return phases;
  }
  public void setPhases(List<String> phases) {
    this.phases = phases;
  }

  
  /**
   * List of tags for the trial
   **/
  @ApiModelProperty(value = "List of tags for the trial")
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trial {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  briefTitle: ").append(briefTitle).append("\n");
    sb.append("  locations: ").append(locations).append("\n");
    sb.append("  overallContact: ").append(overallContact).append("\n");
    sb.append("  phase: ").append(phase).append("\n");
    sb.append("  startDate: ").append(startDate).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  studyType: ").append(studyType).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  phases: ").append(phases).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
