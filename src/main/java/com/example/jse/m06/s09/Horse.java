/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s09;

/**
 * Horse "is-a" Mammal Neighing, and "has-a" Tail
 */
public class Horse extends Mammal implements Neighing {
    private Tail tail;

    /**
     * Constructor
     * 
     * @param gestationDays days to get a new horse
     * @param tailLen       the tail length
     */
    public Horse(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public void neigh() {
        System.out.println("MHMDHD");
    }

    @Override
    public String toString() {
        return "Horse [tail=" + tail + "]";
    }
}
