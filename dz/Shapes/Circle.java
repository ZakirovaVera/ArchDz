package Shapes;

import java.text.DecimalFormat;

import Interfaces.Figure;

public class Circle extends Figure {

    private double diametr;

    public Circle(double diametr) throws RuntimeException {
        if (diametr <= 0) {
            throw new RuntimeException("Error: diameter Circle must be a positive number");
        }
        this.diametr = diametr;
    }

    @Override
    public double calcArea() {
        return Math.PI / 4 * Math.pow(2, diametr);
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * diametr;
    }

    @Override
    public String getInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        // String result = decimalFormat.format(value);
        return "Circle with " + diametr + " has area: " + decimalFormat.format(calcArea()) + " and perimeter: " + decimalFormat.format(calcPerimeter());
    }
}
