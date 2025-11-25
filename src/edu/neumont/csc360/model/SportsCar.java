/**
 * @author znye
 * @createdOn 11/3/2025 at 7:39 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.model;
 */
package edu.neumont.csc360.model;

import edu.neumont.csc360.strategy.FuelStrategy;

public class SportsCar implements Vehicle {
    private FuelStrategy fuelStrategy;

    @Override
    public String getType() {
        return "Sports Car";
    }

    @Override
    public int getHorsePower() {
        return 300;
    }

    @Override
    public void setFuelStrategy(FuelStrategy strategy) {
        this.fuelStrategy = strategy;
    }

    @Override
    public double computeFuelUsage(int distance) {
        return fuelStrategy.calculateFuelUsage(distance);
    }
}
