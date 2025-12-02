# Software_Design_Principles-Final_Project
This is a setup repository for our final Software Design Principles project that uses different types of design principles

# Project Structure
I plan to use a basic structure from oop, Model View Controller main.java, This will keep things sorted and very organized.

# Notes or Plans
I want to make this simple but correct, and have the right implementations for the correct locations.

# 11/3/2025 Updates
This update demonstrates the Factory Design Pattern in an MVC style Java app.
The VehicleFactory is responsible for creating different types of vehicles without exposing the creation logic to the client.
This makes it easy to add new vehicle types in the future without modifying existing code.

Benefits of Factory Pattern

Encapsulation of object creation: clients don’t need to know which class to instantiate.

Scalability: easy to add new product types.

Clean MVC separation: the controller handles logic, the factory handles creation, and the view handles presentation.

# 11/24/2025 Updates
This update demonstrates the Strategy Design Pattern.
The Interface FuelStrategy creates a base line the prevents hardcoding information, used by both TruckFuelStrategy and SportFuelStrategy. Different vehicles consume fuel differently.
This allows vehicle behavior to change at runtime and keeps the system open for modification but closed for changes (Open/Closed Principle). Which we slightly went over today in class.

Benefits of Strategy Pattern

Easier expansion, New cars or fuel behaviors can be added without changing existing code.

Separation of concerns, Vehicle creation and behavior logic are modular.

# 12/1/2025 Updates
This update demonstrates the Decorator Design Pattern.
This is used to extend vehicle functionality without modifying the original classes.
This pattern wraps a vehicle inside an upgrade class that adds new behavior.

Benefits of Decorator Pattern

Vehicles gain new features without modification to main class

Upgrades can be applied, removed, and stacked

Clean and modular design

