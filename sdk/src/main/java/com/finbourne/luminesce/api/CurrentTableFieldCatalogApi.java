/*
 * FINBOURNE Luminesce Web API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.13.202
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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrentTableFieldCatalogApi {
    private ApiClient localVarApiClient;
    public CurrentTableFieldCatalogApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrentTableFieldCatalogApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCatalog
     * @param freeTextSearch Limit the catalog to only things in some way dealing with the passed in text string (optional)
     * @param jsonProper Should this be text/json (not json-encoded-as-a-string) (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCatalogCall(String freeTextSearch, Boolean jsonProper, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/Catalog";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (freeTextSearch != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("freeTextSearch", freeTextSearch));
        }

        if (jsonProper != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("jsonProper", jsonProper));
        }

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
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.13.202");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCatalogValidateBeforeCall(String freeTextSearch, Boolean jsonProper, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getCatalogCall(freeTextSearch, jsonProper, _callback);
        return localVarCall;

    }

    /**
     * GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)
     *  The following LuminesceSql is executed to return this information:  &#x60;&#x60;&#x60;sql @reg &#x3D; select     Name,     min(Description) as Description,     min(DocumentationLink) as DocumentationLink,     iif(Category &#x3D; &#39;View&#39; and Client is not null, true, false) as IsView from     Sys.Registration where     Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and      ShowAll &#x3D; false group by     1     ;  @fld &#x3D; select     TableName,     FieldName,     DataType,     FieldType,     IsPrimaryKey,     IsMain,     Description,     ParamDefaultValue,     TableParamColumns from     Sys.Field     ;  @x &#x3D; select     coalesce(f.TableName, r.Name) as TableName,     coalesce(f.FieldName, &#39;N/A&#39;) as FieldName,     f.DataType,     f.FieldType,     f.IsPrimaryKey,     f.IsMain,     case          when f.TableName is not null then             f.Description         else             r.Name || &#39; returns a different set of columns depending on use.&#39;         end as Description,     f.ParamDefaultValue,     f.TableParamColumns,     r.Description as ProviderDescription,     r.DocumentationLink,     r.IsView from     @reg r     left outer join @fld f         on r.Name &#x3D; f.TableName order by     1, 5 desc, 6 desc, 2     ;     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @param freeTextSearch Limit the catalog to only things in some way dealing with the passed in text string (optional)
     * @param jsonProper Should this be text/json (not json-encoded-as-a-string) (optional, default to false)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public String getCatalog(String freeTextSearch, Boolean jsonProper) throws ApiException {
        ApiResponse<String> localVarResp = getCatalogWithHttpInfo(freeTextSearch, jsonProper);
        return localVarResp.getData();
    }

    /**
     * GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)
     *  The following LuminesceSql is executed to return this information:  &#x60;&#x60;&#x60;sql @reg &#x3D; select     Name,     min(Description) as Description,     min(DocumentationLink) as DocumentationLink,     iif(Category &#x3D; &#39;View&#39; and Client is not null, true, false) as IsView from     Sys.Registration where     Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and      ShowAll &#x3D; false group by     1     ;  @fld &#x3D; select     TableName,     FieldName,     DataType,     FieldType,     IsPrimaryKey,     IsMain,     Description,     ParamDefaultValue,     TableParamColumns from     Sys.Field     ;  @x &#x3D; select     coalesce(f.TableName, r.Name) as TableName,     coalesce(f.FieldName, &#39;N/A&#39;) as FieldName,     f.DataType,     f.FieldType,     f.IsPrimaryKey,     f.IsMain,     case          when f.TableName is not null then             f.Description         else             r.Name || &#39; returns a different set of columns depending on use.&#39;         end as Description,     f.ParamDefaultValue,     f.TableParamColumns,     r.Description as ProviderDescription,     r.DocumentationLink,     r.IsView from     @reg r     left outer join @fld f         on r.Name &#x3D; f.TableName order by     1, 5 desc, 6 desc, 2     ;     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @param freeTextSearch Limit the catalog to only things in some way dealing with the passed in text string (optional)
     * @param jsonProper Should this be text/json (not json-encoded-as-a-string) (optional, default to false)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getCatalogWithHttpInfo(String freeTextSearch, Boolean jsonProper) throws ApiException {
        okhttp3.Call localVarCall = getCatalogValidateBeforeCall(freeTextSearch, jsonProper, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format) (asynchronously)
     *  The following LuminesceSql is executed to return this information:  &#x60;&#x60;&#x60;sql @reg &#x3D; select     Name,     min(Description) as Description,     min(DocumentationLink) as DocumentationLink,     iif(Category &#x3D; &#39;View&#39; and Client is not null, true, false) as IsView from     Sys.Registration where     Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and      ShowAll &#x3D; false group by     1     ;  @fld &#x3D; select     TableName,     FieldName,     DataType,     FieldType,     IsPrimaryKey,     IsMain,     Description,     ParamDefaultValue,     TableParamColumns from     Sys.Field     ;  @x &#x3D; select     coalesce(f.TableName, r.Name) as TableName,     coalesce(f.FieldName, &#39;N/A&#39;) as FieldName,     f.DataType,     f.FieldType,     f.IsPrimaryKey,     f.IsMain,     case          when f.TableName is not null then             f.Description         else             r.Name || &#39; returns a different set of columns depending on use.&#39;         end as Description,     f.ParamDefaultValue,     f.TableParamColumns,     r.Description as ProviderDescription,     r.DocumentationLink,     r.IsView from     @reg r     left outer join @fld f         on r.Name &#x3D; f.TableName order by     1, 5 desc, 6 desc, 2     ;     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 
     * @param freeTextSearch Limit the catalog to only things in some way dealing with the passed in text string (optional)
     * @param jsonProper Should this be text/json (not json-encoded-as-a-string) (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCatalogAsync(String freeTextSearch, Boolean jsonProper, final ApiCallback<String> _callback) throws ApiException {
        okhttp3.Call localVarCall = getCatalogValidateBeforeCall(freeTextSearch, jsonProper, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
