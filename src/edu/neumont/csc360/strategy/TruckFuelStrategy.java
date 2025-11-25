/**
 * @author znye
 * @createdOn 11/24/2025 at 6:39 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.strategy;
 */
package edu.neumont.csc360.strategy;

public class TruckFuelStrategy implements FuelStrategy {
    @Override
    public double calculateFuelUsage(int distance) {
        return distance * 0.20;
    }
}

