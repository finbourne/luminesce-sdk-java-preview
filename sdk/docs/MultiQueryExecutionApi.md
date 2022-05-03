# MultiQueryExecutionApi

All URIs are relative to *https://www.lusid.com/honeycomb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelMultiQuery**](MultiQueryExecutionApi.md#cancelMultiQuery) | **DELETE** /api/MultiQueryBackground/{executionId} | [EXPERIMENTAL] CancelMultiQuery: Cancels (if running) or clears the data from (if completed) a previously started query-set
[**getProgressOfMultiQuery**](MultiQueryExecutionApi.md#getProgressOfMultiQuery) | **GET** /api/MultiQueryBackground/{executionId} | [EXPERIMENTAL] GetProgressOfMultiQuery: View progress information (up until this point) for the entire query-set
[**startQueries**](MultiQueryExecutionApi.md#startQueries) | **PUT** /api/MultiQueryBackground | [EXPERIMENTAL] StartQueries: Starts to Execute the HoneycombSql statements in the background.


<a name="cancelMultiQuery"></a>
# **cancelMultiQuery**
> BackgroundQueryCancelResponse cancelMultiQuery(executionId)

[EXPERIMENTAL] CancelMultiQuery: Cancels (if running) or clears the data from (if completed) a previously started query-set

Cancel the query-set (if still running) / clear the data (if already returned) The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MultiQueryExecutionApi apiInstance = new MultiQueryExecutionApi(defaultClient);
    String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
    try {
      BackgroundQueryCancelResponse result = apiInstance.cancelMultiQuery(executionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiQueryExecutionApi#cancelMultiQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionId** | **String**| ExecutionId returned when starting the query |

### Return type

[**BackgroundQueryCancelResponse**](BackgroundQueryCancelResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getProgressOfMultiQuery"></a>
# **getProgressOfMultiQuery**
> BackgroundMultiQueryProgressResponse getProgressOfMultiQuery(executionId)

[EXPERIMENTAL] GetProgressOfMultiQuery: View progress information (up until this point) for the entire query-set

View progress information (up until this point) for the entire query-set The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized - 404 Not Found : The requested query result doesn&#39;t exist and is not running. - 429 Too Many Requests : Please try your request again soon   1. The query has been executed successfully in the past yet the server-instance receiving this request (e.g. from a load balancer) doesn&#39;t yet have this data available.   1. By virtue of the request you have just placed this will have started to load from the persisted cache and will soon be available.   1. It is also the case that the original server-instance to process the original query is likely to already be able to service this request.

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MultiQueryExecutionApi apiInstance = new MultiQueryExecutionApi(defaultClient);
    String executionId = "executionId_example"; // String | ExecutionId returned when starting the query
    try {
      BackgroundMultiQueryProgressResponse result = apiInstance.getProgressOfMultiQuery(executionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiQueryExecutionApi#getProgressOfMultiQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionId** | **String**| ExecutionId returned when starting the query |

### Return type

[**BackgroundMultiQueryProgressResponse**](BackgroundMultiQueryProgressResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="startQueries"></a>
# **startQueries**
> BackgroundMultiQueryResponse startQueries(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds)

[EXPERIMENTAL] StartQueries: Starts to Execute the HoneycombSql statements in the background.

 Allow for starting a potentially long running query and getting back an immediate response with how to  - fetch the data in various formats (if available, or if not simply being informed it is not yet ready), on a per result basis - view progress information (up until this point), for all results in one go - cancel the queries (if still running) / clear the data (if already returned)  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - there was something wrong with your query syntax (the issue was detected at parse-time) - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.MultiQueryExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    MultiQueryExecutionApi apiInstance = new MultiQueryExecutionApi(defaultClient);
    MultiQueryDefinitionType type = MultiQueryDefinitionType.fromValue("Instrument"); // MultiQueryDefinitionType | An enum value defining the set of statements being executed
    String body = "body_example"; // String | A search value (e.g. 'Apple' on an instrument search)
    OffsetDateTime asAt = OffsetDateTime.now(); // OffsetDateTime | The AsAt time used by any bitemporal provider in the queries.
    OffsetDateTime effectiveAt = OffsetDateTime.now(); // OffsetDateTime | The EffectiveAt time used by any bitemporal provider in the queries.
    Integer limit1 = 56; // Integer | A limit that is applied to first-level queries (e.g. Instruments themselves)
    Integer limit2 = 56; // Integer | A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found)
    String input1 = "input1_example"; // String | A value available to queries, these vary by 'type' and are only used by some types at all.  e.g. a start-date of some sort
    String input2 = "input2_example"; // String | A second value available to queries, these vary by 'type' and are only used by some types at all.
    String input3 = "input3_example"; // String | A third value available to queries, these vary by 'type' and are only used by some types at all.
    Integer timeoutSeconds = 0; // Integer | Maximum time the query may run for, in seconds: <0 → ∞, 0 → 1200s (20m)
    Integer keepForSeconds = 0; // Integer | Maximum time the result may be kept for, in seconds: <0 → 1200 (20m), 0 → 28800 (8h), max = 2,678,400 (31d)
    try {
      BackgroundMultiQueryResponse result = apiInstance.startQueries(type, body, asAt, effectiveAt, limit1, limit2, input1, input2, input3, timeoutSeconds, keepForSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MultiQueryExecutionApi#startQueries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**MultiQueryDefinitionType**](.md)| An enum value defining the set of statements being executed | [enum: Instrument, Expiry, CorporateActions, GetFees, ListFees, PostTradeCompliance, EdiInstrument, EdiInstrumentWriter, Testing, MarketplaceClientLoadHistory]
 **body** | **String**| A search value (e.g. &#39;Apple&#39; on an instrument search) |
 **asAt** | **OffsetDateTime**| The AsAt time used by any bitemporal provider in the queries. | [optional]
 **effectiveAt** | **OffsetDateTime**| The EffectiveAt time used by any bitemporal provider in the queries. | [optional]
 **limit1** | **Integer**| A limit that is applied to first-level queries (e.g. Instruments themselves) | [optional]
 **limit2** | **Integer**| A limit that is applied to second-level queries (e.g. Holdings based on the set of Instruments found) | [optional]
 **input1** | **String**| A value available to queries, these vary by &#39;type&#39; and are only used by some types at all.  e.g. a start-date of some sort | [optional]
 **input2** | **String**| A second value available to queries, these vary by &#39;type&#39; and are only used by some types at all. | [optional]
 **input3** | **String**| A third value available to queries, these vary by &#39;type&#39; and are only used by some types at all. | [optional]
 **timeoutSeconds** | **Integer**| Maximum time the query may run for, in seconds: &lt;0 → ∞, 0 → 1200s (20m) | [optional] [default to 0]
 **keepForSeconds** | **Integer**| Maximum time the result may be kept for, in seconds: &lt;0 → 1200 (20m), 0 → 28800 (8h), max &#x3D; 2,678,400 (31d) | [optional] [default to 0]

### Return type

[**BackgroundMultiQueryResponse**](BackgroundMultiQueryResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Success |  -  |
**400** | Bad Request |  -  |

