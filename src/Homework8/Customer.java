package Homework8;

import java.util.UUID;

public class Customer {
    private UUID uuid;
    private String customerName;

    public Customer(String name) {
        this.customerName = name;
        this.uuid = UUID.randomUUID();
    }

    public UUID getCustomerId() {
        return uuid;
    }

    public String getCustomerName() {
        return customerName;
    }


    //String randomUUIDString = uuid.toString();
}
