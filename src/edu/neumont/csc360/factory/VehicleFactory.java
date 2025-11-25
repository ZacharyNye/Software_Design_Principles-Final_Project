/**
 * @author znye
 * @createdOn 11/3/2025 at 7:39 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.factory;
 */
package edu.neumont.csc360.factory;

import edu.neumont.csc360.model.*;
import edu.neumont.csc360.strategy.SportFuelStrategy;
import edu.neumont.csc360.strategy.TruckFuelStrategy;

public class VehicleFactory {
    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "truck":
                Truck t  = new Truck();
                t.setFuelStrategy(new TruckFuelStrategy());
                return t;
            case "sportscar":
                SportsCar s = new SportsCar();
                s.setFuelStrategy(new SportFuelStrategy());
                return s;
            default:
                throw new IllegalArgumentException("Unknown car type: " + type);
        }
    }
}


