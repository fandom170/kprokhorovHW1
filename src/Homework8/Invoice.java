package Homework8;

import java.util.List;

public class Invoice {
    private List<Shipment> shipments;

    //public Invoice () {}
    public List<Shipment> getShipments() {
        return shipments;
    }

    public void setShipmentList(List<Shipment> shipList) {
        shipments = shipList;
    }
}
