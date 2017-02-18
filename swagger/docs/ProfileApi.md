# ProfileApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiProfileProfileByIdGet**](ProfileApi.md#apiProfileProfileByIdGet) | **GET** /api/Profile/profile/{id} | 
[**apiProfileProfileCreatePost**](ProfileApi.md#apiProfileProfileCreatePost) | **POST** /api/Profile/profile/create | 


<a name="apiProfileProfileByIdGet"></a>
# **apiProfileProfileByIdGet**
> Profile apiProfileProfileByIdGet(id)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
String id = "id_example"; // String | 
try {
    Profile result = apiInstance.apiProfileProfileByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#apiProfileProfileByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiProfileProfileCreatePost"></a>
# **apiProfileProfileCreatePost**
> Long apiProfileProfileCreatePost(profile)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.ProfileApi;


ProfileApi apiInstance = new ProfileApi();
Profile profile = new Profile(); // Profile | 
try {
    Long result = apiInstance.apiProfileProfileCreatePost(profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfileApi#apiProfileProfileCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profile** | [**Profile**](Profile.md)|  | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

