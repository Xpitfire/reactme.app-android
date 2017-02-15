# BlockApi

All URIs are relative to *https://fruity-app.at/froody*

Method | HTTP request | Description
------------- | ------------- | -------------
[**blockGetGet**](BlockApi.md#blockGetGet) | **GET** /block/get | 
[**blockInfoGet**](BlockApi.md#blockInfoGet) | **GET** /block/info | 
[**blockInfoRandomGet**](BlockApi.md#blockInfoRandomGet) | **GET** /block/info/random | 


<a name="blockGetGet"></a>
# **blockGetGet**
> List&lt;FroodyEntry&gt; blockGetGet(geohash, minModificationDate)



Entry[ ] ** Get entries contained in block

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.BlockApi;


BlockApi apiInstance = new BlockApi();
String geohash = "geohash_example"; // String | Entry.geohash ** Geohash which should be matched
DateTime minModificationDate = new DateTime(); // DateTime | BlockInfo.modificationDate ** Timestamp of last known block modification
try {
    List<FroodyEntry> result = apiInstance.blockGetGet(geohash, minModificationDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#blockGetGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geohash** | **String**| Entry.geohash ** Geohash which should be matched |
 **minModificationDate** | **DateTime**| BlockInfo.modificationDate ** Timestamp of last known block modification |

### Return type

[**List&lt;FroodyEntry&gt;**](FroodyEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockInfoGet"></a>
# **blockInfoGet**
> List&lt;BlockInfo&gt; blockInfoGet(geohash, minModificationDate)



Get informations about of or around block/geohash

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.BlockApi;


BlockApi apiInstance = new BlockApi();
String geohash = "geohash_example"; // String | BlockInfo.geohash ** Geohash (=position) 
DateTime minModificationDate = new DateTime(); // DateTime | BlockInfo.modificationDate ** Timestamp of last known block modification. Make 3 weeks ago to get everything.
try {
    List<BlockInfo> result = apiInstance.blockInfoGet(geohash, minModificationDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#blockInfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geohash** | **String**| BlockInfo.geohash ** Geohash (&#x3D;position)  |
 **minModificationDate** | **DateTime**| BlockInfo.modificationDate ** Timestamp of last known block modification. Make 3 weeks ago to get everything. |

### Return type

[**List&lt;BlockInfo&gt;**](BlockInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="blockInfoRandomGet"></a>
# **blockInfoRandomGet**
> List&lt;BlockInfo&gt; blockInfoRandomGet()



Get informations about random geohashes

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.BlockApi;


BlockApi apiInstance = new BlockApi();
try {
    List<BlockInfo> result = apiInstance.blockInfoRandomGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#blockInfoRandomGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;BlockInfo&gt;**](BlockInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

