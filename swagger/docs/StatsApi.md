# StatsApi

All URIs are relative to *https://fruity-app.at/froody*

Method | HTTP request | Description
------------- | ------------- | -------------
[**statsOverallGet**](StatsApi.md#statsOverallGet) | **GET** /stats/overall | 


<a name="statsOverallGet"></a>
# **statsOverallGet**
> ServerOverallStats statsOverallGet()



Overall statistics

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.StatsApi;


StatsApi apiInstance = new StatsApi();
try {
    ServerOverallStats result = apiInstance.statsOverallGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#statsOverallGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerOverallStats**](ServerOverallStats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

