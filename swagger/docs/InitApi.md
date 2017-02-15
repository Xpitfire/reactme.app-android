# InitApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiInitProfileGet**](InitApi.md#apiInitProfileGet) | **GET** /api/Init/profile | 
[**apiInitProfilePost**](InitApi.md#apiInitProfilePost) | **POST** /api/Init/profile | 
[**apiInitUserGet**](InitApi.md#apiInitUserGet) | **GET** /api/Init/user | 
[**apiInitUserPost**](InitApi.md#apiInitUserPost) | **POST** /api/Init/user | 


<a name="apiInitProfileGet"></a>
# **apiInitProfileGet**
> apiInitProfileGet()



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.InitApi;


InitApi apiInstance = new InitApi();
try {
    apiInstance.apiInitProfileGet();
} catch (ApiException e) {
    System.err.println("Exception when calling InitApi#apiInitProfileGet");
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

<a name="apiInitProfilePost"></a>
# **apiInitProfilePost**
> apiInitProfilePost(profile)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.InitApi;


InitApi apiInstance = new InitApi();
Profile profile = new Profile(); // Profile | 
try {
    apiInstance.apiInitProfilePost(profile);
} catch (ApiException e) {
    System.err.println("Exception when calling InitApi#apiInitProfilePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profile** | [**Profile**](Profile.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiInitUserGet"></a>
# **apiInitUserGet**
> apiInitUserGet()



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.InitApi;


InitApi apiInstance = new InitApi();
try {
    apiInstance.apiInitUserGet();
} catch (ApiException e) {
    System.err.println("Exception when calling InitApi#apiInitUserGet");
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

<a name="apiInitUserPost"></a>
# **apiInitUserPost**
> apiInitUserPost(user)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.InitApi;


InitApi apiInstance = new InitApi();
User user = new User(); // User | 
try {
    apiInstance.apiInitUserPost(user);
} catch (ApiException e) {
    System.err.println("Exception when calling InitApi#apiInitUserPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

