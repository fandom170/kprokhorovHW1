package Homework8;

import java.util.ArrayList;
import java.util.List;

public class InvoiceCreation {
    public Invoice createInvoice() {
        Invoice invoice = new Invoice();
        List<Shipment> shipmentList = new ArrayList<>();
        List<Order> orderList1 = new ArrayList<>();

        Customer customer1 = new Customer();
        customer1.setCustomerUUID();
        customer1.setCustomerName("Customer1");

        Customer customer2 = new Customer();
        customer2.setCustomerUUID();
        customer2.setCustomerName("Customer2");


        Order order1 = new Order();
        order1.setCustomer(customer1);
        order1.setProductType("GoodType1");
        order1.setQuantiuty(10);

        Order order2 = new Order();
        order2.setCustomer(customer2);
        order2.setProductType("GoodType2");
        order2.setQuantiuty(11);

        orderList1.add(order1);
        orderList1.add(order2);

        Shipment shipment1 = new Shipment();
        shipment1.setShipmentAddress("Pensilvania av. 1603");
        shipment1.setShipmentId("shipment" + _helpers.OrderNo);
        shipment1.setShipmentName();

        shipment1.setOrdersList(orderList1);

        shipmentList.add(shipment1);

        invoice.setShipmentList(shipmentList);

        return invoice;

    }
}
