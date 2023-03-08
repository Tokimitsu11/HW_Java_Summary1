package oop2;

public class CarDemo {
    public static void main(String[] args) {

        Sedan sedan1 = new Sedan();
        Sedan sedan2 = new Sedan();
        Sedan sedan3 = new Sedan();

        SportCar sportCar1 = new SportCar();
        SportCar sportCar2 = new SportCar();
        SportCar sportCar3 = new SportCar();
        SportCar sportCar4 = new SportCar();

        Truck truck1 = new Truck();
        Truck truck2 = new Truck();
        Truck truck3 = new Truck();
        Truck truck4 = new Truck();

        Car[] garage = {
                sedan1, sedan2, sportCar1, sportCar3, truck2,
                truck1, sedan3, sportCar2, sportCar4, truck3, truck4};


        for (int i = 0; i < garage.length; i++) {
            garage[i].speedUp();
        }

    }
}