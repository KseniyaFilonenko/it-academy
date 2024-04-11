package com.itacademy.Hometask6;

public abstract class Transport {
        private String model;
        private int height;
        private int weight;
        private int maxSpeed;
        Engine engine;
        Battery battery;
        Radiator radiator;
        public Transport(Engine engine, Battery battery, Radiator radiator){
            this.engine = engine;
            this.battery = battery;
            this.radiator = radiator;
        }
        public void printInfo() {
        System.out.println("Метод не принимает параметры");
        }
        public void printInfo(String model) {
        System.out.println("Метод принимает String");
        }
        public void printInfo(int height) {
        System.out.println("Метод принимает int");
        }
        public abstract void move(Transport car3);
        public void move2() {
            System.out.println("Transport is moving");
        }
        public void transportQty () {
            int square = height * weight;
            System.out.println(square);
        }
        public Transport (String modelName) {
            model = modelName;
        }
        public int getMaxSpeed() {
            return maxSpeed;
    }
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
    }
}
