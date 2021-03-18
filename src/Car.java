abstract class Car {

    protected String model;
    protected double startprice;

    public Car(String model, double startprice) {
        this.model = model;
        this.startprice = startprice;
    }

    public abstract double getCarPrice();

}
