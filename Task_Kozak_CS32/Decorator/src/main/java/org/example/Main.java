package org.example;

import org.example.decorator.BasicCar;
import org.example.decorator.Car;
import org.example.decorator.LuxuryCar;
import org.example.decorator.SportsCar;

public class Main {
    public static void main(String[] args) {

        Car sportCar = new SportsCar(new BasicCar());
        sportCar.assemble();
        System.out.println("--------\n");

        Car sportLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportLuxuryCar.assemble();

    }
}