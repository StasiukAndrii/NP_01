package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    String productCode;
    int quantity;
    String unit;
    public Product (
            @JsonProperty("productCode") String productCode,
            @JsonProperty("quantity") int quantity,
            @JsonProperty("unit") String unit
    )
    {
        this.productCode = productCode;
        this.quantity = quantity;
        this.unit = unit;
    }
}
