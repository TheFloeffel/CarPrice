public class Main {

    public static void main(String[] args) {

        // Test UsedCar
        UsedCar car1 = new UsedCar(250000,"Tesla",100000);

        System.out.println(car1.getMileage());
        System.out.println(car1.getCarPrice());

        // Test CrashedCar
        CrashedCar car2 = new CrashedCar("not Tesla",100000,0);
        System.out.println(car2.getDamageLevel());
        System.out.println(car2.getCarPrice());

    }

}
