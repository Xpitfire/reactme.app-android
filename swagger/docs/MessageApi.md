# MessageApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiMessageMessageRecentActByIdPost**](MessageApi.md#apiMessageMessageRecentActByIdPost) | **POST** /api/Message/message/recent/act/{id} | 


<a name="apiMessageMessageRecentActByIdPost"></a>
# **apiMessageMessageRecentActByIdPost**
> List&lt;ActMessage&gt; apiMessageMessageRecentActByIdPost(id, user, page)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.MessageApi;


MessageApi apiInstance = new MessageApi();
String id = "id_example"; // String | 
User user = new User(); // User | 
Page page = new Page(); // Page | 
try {
    List<ActMessage> result = apiInstance.apiMessageMessageRecentActByIdPost(id, user, page);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageMessageRecentActByIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **user** | [**User**](User.md)|  | [optional]
 **page** | [**Page**](Page.md)|  | [optional]

### Return type

[**List&lt;ActMessage&gt;**](ActMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json, application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

