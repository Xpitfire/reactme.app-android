# AdminApi

All URIs are relative to *https://fruity-app.at/froody*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adminCleanupGet**](AdminApi.md#adminCleanupGet) | **GET** /admin/cleanup | 


<a name="adminCleanupGet"></a>
# **adminCleanupGet**
> ResponseOk adminCleanupGet(adminCode)



Clean up user and entry database

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.AdminApi;


AdminApi apiInstance = new AdminApi();
String adminCode = "adminCode_example"; // String | AdminCode - defined in config.php
try {
    ResponseOk result = apiInstance.adminCleanupGet(adminCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdminApi#adminCleanupGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adminCode** | **String**| AdminCode - defined in config.php |

### Return type

[**ResponseOk**](ResponseOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

