# SqlExecutionApi

All URIs are relative to *https://www.lusid.com/honeycomb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getByQueryCsv**](SqlExecutionApi.md#getByQueryCsv) | **GET** /api/Sql/csv/{query} | GetByQueryCsv: Executes Sql, returned in CSV format, where the sql is simply in the url.
[**getByQueryExcel**](SqlExecutionApi.md#getByQueryExcel) | **GET** /api/Sql/excel/{query} | GetByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded) format, where the sql is simply in the url.
[**getByQueryJson**](SqlExecutionApi.md#getByQueryJson) | **GET** /api/Sql/json/{query} | GetByQueryJson: Executes Sql, returned in JSON format, where the sql is simply in the url.
[**getByQueryParquet**](SqlExecutionApi.md#getByQueryParquet) | **GET** /api/Sql/parquet/{query} | GetByQueryParquet: Executes Sql, returned in Parquet (.parquet) format (as a file to be downloaded) format, where the sql is simply in the url.
[**getByQueryPipe**](SqlExecutionApi.md#getByQueryPipe) | **GET** /api/Sql/pipe/{query} | GetByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is simply in the url.
[**getByQuerySqlite**](SqlExecutionApi.md#getByQuerySqlite) | **GET** /api/Sql/sqlite/{query} | GetByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded) format, where the sql is simply in the url.
[**getByQueryXml**](SqlExecutionApi.md#getByQueryXml) | **GET** /api/Sql/xml/{query} | GetByQueryXml: Executes Sql, returned in Xml format, where the sql is simply in the url.
[**putByQueryCsv**](SqlExecutionApi.md#putByQueryCsv) | **PUT** /api/Sql/csv | PutByQueryCsv: Executes Sql, returned in CSV format, where the sql is the post-body url.
[**putByQueryExcel**](SqlExecutionApi.md#putByQueryExcel) | **PUT** /api/Sql/excel | PutByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded), where the sql is the post-body url.
[**putByQueryJson**](SqlExecutionApi.md#putByQueryJson) | **PUT** /api/Sql/json | PutByQueryJson: Executes Sql, returned in JSON format, where the sql is the post-body url.
[**putByQueryParquet**](SqlExecutionApi.md#putByQueryParquet) | **PUT** /api/Sql/parquet | PutByQueryParquet: Executes Sql, returned in Parquet format, where the sql is the post-body url.
[**putByQueryPipe**](SqlExecutionApi.md#putByQueryPipe) | **PUT** /api/Sql/pipe | PutByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is the post-body url.
[**putByQuerySqlite**](SqlExecutionApi.md#putByQuerySqlite) | **PUT** /api/Sql/sqlite | PutByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded), where the sql is the post-body url.
[**putByQueryXml**](SqlExecutionApi.md#putByQueryXml) | **PUT** /api/Sql/xml | PutByQueryXml: Executes Sql, returned in Xml format, where the sql is the post-body url.
[**putQueryToFormat**](SqlExecutionApi.md#putQueryToFormat) | **PUT** /api/Sql/pretty | PutQueryToFormat: Executes Sql, returned in JSON format, where the sql is the post-body url.


<a name="getByQueryCsv"></a>
# **getByQueryCsv**
> String getByQueryCsv(query, queryName, download, timeout, delimiter, escape)

GetByQueryCsv: Executes Sql, returned in CSV format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    String delimiter = "delimiter_example"; // String | Delimiter string to override the default
    String escape = "escape_example"; // String | Escape character to override the default
    try {
      String result = apiInstance.getByQueryCsv(query, queryName, download, timeout, delimiter, escape);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQueryCsv");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]
 **delimiter** | **String**| Delimiter string to override the default | [optional]
 **escape** | **String**| Escape character to override the default | [optional]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getByQueryExcel"></a>
# **getByQueryExcel**
> String getByQueryExcel(query, queryName, timeout)

GetByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded) format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.getByQueryExcel(query, queryName, timeout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQueryExcel");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getByQueryJson"></a>
# **getByQueryJson**
> String getByQueryJson(query, queryName, timeout, jsonProper)

GetByQueryJson: Executes Sql, returned in JSON format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
    try {
      String result = apiInstance.getByQueryJson(query, queryName, timeout, jsonProper);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQueryJson");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]
 **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getByQueryParquet"></a>
# **getByQueryParquet**
> String getByQueryParquet(query, queryName, timeout)

GetByQueryParquet: Executes Sql, returned in Parquet (.parquet) format (as a file to be downloaded) format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.getByQueryParquet(query, queryName, timeout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQueryParquet");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getByQueryPipe"></a>
# **getByQueryPipe**
> String getByQueryPipe(query, queryName, download, timeout)

GetByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.getByQueryPipe(query, queryName, download, timeout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQueryPipe");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getByQuerySqlite"></a>
# **getByQuerySqlite**
> String getByQuerySqlite(query, queryName, timeout)

GetByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded) format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.getByQuerySqlite(query, queryName, timeout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQuerySqlite");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="getByQueryXml"></a>
# **getByQueryXml**
> String getByQueryXml(query, queryName, download, timeout)

GetByQueryXml: Executes Sql, returned in Xml format, where the sql is simply in the url.

 For simple single-line query execution via the url. e.g. &#x60;select ^ from Sys.Field order by 1, 2&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String query = "select ^ from Sys.Field order by 1, 2"; // String | LuminesceSql to Execute (must be one line only)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
    Integer timeout = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.getByQueryXml(query, queryName, download, timeout);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#getByQueryXml");
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
 **query** | **String**| LuminesceSql to Execute (must be one line only) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false]
 **timeout** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQueryCsv"></a>
# **putByQueryCsv**
> String putByQueryCsv(body, queryName, download, timeoutSeconds, delimiter, escape)

PutByQueryCsv: Executes Sql, returned in CSV format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    String delimiter = "delimiter_example"; // String | Delimiter string to override the default
    String escape = "escape_example"; // String | Escape character to override the default
    try {
      String result = apiInstance.putByQueryCsv(body, queryName, download, timeoutSeconds, delimiter, escape);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQueryCsv");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]
 **delimiter** | **String**| Delimiter string to override the default | [optional]
 **escape** | **String**| Escape character to override the default | [optional]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQueryExcel"></a>
# **putByQueryExcel**
> String putByQueryExcel(body, queryName, timeoutSeconds)

PutByQueryExcel: Executes Sql, returned in Excel (xlsx) format (as a file to be downloaded), where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.putByQueryExcel(body, queryName, timeoutSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQueryExcel");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQueryJson"></a>
# **putByQueryJson**
> String putByQueryJson(body, queryName, timeoutSeconds, jsonProper)

PutByQueryJson: Executes Sql, returned in JSON format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
    try {
      String result = apiInstance.putByQueryJson(body, queryName, timeoutSeconds, jsonProper);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQueryJson");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]
 **jsonProper** | **Boolean**| Should this be text/json (not json-encoded-as-a-string) | [optional] [default to false]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQueryParquet"></a>
# **putByQueryParquet**
> String putByQueryParquet(body, queryName, timeoutSeconds)

PutByQueryParquet: Executes Sql, returned in Parquet format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.putByQueryParquet(body, queryName, timeoutSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQueryParquet");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQueryPipe"></a>
# **putByQueryPipe**
> String putByQueryPipe(body, queryName, download, timeoutSeconds)

PutByQueryPipe: Executes Sql, returned in pipe-delimited format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.putByQueryPipe(body, queryName, download, timeoutSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQueryPipe");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQuerySqlite"></a>
# **putByQuerySqlite**
> String putByQuerySqlite(body, queryName, timeoutSeconds)

PutByQuerySqlite: Executes Sql, returned in SqLite DB (sqlite3) format (as a file to be downloaded), where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.putByQuerySqlite(body, queryName, timeoutSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQuerySqlite");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putByQueryXml"></a>
# **putByQueryXml**
> String putByQueryXml(body, queryName, download, timeoutSeconds)

PutByQueryXml: Executes Sql, returned in Xml format, where the sql is the post-body url.

 For more complex LuminesceSql a PUT will allow for longer Sql. e.g.: &#x60;&#x60;&#x60;sql @@cutoff &#x3D; select #2020-02-01#; @issues &#x3D; select Id, SortId, Summary, Created, Updated from Dev.Jira.Issue where Project&#x3D;&#39;HC&#39; and Created &lt; @@cutoff and Updated &gt; @@cutoff;  select i.Id, i.SortId, i.Summary, LinkText, LinkedIssueId, LinkedIssueSortId, LinkedIssueSummary from @issues i inner join Dev.Jira.Issue.Link li     on i.Id &#x3D; li.IssueId &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 400 BadRequest - something failed with the execution or parsing of your query - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Execute (may be multi-line)
    String queryName = "Get tables/fields"; // String | Name to apply to the query in logs and `Sys.Logs.HcQueryStart`
    Boolean download = false; // Boolean | Makes this a file-download request (as opposed to returning the data in the response-body)
    Integer timeoutSeconds = 0; // Integer | In seconds: <0 → ∞, 0 → 120s
    try {
      String result = apiInstance.putByQueryXml(body, queryName, download, timeoutSeconds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putByQueryXml");
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
 **body** | **String**| LuminesceSql to Execute (may be multi-line) |
 **queryName** | **String**| Name to apply to the query in logs and &#x60;Sys.Logs.HcQueryStart&#x60; | [optional]
 **download** | **Boolean**| Makes this a file-download request (as opposed to returning the data in the response-body) | [optional] [default to false]
 **timeoutSeconds** | **Integer**| In seconds: &lt;0 → ∞, 0 → 120s | [optional] [default to 0]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

<a name="putQueryToFormat"></a>
# **putQueryToFormat**
> String putQueryToFormat(body, trailingCommas, uppercaseKeywords, breakJoinOnSections, spaceAfterExpandedComma, keywordStandardization, expandCommaLists, expandInLists, expandBooleanExpressions, expandBetweenConditions, expandCaseStatements, maxLineWidth)

PutQueryToFormat: Executes Sql, returned in JSON format, where the sql is the post-body url.

 This formats SQL (given a set of options as to how to do so). It takes some SQL (or a fragment thereof, it need not fully parse as yet and certainly need not execute correctly) and returns the reformatted version. e.g. &#x60;&#x60;&#x60;sql select x,y,z from a inner join b on a.x&#x3D;b.x where x&gt;y or y!&#x3D;z &#x60;&#x60;&#x60; becomes &#x60;&#x60;&#x60;sql select x, y, z from a inner join b    on a.x &#x3D; b.x where x &gt; y    or y !&#x3D; z &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.SqlExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    SqlExecutionApi apiInstance = new SqlExecutionApi(defaultClient);
    String body = select * from sys.field; // String | LuminesceSql to Pretty-Print. Even if it doesn't parse an attempt will be made to format it
    Boolean trailingCommas = true; // Boolean | Should commas be after an expression (as opposed to before)
    Boolean uppercaseKeywords = false; // Boolean | Should key words be capitalized
    Boolean breakJoinOnSections = true; // Boolean | Should clauses on joins be given line breaks?
    Boolean spaceAfterExpandedComma = true; // Boolean | Should comma-lists have spaces after the commas?
    Boolean keywordStandardization = true; // Boolean | Should the \"nicest\" key words be used? (e.g. JOIN -> INNER JOIN)
    Boolean expandCommaLists = false; // Boolean | Should comma-lists (e.g. select a,b,c) have line breaks added?
    Boolean expandInLists = false; // Boolean | Should IN-lists have line breaks added?
    Boolean expandBooleanExpressions = true; // Boolean | Should boolean expressions have line breaks added?
    Boolean expandBetweenConditions = true; // Boolean | Should between conditions have line breaks added?
    Boolean expandCaseStatements = true; // Boolean | Should case-statements have line breaks added?
    Integer maxLineWidth = 120; // Integer | Maximum number of characters to allow on one line (if possible)
    try {
      String result = apiInstance.putQueryToFormat(body, trailingCommas, uppercaseKeywords, breakJoinOnSections, spaceAfterExpandedComma, keywordStandardization, expandCommaLists, expandInLists, expandBooleanExpressions, expandBetweenConditions, expandCaseStatements, maxLineWidth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SqlExecutionApi#putQueryToFormat");
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
 **body** | **String**| LuminesceSql to Pretty-Print. Even if it doesn&#39;t parse an attempt will be made to format it |
 **trailingCommas** | **Boolean**| Should commas be after an expression (as opposed to before) | [optional] [default to true]
 **uppercaseKeywords** | **Boolean**| Should key words be capitalized | [optional] [default to false]
 **breakJoinOnSections** | **Boolean**| Should clauses on joins be given line breaks? | [optional] [default to true]
 **spaceAfterExpandedComma** | **Boolean**| Should comma-lists have spaces after the commas? | [optional] [default to true]
 **keywordStandardization** | **Boolean**| Should the \&quot;nicest\&quot; key words be used? (e.g. JOIN -&gt; INNER JOIN) | [optional] [default to true]
 **expandCommaLists** | **Boolean**| Should comma-lists (e.g. select a,b,c) have line breaks added? | [optional] [default to false]
 **expandInLists** | **Boolean**| Should IN-lists have line breaks added? | [optional] [default to false]
 **expandBooleanExpressions** | **Boolean**| Should boolean expressions have line breaks added? | [optional] [default to true]
 **expandBetweenConditions** | **Boolean**| Should between conditions have line breaks added? | [optional] [default to true]
 **expandCaseStatements** | **Boolean**| Should case-statements have line breaks added? | [optional] [default to true]
 **maxLineWidth** | **Integer**| Maximum number of characters to allow on one line (if possible) | [optional] [default to 120]

### Return type

**String**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |

