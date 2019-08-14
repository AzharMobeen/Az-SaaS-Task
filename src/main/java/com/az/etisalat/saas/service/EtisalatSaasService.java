package com.az.etisalat.saas.service;

import com.az.etisalat.saas.model.*;

public interface EtisalatSaasService {

    AccountCreationResponse createAccount(AccountCreationRequest accountCreationRequest);
    AccountSuspensionResponse suspendAccount(AccountSuspensionRequest accountSuspensionRequest);
    ProductSuspensionResponse suspendProduct(ProductSuspensionRequest productSuspensionRequest);
    ProductCreationResponse createProduct(ProductCreationRequest productCreationRequest);
}
