# UserApi

All URIs are relative to *https://fruity-app.at/froody*

Method | HTTP request | Description
------------- | ------------- | -------------
[**userIsEnabledGet**](UserApi.md#userIsEnabledGet) | **GET** /user/isEnabled | 
[**userRegisterGet**](UserApi.md#userRegisterGet) | **GET** /user/register | User Id


<a name="userIsEnabledGet"></a>
# **userIsEnabledGet**
> ResponseOk userIsEnabledGet(userId)



Check if user is enabled (by User.userId)

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.UserApi;


UserApi apiInstance = new UserApi();
Long userId = 789L; // Long | User.userId ** UID of client
try {
    ResponseOk result = apiInstance.userIsEnabledGet(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userIsEnabledGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **Long**| User.userId ** UID of client |

### Return type

[**ResponseOk**](ResponseOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userRegisterGet"></a>
# **userRegisterGet**
> FroodyUser userRegisterGet()

User Id

The User Id endpoint returns the Id of the User, which was currently created.

### Example
```java
// Import classes:
//import io.github.froodyapp.api.invoker.ApiException;
//import io.github.froodyapp.api.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    FroodyUser result = apiInstance.userRegisterGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#userRegisterGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FroodyUser**](FroodyUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

