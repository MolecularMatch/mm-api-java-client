package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;


import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class FeedbackApi {
  String basePath = "http://127.0.0.1:3000/v1";
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
   * Report problems with drug results
   * Report a problem with a drug based on a previous search
   * @param apiKey key provided by MolecularMatch to use the api
   * @param searchKey key provided by MolecularMatch on a previous search
   * @param drugId id of the drug that was in error
   * @param reason the reason the drug was in error
   * @param message optional message to explain why the drug was in error
   * @return void
   */
  public void ReportDrugProblem (String apiKey, String searchKey, String drugId, String reason, String message) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/feedback/drug".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      hasFields = true;
      mp.field("apiKey", ApiInvoker.parameterToString(apiKey), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("searchKey", ApiInvoker.parameterToString(searchKey), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("drugId", ApiInvoker.parameterToString(drugId), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("reason", ApiInvoker.parameterToString(reason), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("message", ApiInvoker.parameterToString(message), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("searchKey", ApiInvoker.parameterToString(searchKey));
      formParams.put("drugId", ApiInvoker.parameterToString(drugId));
      formParams.put("reason", ApiInvoker.parameterToString(reason));
      formParams.put("message", ApiInvoker.parameterToString(message));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get a reported problem
   * Get a reported problem
   * @param apiKey key provided by MolecularMatch to use the api
   * @param id id provided by MolecularMatch on a previous report problem call
   * @return void
   */
  public void GetProblem (String apiKey, String id) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/feedback/get".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    if (id != null)
      queryParams.put("id", ApiInvoker.parameterToString(id));
    
    
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
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Report problems with clinical trial results
   * Report a problem with a clinical trial based on a previous search
   * @param apiKey key provided by MolecularMatch to use the api
   * @param searchKey key provided by MolecularMatch on a previous search
   * @param trialId id of the trial that was in error
   * @param reason the reason the trial was in error
   * @param message optional message to explain why the trial was in error
   * @return void
   */
  public void ReportTrialProblem (String apiKey, String searchKey, String trialId, String reason, String message) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/feedback/trial".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      hasFields = true;
      mp.field("apiKey", ApiInvoker.parameterToString(apiKey), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("searchKey", ApiInvoker.parameterToString(searchKey), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("trialId", ApiInvoker.parameterToString(trialId), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("reason", ApiInvoker.parameterToString(reason), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("message", ApiInvoker.parameterToString(message), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("searchKey", ApiInvoker.parameterToString(searchKey));
      formParams.put("trialId", ApiInvoker.parameterToString(trialId));
      formParams.put("reason", ApiInvoker.parameterToString(reason));
      formParams.put("message", ApiInvoker.parameterToString(message));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update a reported problem
   * Update a reported problem
   * @param apiKey key provided by MolecularMatch to use the api
   * @param id id provided by MolecularMatch on a previous report problem call
   * @param reason the reason the trial was in error
   * @param message optional message to explain why the trial was in error
   * @return void
   */
  public void PutProblem (String apiKey, String id, String reason, String message) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/feedback/update".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    
    
    String[] contentTypes = {
      
    };

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      
      hasFields = true;
      mp.field("apiKey", ApiInvoker.parameterToString(apiKey), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("id", ApiInvoker.parameterToString(id), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("reason", ApiInvoker.parameterToString(reason), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("message", ApiInvoker.parameterToString(message), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("id", ApiInvoker.parameterToString(id));
      formParams.put("reason", ApiInvoker.parameterToString(reason));
      formParams.put("message", ApiInvoker.parameterToString(message));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
