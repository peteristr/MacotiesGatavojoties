public class CarLauncher {
    public static void main(String[] args) {
        Car car = new Car();
//savada datus pēc veida
        car.setModel("Tesla Model M");
        car.setCarOwner("Elon Musk");
        car.setColor("Black");
        car.setNew(true);
        car.setVin("ww313535w135w135");
        car.setYear(2020);
//norāda ko izprintē
        System.out.println(car.getCarOwner());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
        System.out.println(car.getVin());
        System.out.println(car.getYear());
        System.out.println(car.isNew());


    }

}
