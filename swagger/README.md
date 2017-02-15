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

import io.github.froodyapp.api.invoker.*;
import io.github.froodyapp.api.invoker.auth.*;
import io.github.froodyapp.api.model_.*;
import io.github.froodyapp.api.api.AdminApi;

import java.io.File;
import java.util.*;

public class AdminApiExample {

    public static void main(String[] args) {
        
        AdminApi apiInstance = new AdminApi();
        String adminCode = "adminCode_example"; // String | AdminCode - defined in config.php
        try {
            ResponseOk result = apiInstance.adminCleanupGet(adminCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminApi#adminCleanupGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://fruity-app.at/froody*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdminApi* | [**adminCleanupGet**](docs/AdminApi.md#adminCleanupGet) | **GET** /admin/cleanup | 
*BlockApi* | [**blockGetGet**](docs/BlockApi.md#blockGetGet) | **GET** /block/get | 
*BlockApi* | [**blockInfoGet**](docs/BlockApi.md#blockInfoGet) | **GET** /block/info | 
*BlockApi* | [**blockInfoRandomGet**](docs/BlockApi.md#blockInfoRandomGet) | **GET** /block/info/random | 
*EntryApi* | [**entryAddPost**](docs/EntryApi.md#entryAddPost) | **POST** /entry/add | Add a FroodyEntry with details
*EntryApi* | [**entryByIdGet**](docs/EntryApi.md#entryByIdGet) | **GET** /entry/byId | 
*EntryApi* | [**entryDeleteGet**](docs/EntryApi.md#entryDeleteGet) | **GET** /entry/delete | Delete an Entry
*EntryApi* | [**entryPopularEntryTypesGet**](docs/EntryApi.md#entryPopularEntryTypesGet) | **GET** /entry/popularEntryTypes | 
*StatsApi* | [**statsOverallGet**](docs/StatsApi.md#statsOverallGet) | **GET** /stats/overall | 
*UserApi* | [**userIsEnabledGet**](docs/UserApi.md#userIsEnabledGet) | **GET** /user/isEnabled | 
*UserApi* | [**userRegisterGet**](docs/UserApi.md#userRegisterGet) | **GET** /user/register | User Id


## Documentation for Models

 - [BlockInfo](docs/BlockInfo.md)
 - [FroodyEntry](docs/FroodyEntry.md)
 - [FroodyUser](docs/FroodyUser.md)
 - [ResponseEntryAdd](docs/ResponseEntryAdd.md)
 - [ResponseOk](docs/ResponseOk.md)
 - [ServerOverallStats](docs/ServerOverallStats.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



