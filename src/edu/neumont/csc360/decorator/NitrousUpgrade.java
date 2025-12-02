/**
 * @author znye
 * @createdOn 12/1/2025 at 6:15 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.decorator;
 */
package edu.neumont.csc360.decorator;

import edu.neumont.csc360.model.Vehicle;

public class NitrousUpgrade extends VehicleDecorator {

    public NitrousUpgrade(Vehicle decoratedVehicle) {
        super(decoratedVehicle);
    }

    @Override
    public String getType() {
        return decoratedVehicle.getType() + " + Nitrous Upgrade";
    }

    @Override
    public int getHorsePower() {
        return decoratedVehicle.getHorsePower() + 50;
    }
}

