package edu.guilford;

import java.util.Random;

public class Rational {
    //Define 2 integer attributes, numerator and denominator
    private int numerator;
    private int denominator;

    //Define a constructor that takes no arguments and sets the numerator to 0 and the denominator to 1
    public Rational() {
        Random rand = new Random();
        //Set the numerator and denominator to be between -100 and 100
        numerator = rand.nextInt(201) - 100;
        denominator = rand.nextInt(201) - 100;
        //Add code that if denominator is zero have the constructor select a new random number for the denominator
        while (denominator == 0) {
            denominator = rand.nextInt(201) - 100;
        }
    }    

    //Add a toString method that displays a Rational object in a reasonable format
    public String toString() {
        return numerator + "/" + denominator;
    }
    
    //Add a second constructor that takes two arguments and uses them to initialize the attributes
    public Rational(int n, int d) {
        numerator = n;
        denominator = d;
    //Add code that prints out a warning if the denominator is zero
        if (denominator == 0) {
            System.out.println("Warning: denominator is zero");
        }
    }

    //Add a method called negate that reverses the sign of a rational number
    public void negate() {
        numerator = -numerator;
    }

    //Add a method called invert that swaps the numerator and denominator
    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    //Add a method called toDouble that converts the rational number to a double and returns the result
    public double toDouble() {
        return (double) numerator / denominator;
    }

    //Write a method called add that takes a Rational number as an argument, adds it to the rational number 
    //represented by the current object, and returns the result as a new Rational object
    public Rational add(Rational r) {
        int n = numerator * r.denominator + r.numerator * denominator;
        int d = denominator * r.denominator;
        return new Rational(n, d);
    }


}
