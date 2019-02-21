package com.company;

public class Lorry extends Car {

    private float capacity;


    public Lorry(String mark, float weight, int power) {
        super(mark, weight, power);
        this.capacity = capacity;


    }
    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
    public void setMark(String s) {
        super.mark = s;
    }
}
