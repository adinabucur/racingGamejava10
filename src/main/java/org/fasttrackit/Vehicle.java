package org.fasttrackit;

public class Vehicle {


    String name;
    String color;
    int doorCount;
    double mileage;


    public double accelarate(double speed, double durationHours) {

        System.out.println(name + " accelarated with " + speed + " km/h for " +durationHours + " hours");

        double traveldistance = speed * durationHours;

        System.out.println("Traveled distance: " + traveldistance);

        return 10.6;
    }
}


