package Homework8;

import java.io.IOException;
import java.util.List;

//import org.json.JSONObject;

public class JSON_XML_Processing {
    public static void main(String[] args) throws IOException {

        InvoiceCreation ic = new InvoiceCreation();
        Invoice invoice = ic.createInvoice();

        JSONprocessing jp = new JSONprocessing();
        Invoice readInvoice = jp.readJSON();

        List<Shipment> shipmentListRead = readInvoice.getShipments();

        readInvoice.setShipmentList(shipmentListRead);

        jp.printJSONData(readInvoice, true);
        jp.printJSONData(invoice, true);

        readInvoice.getShipments().addAll(invoice.getShipments());
        jp.writeJSON(readInvoice);

    }
}
