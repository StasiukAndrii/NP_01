package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetails {
    String name;
    String surname;
    String email;
    String phone;
    public OrderDetails(
            @JsonProperty("name") String name,
            @JsonProperty("surname") String surname,
            @JsonProperty("email") String email,
            @JsonProperty("phone") String phone)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
    }
}
