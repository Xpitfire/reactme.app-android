# EntryApi

All URIs are relative to *https://fruity-app.at/froody*

Method | HTTP request | Description
------------- | ------------- | -------------
[**entryAddPost**](EntryApi.md#entryAddPost) | **POST** /entry/add | Add a FroodyEntry with details
[**entryByIdGet**](EntryApi.md#entryByIdGet) | **GET** /entry/byId | 
[**entryDeleteGet**](EntryApi.md#entryDeleteGet) | **GET** /entry/delete | Delete an Entry
[**entryPopularEntryTypesGet**](EntryApi.md#entryPopularEntryTypesGet) | **GET** /entry/popularEntryTypes | 


<a name="entryAddPost"></a>
# **entryAddPost**
> ResponseEntryAdd entryAddPost(userId, geohash, entryType, distributionType, certificationType, description, contact, address)

Add a FroodyEntry with details

The Entry/Add endpoint returns a result, if the transmitted FroodyEntry could be created.

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.EntryApi;


EntryApi apiInstance = new EntryApi();
Long userId = 789L; // Long | User.userId ** UID which identifies the User
String geohash = "geohash_example"; // String | Entry.geohash ** Geohash (=position) of entry with precision >= 9
Integer entryType = 56; // Integer | Entry.entryType ** Type of entry (e.g. pear, apple,..)
Integer distributionType = 56; // Integer | Entry.distributionType .> Dist-type of entry
Integer certificationType = 56; // Integer | Entry.certificationType ** Cert-type of entry
String description = "description_example"; // String | Entry.description ** Description of entry
String contact = "contact_example"; // String | Entry.contact ** Contact info of entry
String address = "address_example"; // String | Entry.address ** Address of entry (reverse geocoded)
try {
    ResponseEntryAdd result = apiInstance.entryAddPost(userId, geohash, entryType, distributionType, certificationType, description, contact, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryAddPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User.userId ** UID which identifies the User |
 **geohash** | **String**| Entry.geohash ** Geohash (&#x3D;position) of entry with precision &gt;&#x3D; 9 |
 **entryType** | **Integer**| Entry.entryType ** Type of entry (e.g. pear, apple,..) |
 **distributionType** | **Integer**| Entry.distributionType .&gt; Dist-type of entry |
 **certificationType** | **Integer**| Entry.certificationType ** Cert-type of entry |
 **description** | **String**| Entry.description ** Description of entry |
 **contact** | **String**| Entry.contact ** Contact info of entry |
 **address** | **String**| Entry.address ** Address of entry (reverse geocoded) |

### Return type

[**ResponseEntryAdd**](ResponseEntryAdd.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entryByIdGet"></a>
# **entryByIdGet**
> FroodyEntry entryByIdGet(entryId)



Entry ** Get details of one entry

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.EntryApi;


EntryApi apiInstance = new EntryApi();
Long entryId = 789L; // Long | Entry.entryId ** Entry ID
try {
    FroodyEntry result = apiInstance.entryByIdGet(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **Long**| Entry.entryId ** Entry ID |

### Return type

[**FroodyEntry**](FroodyEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entryDeleteGet"></a>
# **entryDeleteGet**
> ResponseOk entryDeleteGet(userId, managementCode, entryId)

Delete an Entry

Delete entry by code, userId and entryId

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.EntryApi;


EntryApi apiInstance = new EntryApi();
Long userId = 789L; // Long | User.userId ** UID of client
Integer managementCode = 56; // Integer | Entry.managementCode ** Code for check if allowed to delete
Long entryId = 789L; // Long | Entry.entryId ** Id of entry that should be deleted
try {
    ResponseOk result = apiInstance.entryDeleteGet(userId, managementCode, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryDeleteGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User.userId ** UID of client |
 **managementCode** | **Integer**| Entry.managementCode ** Code for check if allowed to delete |
 **entryId** | **Long**| Entry.entryId ** Id of entry that should be deleted |

### Return type

[**ResponseOk**](ResponseOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="entryPopularEntryTypesGet"></a>
# **entryPopularEntryTypesGet**
> List&lt;Integer&gt; entryPopularEntryTypesGet(geohash)



Entry.entryType[ ] ** Get a list of popular entry types on server (includes 1+8 blocks around geohash block)

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.EntryApi;


EntryApi apiInstance = new EntryApi();
String geohash = "geohash_example"; // String | BlockInfo.geohash ** Geohash to get popular types around
try {
    List<Integer> result = apiInstance.entryPopularEntryTypesGet(geohash);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EntryApi#entryPopularEntryTypesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **geohash** | **String**| BlockInfo.geohash ** Geohash to get popular types around |

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

