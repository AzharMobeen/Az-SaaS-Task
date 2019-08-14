package com.az.etisalat.saas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.*;

@Data
public class AccountCreationRequest {

    @JsonProperty(value = "etisalat_account_number")
    @Positive(message = "Etisalat Account Number is mandatory")
    private int etisalatAccountNumber;

    @Positive(message = "Invalid planID")
    private int planID;

    @Positive(message = "Invalid Contact Number")
    @JsonProperty(value = "contact_number")
    private int contactNumber;

    @Email(message = "Invalid email")
    private String email;
}
