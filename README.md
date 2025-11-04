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
