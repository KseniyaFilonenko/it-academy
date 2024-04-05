package com.itacademy;

public class Main
{
    public static void main( String[] args ) {
        Car car1 = new Car("Model1");
        Car car2 = new Car("Model2");
        Bus bus1 = new Bus("Bus1");
        Bus bus2 = new Bus("Bus2");

        Transport car3 = new Car("Model3");
        Transport bus3 = new Bus("Bus3");
        car3.move(car3);
        car1.uniqueCarMethod2();
        car1.methodForCarBus();
        bus1.methodForCarBus();

        Transport transport = getTransport(true);

        car1.move2();
        car2.printInfo();
        bus1.printInfo("Model1");
        bus2.printInfo(250);

        Engine engine = new Engine(200);
        Radiator radiator = new Radiator(300);
        Battery battery = new Battery(400);
        Car car4 = new Car(engine, battery, radiator);

    }
    private static Transport getTransport(boolean b) {
        if (b) {
            return new Car("Model1");
        } else
            return new Bus("Bus2");
    }
}
