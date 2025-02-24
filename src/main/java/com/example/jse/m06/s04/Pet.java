/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s04;

/**
 * Data member access modifier - a sample class
 */
public class Pet {
    /** prefer private data member */
    private String name;
    protected double weight;
    static int count;
    // avoid public data member, if you can
    // public long doNotDoThis;

    // here, a static initializer is an overkill
    static {
        count = 12;
    }

    /**
     * Canonical constructor
     */
    public Pet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    private void increaseWeight() {
        weight += weight / 50;
    }

    void eat() {
        increaseWeight();
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
