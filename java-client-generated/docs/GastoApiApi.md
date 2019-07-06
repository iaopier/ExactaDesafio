# GastoApiApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST**](GastoApiApi.md#createUsingPOST) | **POST** /api/v1/gastos | Cria um novo gasto
[**deleteUsingDELETE**](GastoApiApi.md#deleteUsingDELETE) | **DELETE** /api/v1/gastos/{id} | Deleta um gasto existente
[**findAllUsingGET**](GastoApiApi.md#findAllUsingGET) | **GET** /api/v1/gastos | Retorna lista de gastos
[**findByIdUsingGET**](GastoApiApi.md#findByIdUsingGET) | **GET** /api/v1/gastos/{id} | Retorna gasto específico por ID
[**updateUsingPUT**](GastoApiApi.md#updateUsingPUT) | **PUT** /api/v1/gastos/{id} | Cria um novo gasto ou atualiza um existente


<a name="createUsingPOST"></a>
# **createUsingPOST**
> Gasto createUsingPOST(gasto)

Cria um novo gasto

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GastoApiApi;


GastoApiApi apiInstance = new GastoApiApi();
Gasto gasto = new Gasto(); // Gasto | gasto
try {
    Gasto result = apiInstance.createUsingPOST(gasto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastoApiApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gasto** | [**Gasto**](Gasto.md)| gasto |

### Return type

[**Gasto**](Gasto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingDELETE"></a>
# **deleteUsingDELETE**
> ResponseEntity deleteUsingDELETE(id)

Deleta um gasto existente

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GastoApiApi;


GastoApiApi apiInstance = new GastoApiApi();
Long id = 789L; // Long | id
try {
    ResponseEntity result = apiInstance.deleteUsingDELETE(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastoApiApi#deleteUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**ResponseEntity**](ResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="findAllUsingGET"></a>
# **findAllUsingGET**
> List&lt;Gasto&gt; findAllUsingGET()

Retorna lista de gastos

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GastoApiApi;


GastoApiApi apiInstance = new GastoApiApi();
try {
    List<Gasto> result = apiInstance.findAllUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastoApiApi#findAllUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Gasto&gt;**](Gasto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findByIdUsingGET"></a>
# **findByIdUsingGET**
> Gasto findByIdUsingGET(id)

Retorna gasto específico por ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GastoApiApi;


GastoApiApi apiInstance = new GastoApiApi();
Long id = 789L; // Long | id
try {
    Gasto result = apiInstance.findByIdUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastoApiApi#findByIdUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Gasto**](Gasto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateUsingPUT"></a>
# **updateUsingPUT**
> Gasto updateUsingPUT(gasto, id)

Cria um novo gasto ou atualiza um existente

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GastoApiApi;


GastoApiApi apiInstance = new GastoApiApi();
Gasto gasto = new Gasto(); // Gasto | gasto
Long id = 789L; // Long | id
try {
    Gasto result = apiInstance.updateUsingPUT(gasto, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GastoApiApi#updateUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gasto** | [**Gasto**](Gasto.md)| gasto |
 **id** | **Long**| id |

### Return type

[**Gasto**](Gasto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

