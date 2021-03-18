public class CrashedCar extends Car {

    private int damageLevel;

    public CrashedCar(String model, double startprice, int damageLevel) {
        super(model, startprice);
        this.damageLevel = damageLevel;
    }

    public int getDamageLevel() {
        return damageLevel;
    }

    public void setDamageLevel(int damageLevel) {

        if (damageLevel < 0 || damageLevel > 3) {
            System.out.println("Invalid damage level!");
        }else {
            this.damageLevel = damageLevel;
        }
    }

    @Override
    public double getCarPrice() {
        double newprice = startprice;
        double reduction;

        switch (damageLevel) {
            case 0:
                reduction = 0.1;
            break;

            case 1:
                reduction = 0.5;
            break;

            case 2:
                reduction = 0.9;
            break;

            default:
                reduction = 1;
        }

        newprice = startprice -(startprice * reduction);

        return newprice;
    }
}
