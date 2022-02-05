package oop.oop1;

public class Tablet extends ElectricalGoods {
    private final String model;
    private final double price;

    public Tablet (String model ,double price) {
        this.model = model;
        this.price = price;
    }


    @Override
    public String electricalGoodsPrint ( ) {
        return "ElectricalGoods {"+
                "model='" + model + '\'' +
                 ", price=" + price +
                '}';
    }

    public void tablet ( ) {
        System.out.println ( "На планшете играют" );
    }
}
