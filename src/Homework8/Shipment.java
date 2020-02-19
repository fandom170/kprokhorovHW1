package Homework8;

import java.util.List;

public class Shipment {
    private String shipmentId;
    private String shipmentAddress;
    private String shipmentName;
    private List<Order> ordersList;

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setOrdersList(List<Order> listOfOrders) {
        ordersList = listOfOrders;
    }

    public void setShipmentAddress(String address) {
        shipmentAddress = address;
    }

    public void setShipmentId(String currentShipmentId) {
        shipmentId = currentShipmentId;
    }

    public String getShipmentName() {
        return shipmentName;
    }

    public void setShipmentName() {
        shipmentName = shipmentAddress.substring(0, 3) + shipmentId.substring(0, 1);
    }

}
