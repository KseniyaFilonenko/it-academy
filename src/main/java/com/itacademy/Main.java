package com.itacademy;

public class Main
{
    public static void main( String[] args ) {
        Car car1 = new Car("Model1");
//        car1.height = 200;
//        car1.weight = 3000;
        Car car2 = new Car("Model2");
//        car2.height = 200;
//        car2.weight = 3000;
        Bus bus1 = new Bus("Bus1");
        Bus bus2 = new Bus("Bus2");
        car1.move2();
        bus2.move2();
        car2.printInfo();
        bus1.printInfo("Model1");
        bus2.printInfo(250);

        Engine engine = new Engine(200);
        Radiator radiator = new Radiator(300);
        Battery battery = new Battery(400);
        Car car3 = new Car(engine, battery, radiator);
    }
}
