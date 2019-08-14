package com.az.etisalat.saas.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@Data
public class CommonResponse {

    @JsonProperty("test_mode")
    private boolean testMode;
    private int accountID;
    private int productID;
    private int planID;
    @JsonProperty("etisalat_account_number")
    private int etisalatAccountNumber;
}
