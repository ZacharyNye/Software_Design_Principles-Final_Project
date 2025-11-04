/**
 * @author znye
 * @createdOn 11/3/2025 at 7:39 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.factory;
 */
package edu.neumont.csc360.factory;

import edu.neumont.csc360.model.*;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "truck":
                return new Truck();
            case "sportscar":
                return new SportsCar();
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}


