package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    int productCode;
    int quantity;
    String unit;
    public Product (
            @JsonProperty("productCode") int productCode,
            @JsonProperty("quantity") int quantity,
            @JsonProperty("unit") String unit
    )
    {
        this.productCode = productCode;
        this.quantity = quantity;
        this.unit = unit;
    }
}
