package io.swagger.client.model;

import io.swagger.client.model.Brand;
import java.util.*;
import io.swagger.client.model.DrugSynonym;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Drug  {
  
  private String id = null;
  private Boolean approved = null;
  private List<Brand> brands = new ArrayList<Brand>() ;
  private String description = null;
  private String name = null;
  private List<String> molecularTargets = new ArrayList<String>() ;
  private List<String> approvedConditions = new ArrayList<String>() ;
  private String badge = null;
  private Boolean experimental = null;
  private List<DrugSynonym> synonyms = new ArrayList<DrugSynonym>() ;
  private Boolean targeted = null;
  private String status = null;

  
  /**
   * ID of the drug
   **/
  @ApiModelProperty(required = true, value = "ID of the drug")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Whether the drug is FDA approved or not
   **/
  @ApiModelProperty(value = "Whether the drug is FDA approved or not")
  @JsonProperty("approved")
  public Boolean getApproved() {
    return approved;
  }
  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  
  /**
   * List of brand names for the drug
   **/
  @ApiModelProperty(value = "List of brand names for the drug")
  @JsonProperty("brands")
  public List<Brand> getBrands() {
    return brands;
  }
  public void setBrands(List<Brand> brands) {
    this.brands = brands;
  }

  
  /**
   * Description of the drug
   **/
  @ApiModelProperty(value = "Description of the drug")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Generic name of the drug
   **/
  @ApiModelProperty(required = true, value = "Generic name of the drug")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * List of Molecular targets that the drug is approved to target
   **/
  @ApiModelProperty(value = "List of Molecular targets that the drug is approved to target")
  @JsonProperty("molecularTargets")
  public List<String> getMolecularTargets() {
    return molecularTargets;
  }
  public void setMolecularTargets(List<String> molecularTargets) {
    this.molecularTargets = molecularTargets;
  }

  
  /**
   * List of Conditions the drug is approved to treat
   **/
  @ApiModelProperty(value = "List of Conditions the drug is approved to treat")
  @JsonProperty("approvedConditions")
  public List<String> getApprovedConditions() {
    return approvedConditions;
  }
  public void setApprovedConditions(List<String> approvedConditions) {
    this.approvedConditions = approvedConditions;
  }

  
  /**
   * Gold/Silver/Broze indicates confidence (high/medium/low) in the drug being appropriate for your search.
   **/
  @ApiModelProperty(value = "Gold/Silver/Broze indicates confidence (high/medium/low) in the drug being appropriate for your search.")
  @JsonProperty("badge")
  public String getBadge() {
    return badge;
  }
  public void setBadge(String badge) {
    this.badge = badge;
  }

  
  /**
   * Experimental for drugs that have not been FDA approved yet
   **/
  @ApiModelProperty(value = "Experimental for drugs that have not been FDA approved yet")
  @JsonProperty("experimental")
  public Boolean getExperimental() {
    return experimental;
  }
  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }

  
  /**
   * List of other names for this drug which may include experimental or developmental drug names
   **/
  @ApiModelProperty(value = "List of other names for this drug which may include experimental or developmental drug names")
  @JsonProperty("synonyms")
  public List<DrugSynonym> getSynonyms() {
    return synonyms;
  }
  public void setSynonyms(List<DrugSynonym> synonyms) {
    this.synonyms = synonyms;
  }

  
  /**
   * Whether the drug is a targeted therapy vs a chemotherapy
   **/
  @ApiModelProperty(value = "Whether the drug is a targeted therapy vs a chemotherapy")
  @JsonProperty("targeted")
  public Boolean getTargeted() {
    return targeted;
  }
  public void setTargeted(Boolean targeted) {
    this.targeted = targeted;
  }

  
  /**
   * Approved for FDA approved drugs or Experimental for drugs that have not been FDA approved yet
   **/
  @ApiModelProperty(value = "Approved for FDA approved drugs or Experimental for drugs that have not been FDA approved yet")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drug {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  approved: ").append(approved).append("\n");
    sb.append("  brands: ").append(brands).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  molecularTargets: ").append(molecularTargets).append("\n");
    sb.append("  approvedConditions: ").append(approvedConditions).append("\n");
    sb.append("  badge: ").append(badge).append("\n");
    sb.append("  experimental: ").append(experimental).append("\n");
    sb.append("  synonyms: ").append(synonyms).append("\n");
    sb.append("  targeted: ").append(targeted).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
