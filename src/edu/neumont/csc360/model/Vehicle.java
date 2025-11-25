/**
 * @author znye
 * @createdOn 11/3/2025 at 7:38 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.model;
 */
package edu.neumont.csc360.model;

import edu.neumont.csc360.strategy.FuelStrategy;

public interface Vehicle {
    String getType();
    int getHorsePower();

    void setFuelStrategy(FuelStrategy strategy);
    double computeFuelUsage(int distance);
}
