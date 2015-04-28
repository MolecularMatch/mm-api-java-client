package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Response;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.Map;
import java.util.HashMap;

public class ProfileApi {
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
   * Refine a profile by providing facets
   * Returns a question based on the filters provided. &lt;div style=\&quot;font-weight: bolder;color: red;\&quot;&gt;Experimental&lt;/div&gt;
   * @param apiKey key provided by MolecularMatch to use the api
   * @param filters filters (see &lt;a href=\&quot;/api/api.html#filters\&quot;&gt;filters&lt;/a&gt; for more information)
   * @return Response
   */
  public Response RefineProfile (String apiKey, String filters) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/profile/refine".replaceAll("\\{format\\}","json");

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
      mp.field("filters", ApiInvoker.parameterToString(filters), MediaType.MULTIPART_FORM_DATA_TYPE);
      
      if(hasFields)
        postBody = mp;
    }
    else {
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("filters", ApiInvoker.parameterToString(filters));
      
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
