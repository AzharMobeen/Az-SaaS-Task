package com.az.etisalat.saas.service.impl;

import com.az.etisalat.saas.exception.CustomException;
import com.az.etisalat.saas.model.*;
import com.az.etisalat.saas.service.EtisalatSaasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class EtisalatSaasServiceImpl implements EtisalatSaasService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${etisalat.saas.service.url}")
    private String SERVICE_URL;

    @Value("${account.creation.uri}")
    private String ACCOUNT_CREATION_URI;

    @Value("${account.suspension.uri}")
    private String ACCOUNT_SUSPENSION_URI;

    @Value("${product.creation.uri}")
    private String PRODUCT_CREATION_URI;

    @Value("${product.suspension.uri}")
    private String PRODUCT_SUSPENSION_URI;


    @Override
    public AccountCreationResponse createAccount(AccountCreationRequest accountCreationRequest) {
        ResponseEntity<AccountCreationResponse> responseEntity = restTemplate.postForEntity(SERVICE_URL+ACCOUNT_CREATION_URI,accountCreationRequest,AccountCreationResponse.class);
        if(responseEntity.hasBody())
            return responseEntity.getBody();
        else
            throw  new CustomException("{error : Service Not found");
    }

    @Override
    public AccountSuspensionResponse suspendAccount(AccountSuspensionRequest accountSuspensionRequest) {
        ResponseEntity<AccountSuspensionResponse> responseEntity = restTemplate.postForEntity(SERVICE_URL+ACCOUNT_SUSPENSION_URI,accountSuspensionRequest,AccountSuspensionResponse.class);
        if(responseEntity.hasBody())
            return responseEntity.getBody();
        else
            throw  new CustomException("{error : Service Not found}");
    }

    @Override
    public ProductCreationResponse createProduct(ProductCreationRequest productCreationRequest) {
        ResponseEntity<ProductCreationResponse> responseEntity = restTemplate.postForEntity(SERVICE_URL+PRODUCT_CREATION_URI,productCreationRequest,ProductCreationResponse.class);
        if(responseEntity.hasBody())
            return responseEntity.getBody();
        else
            throw  new CustomException("{error : Service Not found}");

    }

    @Override
    public ProductSuspensionResponse suspendProduct(ProductSuspensionRequest productSuspensionRequest) {
        ResponseEntity<ProductSuspensionResponse> responseEntity = restTemplate.postForEntity(SERVICE_URL+PRODUCT_SUSPENSION_URI,productSuspensionRequest,ProductSuspensionResponse.class);
        if(responseEntity.hasBody())
            return responseEntity.getBody();
        else
            throw  new CustomException("{error : Service Not found}");
    }
}