# AuthApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAuthByIdGet**](AuthApi.md#apiAuthByIdGet) | **GET** /api/Auth/{id} | 
[**apiAuthLoginPost**](AuthApi.md#apiAuthLoginPost) | **POST** /api/Auth/login | 
[**apiAuthLogoutPost**](AuthApi.md#apiAuthLogoutPost) | **POST** /api/Auth/logout | 


<a name="apiAuthByIdGet"></a>
# **apiAuthByIdGet**
> apiAuthByIdGet(id)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String id = "id_example"; // String | 
try {
    apiInstance.apiAuthByIdGet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#apiAuthByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="apiAuthLoginPost"></a>
# **apiAuthLoginPost**
> apiAuthLoginPost(loginCredentials)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LoginCredentials loginCredentials = new LoginCredentials(); // LoginCredentials | 
try {
    apiInstance.apiAuthLoginPost(loginCredentials);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#apiAuthLoginPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginCredentials** | [**LoginCredentials**](LoginCredentials.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiAuthLogoutPost"></a>
# **apiAuthLogoutPost**
> apiAuthLogoutPost()



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.AuthApi;


AuthApi apiInstance = new AuthApi();
try {
    apiInstance.apiAuthLogoutPost();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#apiAuthLogoutPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

