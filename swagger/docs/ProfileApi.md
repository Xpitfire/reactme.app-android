# ProfileApi

All URIs are relative to *https://dork-943e.azurewebsites.net/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiProfileByIdDelete**](ProfileApi.md#apiProfileByIdDelete) | **DELETE** /api/Profile/{id} | 
[**apiProfileGet**](ProfileApi.md#apiProfileGet) | **GET** /api/Profile | 
[**apiProfilePost**](ProfileApi.md#apiProfilePost) | **POST** /api/Profile | 
[**apiProfilePut**](ProfileApi.md#apiProfilePut) | **PUT** /api/Profile | 


<a name="apiProfileByIdDelete"></a>
# **apiProfileByIdDelete**
> apiProfileByIdDelete(id)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String id = "id_example"; // String | 
try {
    apiInstance.apiProfileByIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#apiProfileByIdDelete");
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

<a name="apiProfileGet"></a>
# **apiProfileGet**
> apiProfileGet()



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
try {
    apiInstance.apiProfileGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#apiProfileGet");
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

<a name="apiProfilePost"></a>
# **apiProfilePost**
> apiProfilePost(value)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
User value = new User(); // User | 
try {
    apiInstance.apiProfilePost(value);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#apiProfilePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**User**](User.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

<a name="apiProfilePut"></a>
# **apiProfilePut**
> apiProfilePut(value)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
User value = new User(); // User | 
try {
    apiInstance.apiProfilePut(value);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#apiProfilePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**User**](User.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: Not defined

