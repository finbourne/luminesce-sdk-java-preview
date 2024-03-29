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


import com.finbourne.luminesce.model.BackgroundMultiQueryProgressResponse;
import com.finbourne.luminesce.model.BackgroundMultiQueryResponse;
import com.finbourne.luminesce.model.BackgroundQueryCancelResponse;
import com.finbourne.luminesce.model.LusidProblemDetails;
import com.finbourne.luminesce.model.MultiQueryDefinitionType;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiQueryExecutionApi {
    private ApiClient localVarApiClient;
    public MultiQueryExecutionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MultiQueryExecutionApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for cancelMultiQuery
     * @param executionId ExecutionId returned when starting the query (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelMultiQueryCall(String executionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/MultiQueryBackground/{executionId}"
            .replaceAll("\\{" + "executionId" + "\\}", localVarApiClient.escapeString(executionId.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call cancelMultiQueryValidateBeforeCall(String executionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new ApiException("Missing the required parameter 'executionId' when calling cancelMultiQuery(Async)");
        }
        

        okhttp3.Call localVarCall = cancelMultiQueryCall(executionId, _callback);
        return localVarCall;

    }

    /**
     * CancelMultiQuery: Cancels (if running) or clears the data from (if completed) a previously started query-set
     * Cancel the query-set (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 
     * @param executionId ExecutionId returned when starting the query (required)
     * @return BackgroundQueryCancelResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public BackgroundQueryCancelResponse cancelMultiQuery(String executionId) throws ApiException {
        ApiResponse<BackgroundQueryCancelResponse> localVarResp = cancelMultiQueryWithHttpInfo(executionId);
        return localVarResp.getData();
    }

    /**
     * CancelMultiQuery: Cancels (if running) or clears the data from (if completed) a previously started query-set
     * Cancel the query-set (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 
     * @param executionId ExecutionId returned when starting the query (required)
     * @return ApiResponse&lt;BackgroundQueryCancelResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BackgroundQueryCancelResponse> cancelMultiQueryWithHttpInfo(String executionId) throws ApiException {
        okhttp3.Call localVarCall = cancelMultiQueryValidateBeforeCall(executionId, null);
        Type localVarReturnType = new TypeToken<BackgroundQueryCancelResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * CancelMultiQuery: Cancels (if running) or clears the data from (if completed) a previously started query-set (asynchronously)
     * Cancel the query-set (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 
     * @param executionId ExecutionId returned when starting the query (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call cancelMultiQueryAsync(String executionId, final ApiCallback<BackgroundQueryCancelResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = cancelMultiQueryValidateBeforeCall(executionId, _callback);
        Type localVarReturnType = new TypeToken<BackgroundQueryCancelResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProgressOfMultiQuery
     * @param executionId ExecutionId returned when starting the query (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProgressOfMultiQueryCall(String executionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/MultiQueryBackground/{executionId}"
            .replaceAll("\\{" + "executionId" + "\\}", localVarApiClient.escapeString(executionId.toString()));

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
    private okhttp3.Call getProgressOfMultiQueryValidateBeforeCall(String executionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new ApiException("Missing the required parameter 'executionId' when calling getProgressOfMultiQuery(Async)");
        }
        

        okhttp3.Call localVarCall = getProgressOfMultiQueryCall(executionId, _callback);
        return localVarCall;

    }

    /**
     * GetProgressOfMultiQuery: View progress information (up until this point) for the entire query-set
     * View progress information (up until this point) for the entire query-set The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon   1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.   1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.   1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.
     * @param executionId ExecutionId returned when starting the query (required)
     * @return BackgroundMultiQueryProgressResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public BackgroundMultiQueryProgressResponse getProgressOfMultiQuery(String executionId) throws ApiException {
        ApiResponse<BackgroundMultiQueryProgressResponse> localVarResp = getProgressOfMultiQueryWithHttpInfo(executionId);
        return localVarResp.getData();
    }

    /**
     * GetProgressOfMultiQuery: View progress information (up until this point) for the entire query-set
     * View progress information (up until this point) for the entire query-set The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon   1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.   1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.   1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.
     * @param executionId ExecutionId returned when starting the query (required)
     * @return ApiResponse&lt;BackgroundMultiQueryProgressResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BackgroundMultiQueryProgressResponse> getProgressOfMultiQueryWithHttpInfo(String executionId) throws ApiException {
        okhttp3.Call localVarCall = getProgressOfMultiQueryValidateBeforeCall(executionId, null);
        Type localVarReturnType = new TypeToken<BackgroundMultiQueryProgressResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * GetProgressOfMultiQuery: View progress information (up until this point) for the entire query-set (asynchronously)
     * View progress information (up until this point) for the entire query-set The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon   1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.   1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.   1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.
     * @param executionId ExecutionId returned when starting the query (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProgressOfMultiQueryAsync(String executionId, final ApiCallback<BackgroundMultiQueryProgressResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = getProgressOfMultiQueryValidateBeforeCall(executionId, _callback);
        Type localVarReturnType = new TypeToken<BackgroundMultiQueryProgressResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for startQueries
     * @param type An enum value defining the set of statements being executed (required)
     * @param body A \&quot;search\&quot; value (e.g. &#39;Apple&#39; on an instrument search, a &#x60;Finbourne.Filtering&#x60; expression of Insights, etc.)  In the cases where \&quot;Nothing\&quot; is valid for a &#x60;Finbourne.Filtering&#x60; expression, pass &#x60;True&#x60;. (required)
     * @param asAt The AsAt time used by any bitemporal provider in the queries. (optional)
     * @param effectiveAt The EffectiveAt time used by any bitemporal provider in the queries. (optional)
     * @param limit1 A limit that is applied to first-level queries (e.g. Instruments themselves) (optional)
     * @param limit2 A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found) (optional)
     * @param input1 A value available to queries, these vary by &#39;type&#39; and are only used by some types at all.  e.g. a start-date of some sort (optional)
     * @param input2 A second value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param input3 A third value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param timeoutSeconds Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 1200s (20m) (optional, default to 0)
     * @param keepForSeconds Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call startQueriesCall(MultiQueryDefinitionType type, String body, OffsetDateTime asAt, OffsetDateTime effectiveAt, Integer limit1, Integer limit2, String input1, String input2, String input3, Integer timeoutSeconds, Integer keepForSeconds, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/api/MultiQueryBackground";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
        }

        if (asAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asAt", asAt));
        }

        if (effectiveAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("effectiveAt", effectiveAt));
        }

        if (limit1 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit1", limit1));
        }

        if (limit2 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit2", limit2));
        }

        if (input1 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("input1", input1));
        }

        if (input2 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("input2", input2));
        }

        if (input3 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("input3", input3));
        }

        if (timeoutSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("timeoutSeconds", timeoutSeconds));
        }

        if (keepForSeconds != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("keepForSeconds", keepForSeconds));
        }

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "text/plain"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        localVarHeaderParams.put("X-LUSID-SDK-Language", "Java");
        localVarHeaderParams.put("X-LUSID-SDK-Version", "1.13.235");

        String[] localVarAuthNames = new String[] { "oauth2" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call startQueriesValidateBeforeCall(MultiQueryDefinitionType type, String body, OffsetDateTime asAt, OffsetDateTime effectiveAt, Integer limit1, Integer limit2, String input1, String input2, String input3, Integer timeoutSeconds, Integer keepForSeconds, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException("Missing the required parameter 'type' when calling startQueries(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling startQueries(Async)");
        }
        

        okhttp3.Call localVarCall = startQueriesCall(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds, _callback);
        return localVarCall;

    }

    /**
     * StartQueries: Starts to Execute the LuminesceSql statements in the background.
     *  Allow for starting a potentially long running query and getting back an immediate response with how to  - fetch the data in various formats (if available, or if not simply being informed it is not yet ready), on a per result basis - view progress information (up until this point), for all results in one go - cancel the queries (if still running) / clear the data (if already returned)  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - there was something wrong with your query syntax (the issue was detected at parse-time) - 401 Unauthorized 
     * @param type An enum value defining the set of statements being executed (required)
     * @param body A \&quot;search\&quot; value (e.g. &#39;Apple&#39; on an instrument search, a &#x60;Finbourne.Filtering&#x60; expression of Insights, etc.)  In the cases where \&quot;Nothing\&quot; is valid for a &#x60;Finbourne.Filtering&#x60; expression, pass &#x60;True&#x60;. (required)
     * @param asAt The AsAt time used by any bitemporal provider in the queries. (optional)
     * @param effectiveAt The EffectiveAt time used by any bitemporal provider in the queries. (optional)
     * @param limit1 A limit that is applied to first-level queries (e.g. Instruments themselves) (optional)
     * @param limit2 A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found) (optional)
     * @param input1 A value available to queries, these vary by &#39;type&#39; and are only used by some types at all.  e.g. a start-date of some sort (optional)
     * @param input2 A second value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param input3 A third value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param timeoutSeconds Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 1200s (20m) (optional, default to 0)
     * @param keepForSeconds Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) (optional, default to 0)
     * @return BackgroundMultiQueryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public BackgroundMultiQueryResponse startQueries(MultiQueryDefinitionType type, String body, OffsetDateTime asAt, OffsetDateTime effectiveAt, Integer limit1, Integer limit2, String input1, String input2, String input3, Integer timeoutSeconds, Integer keepForSeconds) throws ApiException {
        ApiResponse<BackgroundMultiQueryResponse> localVarResp = startQueriesWithHttpInfo(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds);
        return localVarResp.getData();
    }

    /**
     * StartQueries: Starts to Execute the LuminesceSql statements in the background.
     *  Allow for starting a potentially long running query and getting back an immediate response with how to  - fetch the data in various formats (if available, or if not simply being informed it is not yet ready), on a per result basis - view progress information (up until this point), for all results in one go - cancel the queries (if still running) / clear the data (if already returned)  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - there was something wrong with your query syntax (the issue was detected at parse-time) - 401 Unauthorized 
     * @param type An enum value defining the set of statements being executed (required)
     * @param body A \&quot;search\&quot; value (e.g. &#39;Apple&#39; on an instrument search, a &#x60;Finbourne.Filtering&#x60; expression of Insights, etc.)  In the cases where \&quot;Nothing\&quot; is valid for a &#x60;Finbourne.Filtering&#x60; expression, pass &#x60;True&#x60;. (required)
     * @param asAt The AsAt time used by any bitemporal provider in the queries. (optional)
     * @param effectiveAt The EffectiveAt time used by any bitemporal provider in the queries. (optional)
     * @param limit1 A limit that is applied to first-level queries (e.g. Instruments themselves) (optional)
     * @param limit2 A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found) (optional)
     * @param input1 A value available to queries, these vary by &#39;type&#39; and are only used by some types at all.  e.g. a start-date of some sort (optional)
     * @param input2 A second value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param input3 A third value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param timeoutSeconds Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 1200s (20m) (optional, default to 0)
     * @param keepForSeconds Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) (optional, default to 0)
     * @return ApiResponse&lt;BackgroundMultiQueryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BackgroundMultiQueryResponse> startQueriesWithHttpInfo(MultiQueryDefinitionType type, String body, OffsetDateTime asAt, OffsetDateTime effectiveAt, Integer limit1, Integer limit2, String input1, String input2, String input3, Integer timeoutSeconds, Integer keepForSeconds) throws ApiException {
        okhttp3.Call localVarCall = startQueriesValidateBeforeCall(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds, null);
        Type localVarReturnType = new TypeToken<BackgroundMultiQueryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * StartQueries: Starts to Execute the LuminesceSql statements in the background. (asynchronously)
     *  Allow for starting a potentially long running query and getting back an immediate response with how to  - fetch the data in various formats (if available, or if not simply being informed it is not yet ready), on a per result basis - view progress information (up until this point), for all results in one go - cancel the queries (if still running) / clear the data (if already returned)  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - there was something wrong with your query syntax (the issue was detected at parse-time) - 401 Unauthorized 
     * @param type An enum value defining the set of statements being executed (required)
     * @param body A \&quot;search\&quot; value (e.g. &#39;Apple&#39; on an instrument search, a &#x60;Finbourne.Filtering&#x60; expression of Insights, etc.)  In the cases where \&quot;Nothing\&quot; is valid for a &#x60;Finbourne.Filtering&#x60; expression, pass &#x60;True&#x60;. (required)
     * @param asAt The AsAt time used by any bitemporal provider in the queries. (optional)
     * @param effectiveAt The EffectiveAt time used by any bitemporal provider in the queries. (optional)
     * @param limit1 A limit that is applied to first-level queries (e.g. Instruments themselves) (optional)
     * @param limit2 A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found) (optional)
     * @param input1 A value available to queries, these vary by &#39;type&#39; and are only used by some types at all.  e.g. a start-date of some sort (optional)
     * @param input2 A second value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param input3 A third value available to queries, these vary by &#39;type&#39; and are only used by some types at all. (optional)
     * @param timeoutSeconds Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 1200s (20m) (optional, default to 0)
     * @param keepForSeconds Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call startQueriesAsync(MultiQueryDefinitionType type, String body, OffsetDateTime asAt, OffsetDateTime effectiveAt, Integer limit1, Integer limit2, String input1, String input2, String input3, Integer timeoutSeconds, Integer keepForSeconds, final ApiCallback<BackgroundMultiQueryResponse> _callback) throws ApiException {
        okhttp3.Call localVarCall = startQueriesValidateBeforeCall(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds, _callback);
        Type localVarReturnType = new TypeToken<BackgroundMultiQueryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
