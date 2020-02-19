package Homework8;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public class Customer {
    private UUID customerId;
    private String customerName;

    public UUID getCustomerId() {
        return customerId;
    }


    public void setCustomerId(UUID id) {
        customerId = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String custName) {
        customerName = custName;
    }

    @JsonIgnore
    public void setCustomerUUID() {
        customerId = UUID.randomUUID();
    }

}
