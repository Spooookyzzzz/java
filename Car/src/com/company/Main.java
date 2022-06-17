package com.company;

public class Main {

    public static void main(String[] args) {
        Moveable car1 = new Cars(400, Colors.Red, "Honda");
        Cars car2 = new Cars(200, Colors.Brown, "BMW");
        car1.move();
        car1.stop();
        Cars.invokeStaticMethod();
        System.out.println("Cars color: " + car2.getColor());
        System.out.println("Cars engine power: " + car2.getEnginePower());
        System.out.println(car2);
    }
}
