package com.az.etisalat.saas.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductSuspensionResponse {

    @JsonProperty("data")
    private CommonResponse commonResponse;
}
