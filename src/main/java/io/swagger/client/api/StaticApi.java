package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.StaticResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class StaticApi {
  String basePath = "https://api.molecularmatch.com/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get the valid value list of cities
   * Get the valid value list of cities
   * @param apiKey key provided by MolecularMatch to use the api
   * @param start start index record
   * @param limit page size
   * @return StaticResponse
   */
  public StaticResponse GetCities (String apiKey, Integer start, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/cities".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    if (start != null)
      queryParams.put("start", ApiInvoker.parameterToString(start));
    if (limit != null)
      queryParams.put("limit", ApiInvoker.parameterToString(limit));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of countries
   * Get the valid value list of countries
   * @param apiKey key provided by MolecularMatch to use the api
   * @param start start index record
   * @param limit page size
   * @return StaticResponse
   */
  public StaticResponse GetCountries (String apiKey, Integer start, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/countries".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    if (start != null)
      queryParams.put("start", ApiInvoker.parameterToString(start));
    if (limit != null)
      queryParams.put("limit", ApiInvoker.parameterToString(limit));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of ECOGs
   * Get the valid value list of ECOGs
   * @param apiKey key provided by MolecularMatch to use the api
   * @return StaticResponse
   */
  public StaticResponse GetECOGs (String apiKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/ecog".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of genders
   * Get the valid value list of genders
   * @param apiKey key provided by MolecularMatch to use the api
   * @return StaticResponse
   */
  public StaticResponse GetGenders (String apiKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/gender".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of stages
   * Get the valid value list of stages
   * @param apiKey key provided by MolecularMatch to use the api
   * @return StaticResponse
   */
  public StaticResponse GetStages (String apiKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/stage".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of states
   * Get the valid value list of states
   * @param apiKey key provided by MolecularMatch to use the api
   * @param start start index record
   * @param limit page size
   * @return StaticResponse
   */
  public StaticResponse GetStates (String apiKey, Integer start, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/states".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    if (start != null)
      queryParams.put("start", ApiInvoker.parameterToString(start));
    if (limit != null)
      queryParams.put("limit", ApiInvoker.parameterToString(limit));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of Trial Phases
   * Get the valid value list of Trial Phases
   * @param apiKey key provided by MolecularMatch to use the api
   * @return StaticResponse
   */
  public StaticResponse GetPhases (String apiKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/trialphase".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of Trial Statuses
   * Get the valid value list of Trial Statuses
   * @param apiKey key provided by MolecularMatch to use the api
   * @return StaticResponse
   */
  public StaticResponse GetStatuses (String apiKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/trialstatus".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get the valid value list of Trial Types
   * Get the valid value list of Trial Types
   * @param apiKey key provided by MolecularMatch to use the api
   * @return StaticResponse
   */
  public StaticResponse GetTrialTypes (String apiKey) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/static/trialtype".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      if(hasFields)
        postBody = mp;
    }
    else {
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StaticResponse) ApiInvoker.deserialize(response, "", StaticResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
