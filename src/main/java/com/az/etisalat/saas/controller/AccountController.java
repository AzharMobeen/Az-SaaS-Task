package com.az.etisalat.saas.controller;

import com.az.etisalat.saas.model.*;
import com.az.etisalat.saas.service.EtisalatSaasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AccountController {

    @Autowired
    private EtisalatSaasService etisalatSaasService;

    @PostMapping("/createAccount")
    public AccountCreationResponse createAccount(@Valid @RequestBody AccountCreationRequest accountCreationRequest){
        return etisalatSaasService.createAccount(accountCreationRequest);
    }

    @PostMapping("/suspendAccount")
    public AccountSuspensionResponse suspendAccount(@Valid @RequestBody AccountSuspensionRequest accountSuspensionRequest){
        return etisalatSaasService.suspendAccount(accountSuspensionRequest);
    }
}
