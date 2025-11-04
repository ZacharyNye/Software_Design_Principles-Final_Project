/**
 * @author znye
 * @createdOn 11/3/2025 at 7:37 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360;
 */
package edu.neumont.csc360;

import edu.neumont.csc360.controller.VehicleController;

public class main {
    public static void main(String[] args) {
        VehicleController controller = new VehicleController();
        controller.createAndShowVehicle("Sedan");
        controller.createAndShowVehicle("Truck");
        controller.createAndShowVehicle("SportsCar");
    }
}

