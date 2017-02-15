# MessageApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiMessageActsGet**](MessageApi.md#apiMessageActsGet) | **GET** /api/Message/acts | 


<a name="apiMessageActsGet"></a>
# **apiMessageActsGet**
> List&lt;ActMessage&gt; apiMessageActsGet()



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.MessageApi;


MessageApi apiInstance = new MessageApi();
try {
    List<ActMessage> result = apiInstance.apiMessageActsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessageApi#apiMessageActsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ActMessage&gt;**](ActMessage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

