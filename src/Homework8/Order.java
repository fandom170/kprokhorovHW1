package Homework8;

public class Order {
    private int orderId;
    private String productType;
    private int productQuantity;
    private Customer customer;

    public Order() {
        this.orderId = _helpers.OrderNo++;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String type) {
        productType = type;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setQuantiuty(int qty) {
        productQuantity = qty;
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
