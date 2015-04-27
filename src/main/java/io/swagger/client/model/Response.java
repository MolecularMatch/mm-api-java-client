package io.swagger.client.model;

import io.swagger.client.model.Drug;
import io.swagger.client.model.Trial;
import io.swagger.client.model.Filter;
import java.util.*;

import com.wordnik.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
public class Response  {
  
  private String searchKey = null;
  private List<Filter> rationalized = new ArrayList<Filter>() ;
  private Integer total = null;
  private List<Trial> trials = new ArrayList<Trial>() ;
  private List<Drug> drugs = new ArrayList<Drug>() ;
  private Integer drugsAppovedCount = null;
  private Integer drugsExperimentalCount = null;
  private List<Filter> unrecognizedTerms = new ArrayList<Filter>() ;
  private String warningMessage = null;
  private Integer totalPages = null;
  private Integer page = null;

  
  /**
   * Unique key for the search - Can be provided to retrieve an existing key or one will be generated for each response
   **/
  @ApiModelProperty(required = true, value = "Unique key for the search - Can be provided to retrieve an existing key or one will be generated for each response")
  @JsonProperty("searchKey")
  public String getSearchKey() {
    return searchKey;
  }
  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }

  
  /**
   * Mapping of provided filter terms to recognized terms within our system
   **/
  @ApiModelProperty(value = "Mapping of provided filter terms to recognized terms within our system")
  @JsonProperty("rationalized")
  public List<Filter> getRationalized() {
    return rationalized;
  }
  public void setRationalized(List<Filter> rationalized) {
    this.rationalized = rationalized;
  }

  
  /**
   * Total number of trials in the system with the provided filter criteria
   **/
  @ApiModelProperty(value = "Total number of trials in the system with the provided filter criteria")
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }
  public void setTotal(Integer total) {
    this.total = total;
  }

  
  /**
   * List of trials returned by the search
   **/
  @ApiModelProperty(value = "List of trials returned by the search")
  @JsonProperty("trials")
  public List<Trial> getTrials() {
    return trials;
  }
  public void setTrials(List<Trial> trials) {
    this.trials = trials;
  }

  
  /**
   * List of drugs returned by the search
   **/
  @ApiModelProperty(value = "List of drugs returned by the search")
  @JsonProperty("drugs")
  public List<Drug> getDrugs() {
    return drugs;
  }
  public void setDrugs(List<Drug> drugs) {
    this.drugs = drugs;
  }

  
  /**
   * The count of approved drugs in the drugs array
   **/
  @ApiModelProperty(value = "The count of approved drugs in the drugs array")
  @JsonProperty("drugsAppovedCount")
  public Integer getDrugsAppovedCount() {
    return drugsAppovedCount;
  }
  public void setDrugsAppovedCount(Integer drugsAppovedCount) {
    this.drugsAppovedCount = drugsAppovedCount;
  }

  
  /**
   * The count of experimental drugs in the drugs array
   **/
  @ApiModelProperty(value = "The count of experimental drugs in the drugs array")
  @JsonProperty("drugsExperimentalCount")
  public Integer getDrugsExperimentalCount() {
    return drugsExperimentalCount;
  }
  public void setDrugsExperimentalCount(Integer drugsExperimentalCount) {
    this.drugsExperimentalCount = drugsExperimentalCount;
  }

  
  /**
   * List of filters that were not recognized by our system
   **/
  @ApiModelProperty(value = "List of filters that were not recognized by our system")
  @JsonProperty("unrecognizedTerms")
  public List<Filter> getUnrecognizedTerms() {
    return unrecognizedTerms;
  }
  public void setUnrecognizedTerms(List<Filter> unrecognizedTerms) {
    this.unrecognizedTerms = unrecognizedTerms;
  }

  
  /**
   * Message indicating how many terms were unrecognized
   **/
  @ApiModelProperty(value = "Message indicating how many terms were unrecognized")
  @JsonProperty("warningMessage")
  public String getWarningMessage() {
    return warningMessage;
  }
  public void setWarningMessage(String warningMessage) {
    this.warningMessage = warningMessage;
  }

  
  /**
   * Number of total pages in the result set
   **/
  @ApiModelProperty(value = "Number of total pages in the result set")
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  
  /**
   * Current page that you requested
   **/
  @ApiModelProperty(value = "Current page that you requested")
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  public void setPage(Integer page) {
    this.page = page;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("  searchKey: ").append(searchKey).append("\n");
    sb.append("  rationalized: ").append(rationalized).append("\n");
    sb.append("  total: ").append(total).append("\n");
    sb.append("  trials: ").append(trials).append("\n");
    sb.append("  drugs: ").append(drugs).append("\n");
    sb.append("  drugsAppovedCount: ").append(drugsAppovedCount).append("\n");
    sb.append("  drugsExperimentalCount: ").append(drugsExperimentalCount).append("\n");
    sb.append("  unrecognizedTerms: ").append(unrecognizedTerms).append("\n");
    sb.append("  warningMessage: ").append(warningMessage).append("\n");
    sb.append("  totalPages: ").append(totalPages).append("\n");
    sb.append("  page: ").append(page).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
