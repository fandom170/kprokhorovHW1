package Homework8;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONprocessing {

    private final static String filePath = "src/Homework8/invoice.json";

    public void writeJSON(Invoice invoice) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        mapper.writeValue(new File(filePath), invoice);

    }

    public Invoice readJSON() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Invoice invoice = mapper.readValue(new File(filePath), Invoice.class);
        System.out.println("Invoice has been read" + invoice.toString());
        return invoice;
    }

    public void printJSONData(Invoice invoice, boolean printOrders) {
        System.out.println("Invoice data");
        List<Shipment> shipments = invoice.getShipments();
        for (Shipment shipment : shipments) {
            System.out.println("Shipment ID = " + shipment.getShipmentId());
            System.out.println("Shipment Name = " + shipment.getShipmentName());
            System.out.println("Shipment Address = " + shipment.getShipmentAddress());
            if (printOrders) {
                List<Order> orderList = shipment.getOrdersList();
                for (Order order : orderList) {
                    System.out.println("Order ID = " + order.getOrderId());
                    System.out.println("Product Type = " + order.getProductType());
                    System.out.println("Product qty = " + order.getProductQuantity());
                    Customer customer = order.getCustomer();
                    System.out.println("Customer Name = " + customer.getCustomerName());
                    System.out.println("Customer ID = " + customer.getCustomerId());
                }
            }
        }
    }


}
