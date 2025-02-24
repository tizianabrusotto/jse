/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s07;

/**
 * Control flow - Decision: if else if ... else using an enum
 */
public class IfDay {
    /**
     * Pick a week day randomly, then print the associated food of the day
     * 
     * @param args not used
     * @see WeekDay enumerator for the week days
     */
    public static void main(String[] args) {
        WeekDay today = aDay();
        System.out.println("Today is " + today);

        if (today == WeekDay.MONDAY) {
            System.out.println("Chinese");
        } else if (today == WeekDay.TUESDAY) {
            System.out.println("Hamburger");
        } else if (today == WeekDay.WEDNESDAY) {
            System.out.println("Pasta");
        } else if (today == WeekDay.THURSDAY) {
            System.out.println("Fish and Chips");
        } else if (today == WeekDay.FRIDAY) {
            System.out.println("Pizza");
        }
        // We can explicit check the other days ...
        // else if (today == WeekDay.SATURDAY || today == WeekDay.SUNDAY) {
        //
        // ... or we can implicitly consider all other days
        else {
            System.out.println("Something else");
        }
    }

    /**
     * A randomly chosen week day
     * 
     * @return a WeekDay
     * @see WeekDay enumerator for week days
     */
    private static WeekDay aDay() {
        WeekDay[] days = WeekDay.values();
        return days[(int) (Math.random() * days.length)];
    }
}
