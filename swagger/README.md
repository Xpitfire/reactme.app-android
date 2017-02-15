# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.dork.app.react.api.invoker.*;
import com.dork.app.react.api.invoker.auth.*;
import com.dork.app.react.api.model.*;
import com.dork.app.react.api.AuthApi;

import java.io.File;
import java.util.*;

public class AuthApiExample {

    public static void main(String[] args) {
        
        AuthApi apiInstance = new AuthApi();
        String id = "id_example"; // String | 
        try {
            apiInstance.apiAuthByIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthApi#apiAuthByIdGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**apiAuthByIdGet**](docs/AuthApi.md#apiAuthByIdGet) | **GET** /api/Auth/{id} | 
*AuthApi* | [**apiAuthLoginPost**](docs/AuthApi.md#apiAuthLoginPost) | **POST** /api/Auth/login | 
*AuthApi* | [**apiAuthLogoutPost**](docs/AuthApi.md#apiAuthLogoutPost) | **POST** /api/Auth/logout | 
*InitApi* | [**apiInitProfileGet**](docs/InitApi.md#apiInitProfileGet) | **GET** /api/Init/profile | 
*InitApi* | [**apiInitProfilePost**](docs/InitApi.md#apiInitProfilePost) | **POST** /api/Init/profile | 
*InitApi* | [**apiInitUserGet**](docs/InitApi.md#apiInitUserGet) | **GET** /api/Init/user | 
*InitApi* | [**apiInitUserPost**](docs/InitApi.md#apiInitUserPost) | **POST** /api/Init/user | 
*MessageApi* | [**apiMessageActsGet**](docs/MessageApi.md#apiMessageActsGet) | **GET** /api/Message/acts | 
*ProfileApi* | [**apiProfileByIdDelete**](docs/ProfileApi.md#apiProfileByIdDelete) | **DELETE** /api/Profile/{id} | 
*ProfileApi* | [**apiProfileGet**](docs/ProfileApi.md#apiProfileGet) | **GET** /api/Profile | 
*ProfileApi* | [**apiProfilePost**](docs/ProfileApi.md#apiProfilePost) | **POST** /api/Profile | 
*ProfileApi* | [**apiProfilePut**](docs/ProfileApi.md#apiProfilePut) | **PUT** /api/Profile | 


## Documentation for Models

 - [ActMessage](docs/ActMessage.md)
 - [ContactInfo](docs/ContactInfo.md)
 - [Content](docs/Content.md)
 - [LoginCredentials](docs/LoginCredentials.md)
 - [Profile](docs/Profile.md)
 - [User](docs/User.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



