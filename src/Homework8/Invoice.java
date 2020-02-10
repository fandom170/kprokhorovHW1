package Homework8;

import java.util.List;

public class Invoice {
    private List<Shipment> shipmentList;

    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipList) {
        shipmentList.addAll(shipList);
    }
}
