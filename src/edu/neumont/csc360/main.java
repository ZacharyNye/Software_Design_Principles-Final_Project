/**
 * @author znye
 * @createdOn 11/3/2025 at 7:37 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360;
 */
package edu.neumont.csc360;

import edu.neumont.csc360.controller.VehicleController;
import edu.neumont.csc360.model.SportsCar;
import edu.neumont.csc360.model.Vehicle;
import edu.neumont.csc360.strategy.SportFuelStrategy;

public class main {
    public static void main(String[] args) {
        VehicleController controller = new VehicleController();
        controller.createAndShowVehicle("Sedan");
        controller.createAndShowVehicle("Truck");
        controller.createAndShowVehicle("SportsCar");

        System.out.println();
        System.out.println();

        Vehicle sportsCar = new SportsCar();
        sportsCar.setFuelStrategy(new SportFuelStrategy());
        controller.addUpgrade(sportsCar, "nitrous");

        System.out.println();
        System.out.println();

        controller.addUpgrade(sportsCar, "shocks");
    }
}

