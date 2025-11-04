/**
 * @author znye
 * @createdOn 11/3/2025 at 7:39 PM
 * @projectName Software_Design_Principles-Final_Project
 * @packageName edu.neumont.csc360.model;
 */
package edu.neumont.csc360.model;

public class SportsCar implements Vehicle {
    @Override
    public String getType() {
        return "Sports Car";
    }

    @Override
    public int getHorsePower() {
        return 300;
    }
}
