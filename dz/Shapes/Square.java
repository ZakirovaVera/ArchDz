package Shapes;

import Interfaces.Figure;

public class Square extends Figure {

    private double side;

    public Square(double side) throws RuntimeException {
        if (side <= 0) {
            throw new RuntimeException("Error: The length of all side of a Square must be positive.");
        }
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }

    @Override
    public double calcPerimeter() {
        return 4 * side;
    }

    @Override
    public String getInfo() {
        return "Square with " + side + " has area: " + calcArea() + " and perimeter: " + calcPerimeter();
    }
}
