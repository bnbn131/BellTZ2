package com.company;

public class Car {
    protected  String mark;

    private double weight;

    private int power;


    public Car(String mark, double weight,int power) {
        this.mark = mark;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
