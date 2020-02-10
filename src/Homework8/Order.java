package Homework8;

public class Order {
    private int orderId;
    private String goodType;
    private int quantity;
    private Customer customer;

    public Order() {
        this.orderId = _helpers.OrderNo++;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String type) {
        goodType = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantiuty(int qty) {
        quantity = qty;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer cust) {
        customer = cust;
    }

    public int getOrderId() {
        return orderId;
    }
}
