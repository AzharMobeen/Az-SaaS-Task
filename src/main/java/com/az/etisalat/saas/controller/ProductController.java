package com.az.etisalat.saas.controller;

import com.az.etisalat.saas.model.ProductCreationRequest;
import com.az.etisalat.saas.model.ProductCreationResponse;
import com.az.etisalat.saas.model.ProductSuspensionRequest;
import com.az.etisalat.saas.model.ProductSuspensionResponse;
import com.az.etisalat.saas.service.EtisalatSaasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private EtisalatSaasService etisalatSaasService;

    @PostMapping("/createProduct")
    public ProductCreationResponse createProduct(@Valid @RequestBody ProductCreationRequest productCreationRequest){
        return etisalatSaasService.createProduct(productCreationRequest);
    }

    @PostMapping("/suspendProduct")
    public ProductSuspensionResponse suspendProduct(@Valid @RequestBody ProductSuspensionRequest productSuspensionRequest){
        return etisalatSaasService.suspendProduct(productSuspensionRequest);
    }
}
