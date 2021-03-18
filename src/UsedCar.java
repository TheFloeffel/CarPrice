public class UsedCar extends Car {

    private double mileage;

    public UsedCar(double mileage, String model, double startprice) {
        super(model, startprice);
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public double getCarPrice() {
        double newprice = startprice;

        int reduction = (int) (mileage / 10000);

        newprice = startprice - (startprice * reduction * 0.05);

        if (newprice < 0) {
            return 0;
        }else {
            return newprice;
        }
    }

}
