package org.fasttrackit;

public class Vehicle {

    public static int vehicleCount;

    private String name;
    private String color;
    private int doorCount;
    double mileage;

    public Vehicle() {
    vehicleCount++;
   }
    public double accelarate(double speed, double durationHours) {

        System.out.println(name + " accelarated with " + speed + " km/h for " +durationHours + " hours");

        double traveldistance = speed * durationHours;

        System.out.println("Traveled distance: " + traveldistance);

        return 10.6;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}


