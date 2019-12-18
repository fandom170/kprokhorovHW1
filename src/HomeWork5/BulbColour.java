package HomeWork5;

public class BulbColour {
    private int orderNo;
    private String bulbColour;

    public BulbColour(int orderNo, String colour) {
        this.orderNo = orderNo;
        this.bulbColour = colour;
    }

    public String getBulbColor() {
        return bulbColour;
    }

    public int getOrderNumber() {
        return orderNo;
    }

}
