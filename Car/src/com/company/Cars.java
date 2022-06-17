package com.company;

public class Cars implements Moveable {
    private static final int wheels = 4;
    private final Engine engine;
    private final Colors color;
    private final String model;

    public Cars(int enginePower, Colors color, String model) {
        showCarCreationMessage();
        this.engine = new Engine(enginePower);
        this.color = color;
        this.model = model;
    }

    private static void showCarCreationMessage() {
        System.out.println("Car created!");
    }

    public static void invokeStaticMethod() {
        System.out.println("Static method invoked!");
    }

    @Override
    public void move() {
        System.out.println("Car is moving!");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped!");
    }

    public Colors getColor() {
        return color;
    }

    public int getEnginePower() {
        return engine.power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car color: " + this.color + " || Car model: " + this.model;
    }
}