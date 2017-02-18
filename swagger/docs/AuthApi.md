# AuthApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiAuthLoginPost**](AuthApi.md#apiAuthLoginPost) | **POST** /api/Auth/login | 
[**apiAuthLogoutPost**](AuthApi.md#apiAuthLogoutPost) | **POST** /api/Auth/logout | 


<a name="apiAuthLoginPost"></a>
# **apiAuthLoginPost**
> Boolean apiAuthLoginPost(loginCredentials)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.AuthApi;


AuthApi apiInstance = new AuthApi();
LoginCredentials loginCredentials = new LoginCredentials(); // LoginCredentials | 
try {
    Boolean result = apiInstance.apiAuthLoginPost(loginCredentials);
    System.out.println(result);
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

**Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

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

