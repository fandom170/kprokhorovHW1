package Homework8;

import java.util.List;

public class Shipment {
    private String shipmentId;
    private String shipmentAddress;
    private List<Order> orderList;

    public Shipment() {
        //orderList = new List <Order>();
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public String getShipmentId() {
        return shipmentId;
    }
}
