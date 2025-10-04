package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
     String orderID;
     OrderDetails orderDetails;
     List<Product> products;

    public Order(
            @JsonProperty("orderDetails") OrderDetails orderDetails,
            @JsonProperty("products") List<Product> products
    ) {
        this.orderDetails = orderDetails;
        this.products = products;
    }

}

