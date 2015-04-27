package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Response;
import io.swagger.client.model.SuggestionResponse;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class SearchApi {
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
   * Find trials and drugs by filters
   * Returns a set of clinical trials and drugs based on the filters provided
   * @param apiKey key provided by MolecularMatch to use the api
   * @param searchKey key provided by MolecularMatch on a previous search (instead of providing filters criteria)
   * @param filters json stringified array of filters (see &lt;a href=\&quot;/api/api.html#filters\&quot;&gt;filters&lt;/a&gt; for more information)
   * @param start start index record for trials
   * @param limit page size
   * @param geopoint optional json stringified geopoint to center a spatial search
   * @return Response
   */
  public Response Search (String apiKey, String searchKey, String filters, Integer start, Integer limit, String geopoint) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/search".replaceAll("\\{format\\}","json");

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
      mp.field("filters", ApiInvoker.parameterToString(filters), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("start", ApiInvoker.parameterToString(start), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("limit", ApiInvoker.parameterToString(limit), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("geopoint", ApiInvoker.parameterToString(geopoint), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("searchKey", ApiInvoker.parameterToString(searchKey));
      formParams.put("filters", ApiInvoker.parameterToString(filters));
      formParams.put("start", ApiInvoker.parameterToString(start));
      formParams.put("limit", ApiInvoker.parameterToString(limit));
      formParams.put("geopoint", ApiInvoker.parameterToString(geopoint));
      postBody = formParams;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Response) ApiInvoker.deserialize(response, "", Response.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Find drugs by filters
   * Returns a set of drugs based on the filters provided
   * @param apiKey key provided by MolecularMatch to use the api
   * @param searchKey key provided by MolecularMatch on a previous search (instead of providing filters criteria)
   * @param filters filters (see &lt;a href=\&quot;/api/api.html#filters\&quot;&gt;filters&lt;/a&gt; for more information)
   * @return Response
   */
  public Response SearchDrugs (String apiKey, String searchKey, String filters) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/search/drugs".replaceAll("\\{format\\}","json");

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
      mp.field("filters", ApiInvoker.parameterToString(filters), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("searchKey", ApiInvoker.parameterToString(searchKey));
      formParams.put("filters", ApiInvoker.parameterToString(filters));
      postBody = formParams;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Response) ApiInvoker.deserialize(response, "", Response.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Get auto-complete suggestions based on the passed query
   * Get auto-complete suggestions based on the passed query
   * @param apiKey key provided by MolecularMatch to use the api
   * @param query query you would like to search for
   * @param facet the facet to restrict suggestions to, CONDITION, GENE, etc.
   * @param start start index for the suggestion results being paged
   * @param limit page size
   * @return SuggestionResponse
   */
  public SuggestionResponse GetSuggestions (String apiKey, String query, String facet, Integer start, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/search/suggest".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if (apiKey != null)
      queryParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
    if (query != null)
      queryParams.put("query", ApiInvoker.parameterToString(query));
    if (facet != null)
      queryParams.put("facet", ApiInvoker.parameterToString(facet));
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
        return (SuggestionResponse) ApiInvoker.deserialize(response, "", SuggestionResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Find trials by filters
   * Returns a set of clinical trials based on the filters provided
   * @param apiKey key provided by MolecularMatch to use the api
   * @param searchKey key provided by MolecularMatch on a previous search (instead of providing filters criteria)
   * @param filters filters (see &lt;a href=\&quot;/api/api.html#filters\&quot;&gt;filters&lt;/a&gt; for more information)
   * @param start start index record for trials
   * @param limit page size
   * @param geopoint optional geopoint to center a spatial search
   * @return Response
   */
  public Response SearchTrials (String apiKey, String searchKey, String filters, Integer start, Integer limit, String geopoint) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/search/trials".replaceAll("\\{format\\}","json");

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
      mp.field("filters", ApiInvoker.parameterToString(filters), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("start", ApiInvoker.parameterToString(start), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("limit", ApiInvoker.parameterToString(limit), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      hasFields = true;
      mp.field("geopoint", ApiInvoker.parameterToString(geopoint), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("searchKey", ApiInvoker.parameterToString(searchKey));
      formParams.put("filters", ApiInvoker.parameterToString(filters));
      formParams.put("start", ApiInvoker.parameterToString(start));
      formParams.put("limit", ApiInvoker.parameterToString(limit));
      formParams.put("geopoint", ApiInvoker.parameterToString(geopoint));
      postBody = formParams;
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Response) ApiInvoker.deserialize(response, "", Response.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
