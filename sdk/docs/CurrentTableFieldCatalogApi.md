# CurrentTableFieldCatalogApi

All URIs are relative to *https://www.lusid.com/honeycomb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalog**](CurrentTableFieldCatalogApi.md#getCatalog) | **GET** /api/Catalog | [EXPERIMENTAL] GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)


<a name="getCatalog"></a>
# **getCatalog**
> String getCatalog(freeTextSearch, jsonProper)

[EXPERIMENTAL] GetCatalog: Shows Table and Field level information on Providers that are currently running that you have access to (in Json format)

 The following HoneycombSql is executed to return this information:  &#x60;&#x60;&#x60;sql select     coalesce(f.TableName, r.Name) as TableName,     coalesce(f.FieldName, &#39;N/A&#39;) as FieldName,     f.DataType,     f.FieldType,     f.IsPrimaryKey,     f.IsMain,     case          when f.TableName is not null              then f.Description         else             r.Name || &#39; returns a different set of columns depending on use.&#39;         end as Description,     f.ParamDefaultValue,     f.TableParamColumns,     min(r.Description) as ProviderDescription from     Sys.Registration r     left outer join Sys.Field f         on r.Name &#x3D; f.TableName where     r.Type in (&#39;DirectProvider&#39;, &#39;DataProvider&#39;)     and      r.ShowAll &#x3D; false group by     1, 2, 3, 4, 5, 6, 8, 9 order by     1, 5 desc, 6 desc, 2     &#x60;&#x60;&#x60;  The following error codes are to be anticipated with standard Problem Detail reports: - 401 Unauthorized 

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.CurrentTableFieldCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    CurrentTableFieldCatalogApi apiInstance = new CurrentTableFieldCatalogApi(defaultClient);
    String freeTextSearch = "freeTextSearch_example"; // String | Limit the catalog to only things in some way dealing with the passed in text string
    Boolean jsonProper = false; // Boolean | Should this be text/json (not json-encoded-as-a-string)
    try {
      String result = apiInstance.getCatalog(freeTextSearch, jsonProper);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CurrentTableFieldCatalogApi#getCatalog");
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
 **freeTextSearch** | **String**| Limit the catalog to only things in some way dealing with the passed in text string | [optional]
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

