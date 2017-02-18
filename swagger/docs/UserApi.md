# UserApi

All URIs are relative to *https://localhost/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiUserFriendsPost**](UserApi.md#apiUserFriendsPost) | **POST** /api/User/friends | 
[**apiUserUserByIdGet**](UserApi.md#apiUserUserByIdGet) | **GET** /api/User/user/{id} | 
[**apiUserUserCreatePost**](UserApi.md#apiUserUserCreatePost) | **POST** /api/User/user/create | 
[**apiUserUserDeleteByIdDelete**](UserApi.md#apiUserUserDeleteByIdDelete) | **DELETE** /api/User/user/delete/{id} | 
[**apiUserUserUpdatePut**](UserApi.md#apiUserUserUpdatePut) | **PUT** /api/User/user/update | 


<a name="apiUserFriendsPost"></a>
# **apiUserFriendsPost**
> List&lt;User&gt; apiUserFriendsPost(user)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.UserApi;


UserApi apiInstance = new UserApi();
User user = new User(); // User | 
try {
    List<User> result = apiInstance.apiUserFriendsPost(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#apiUserFriendsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | [optional]

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserUserByIdGet"></a>
# **apiUserUserByIdGet**
> User apiUserUserByIdGet(id)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.UserApi;


UserApi apiInstance = new UserApi();
String id = "id_example"; // String | 
try {
    User result = apiInstance.apiUserUserByIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#apiUserUserByIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserUserCreatePost"></a>
# **apiUserUserCreatePost**
> Long apiUserUserCreatePost(user)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.UserApi;


UserApi apiInstance = new UserApi();
User user = new User(); // User | 
try {
    Long result = apiInstance.apiUserUserCreatePost(user);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#apiUserUserCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | [**User**](User.md)|  | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserUserDeleteByIdDelete"></a>
# **apiUserUserDeleteByIdDelete**
> Long apiUserUserDeleteByIdDelete(id)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.UserApi;


UserApi apiInstance = new UserApi();
String id = "id_example"; // String | 
try {
    Long result = apiInstance.apiUserUserDeleteByIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#apiUserUserDeleteByIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json

<a name="apiUserUserUpdatePut"></a>
# **apiUserUserUpdatePut**
> Long apiUserUserUpdatePut(value)



### Example
```java
// Import classes:
//import com.dork.app.react.api.invoker.ApiException;
//import com.dork.app.react.api.UserApi;


UserApi apiInstance = new UserApi();
User value = new User(); // User | 
try {
    Long result = apiInstance.apiUserUserUpdatePut(value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#apiUserUserUpdatePut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **value** | [**User**](User.md)|  | [optional]

### Return type

**Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, text/json, application/json-patch+json
 - **Accept**: text/plain, application/json, text/json

