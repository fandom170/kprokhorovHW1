package HomeWork5;

public class BulbBlank {
    private int orderNo;
    private String bulbColour = Colours.colors[7];

    public BulbBlank(int orderNo) {
        this.orderNo = orderNo + 1;

    }

    public int getNumber() {
        return orderNo;
    }


}
