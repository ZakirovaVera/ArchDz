package Shapes;

import Interfaces.Figure;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) throws RuntimeException {

        if (sideA <= 0 || sideB <= 0){
            throw new RuntimeException("Error: The length of all sides of a Rectangle must be positive.");
        }
        if (sideA == sideB){
            throw new RuntimeException("Error: Not a Rectangle, one side must be larger than the other.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String getInfo() {
        return "Rectangle with " + sideA + ", " + sideB + " has area: " + calcArea() + " and perimeter: " + calcPerimeter();
    }
}
