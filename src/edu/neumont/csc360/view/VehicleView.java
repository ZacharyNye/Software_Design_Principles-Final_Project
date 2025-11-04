/**
 * @author znye
 * @createdOn 11/3/2025 at 7:39 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.view;
 */
package edu.neumont.csc360.view;

import edu.neumont.csc360.model.Vehicle;

public class VehicleView {
    public void displayVehicle(Vehicle vehicle) {
        System.out.println("Car Type: " + vehicle.getType());
        System.out.println("Horsepower: " + vehicle.getHorsePower());
    }
}
