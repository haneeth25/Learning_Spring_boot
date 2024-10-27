package com.haneeth.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OrderRecord(@JsonProperty("c-name") String custname, String prodName, int quantity) {

}
