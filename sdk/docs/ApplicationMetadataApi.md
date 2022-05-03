# ApplicationMetadataApi

All URIs are relative to *https://www.lusid.com/honeycomb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getServicesAsAccessControlledResources**](ApplicationMetadataApi.md#getServicesAsAccessControlledResources) | **GET** /api/metadata/access/resources | [EXPERIMENTAL] GetServicesAsAccessControlledResources: Get resources available for access control


<a name="getServicesAsAccessControlledResources"></a>
# **getServicesAsAccessControlledResources**
> ResourceListOfAccessControlledResource getServicesAsAccessControlledResources()

[EXPERIMENTAL] GetServicesAsAccessControlledResources: Get resources available for access control

Get the comprehensive set of resources that are available for access control

### Example
```java
// Import classes:
import com.finbourne.luminesce.ApiClient;
import com.finbourne.luminesce.ApiException;
import com.finbourne.luminesce.Configuration;
import com.finbourne.luminesce.auth.*;
import com.finbourne.luminesce.models.*;
import com.finbourne.luminesce.api.ApplicationMetadataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://www.lusid.com/honeycomb");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ApplicationMetadataApi apiInstance = new ApplicationMetadataApi(defaultClient);
    try {
      ResourceListOfAccessControlledResource result = apiInstance.getServicesAsAccessControlledResources();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationMetadataApi#getServicesAsAccessControlledResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourceListOfAccessControlledResource**](ResourceListOfAccessControlledResource.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

