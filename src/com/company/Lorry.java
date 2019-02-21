package com.company;

public class Lorry extends Car {

    private double capacity;


    public Lorry(String mark, double weight, int power) {
        super(mark, weight, power);
        this.capacity = capacity;


    }
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    public void setMark(String s) {
        super.mark = s;
    }
}
