package oop.oop1;

abstract class ElectricalGoods {
    private String producer;
    private String model;
    private double weight;
    private double price;

    public String electricalGoodsPrint ( ) {
        return "ElectricalGoods{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public void setProducer (String producer) {
        this.producer = producer;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public void setWeight (double weight) {
        this.weight = weight;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}


