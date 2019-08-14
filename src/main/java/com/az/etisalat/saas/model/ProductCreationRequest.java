package com.az.etisalat.saas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import javax.validation.constraints.Positive;

@Data
public class ProductCreationRequest {

    @JsonProperty(value = "etisalat_account_number")
    @Positive(message = "Invalid Etisalat Account Number")
    private int etisalatAccountNumber;

    @Positive(message = "Invalid planID")
    private int planID;
}
