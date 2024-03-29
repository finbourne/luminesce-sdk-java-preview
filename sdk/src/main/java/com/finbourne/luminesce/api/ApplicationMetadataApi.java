/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.235
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.luminesce.api;

import com.finbourne.luminesce.ApiCallback;
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.ApiResponse;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.Pair;
import com.finbourne.luminesce.ProgressRequestBody;
import com.finbourne.luminesce.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.finbourne.luminesce.model.ResourceListOfAccessControlledResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationMetadataApi {
    private ApiClient localVarApiClient;
    public ApplicationMetadataApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationMetadataApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getServicesAsAccessControlledResources
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getServicesAsAccessControlledResourcesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/metadata/access/resources";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.13.235");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getServicesAsAccessControlledResourcesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getServicesAsAccessControlledResourcesCall(_callback);
        return localVarCall;

    }

    /**
     * GetServicesAsAccessControlledResources: Get resources available for access control
     *  Get the comprehensive set of resources that are available for access control.  The following LuminesceSql is executed to return this information,  which is then packaged up as AccessControlledResource:  &#x60;&#x60;&#x60;sql select     Name,     min(coalesce(Description, Name) || &#39; (&#39; || Type || &#39;)&#39;) as Description from     Sys.Registration where     Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and     ShowAll &#x3D; true group by 1 order by 1     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @return ResourceListOfAccessControlledResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ResourceListOfAccessControlledResource getServicesAsAccessControlledResources() throws ApiException {
        ApiResponse<ResourceListOfAccessControlledResource> localVarResp = getServicesAsAccessControlledResourcesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * GetServicesAsAccessControlledResources: Get resources available for access control
     *  Get the comprehensive set of resources that are available for access control.  The following LuminesceSql is executed to return this information,  which is then packaged up as AccessControlledResource:  &#x60;&#x60;&#x60;sql select     Name,     min(coalesce(Description, Name) || &#39; (&#39; || Type || &#39;)&#39;) as Description from     Sys.Registration where     Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and     ShowAll &#x3D; true group by 1 order by 1     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @return ApiResponse&lt;ResourceListOfAccessControlledResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ResourceListOfAccessControlledResource> getServicesAsAccessControlledResourcesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getServicesAsAccessControlledResourcesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetServicesAsAccessControlledResources: Get resources available for access control (asynchronously)
     *  Get the comprehensive set of resources that are available for access control.  The following LuminesceSql is executed to return this information,  which is then packaged up as AccessControlledResource:  &#x60;&#x60;&#x60;sql select     Name,     min(coalesce(Description, Name) || &#39; (&#39; || Type || &#39;)&#39;) as Description from     Sys.Registration where     Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and     ShowAll &#x3D; true group by 1 order by 1     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getServicesAsAccessControlledResourcesAsync(final ApiCallback<ResourceListOfAccessControlledResource> _callback) throws ApiException {
        okhttp3.Call localVarCall = getServicesAsAccessControlledResourcesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ResourceListOfAccessControlledResource>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
