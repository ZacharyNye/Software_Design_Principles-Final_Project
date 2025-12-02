/**
 * @author znye
 * @createdOn 11/3/2025 at 7:44 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.controller;
 */
package edu.neumont.csc360.controller;

import edu.neumont.csc360.decorator.NitrousUpgrade;
import edu.neumont.csc360.decorator.ShocksUpgrade;
import edu.neumont.csc360.factory.VehicleFactory;
import edu.neumont.csc360.model.Vehicle;
import edu.neumont.csc360.view.VehicleView;

public class VehicleController {
    private final VehicleView view = new VehicleView();

    public void createAndShowVehicle(String type) {
        try {
            Vehicle vehicle = VehicleFactory.createVehicle(type);
            view.displayVehicle(vehicle);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void createVehicle(Vehicle vehicle) {
        try {
            view.displayVehicle(vehicle);
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showVehicle(Vehicle vehicle) {
        view.displayVehicle(vehicle);
    }

    public void addUpgrade(Vehicle vehicle, String upgradeType) {
        switch (upgradeType.toLowerCase()) {
            case "nitrous":
                vehicle = new NitrousUpgrade(vehicle);
                break;

            case "shocks":
                vehicle = new ShocksUpgrade(vehicle);
                break;

            default:
                System.out.println("Unknown upgrade.");
        }
        view.displayVehicle(vehicle);
    }

}
