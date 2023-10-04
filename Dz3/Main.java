import Interfaces.Figure;
import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();

        try {
            figures.add(new Triangle(3, 4, 5));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            figures.add(new Circle(3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            figures.add(new Rectangle(6, 4));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            figures.add(new Square(3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        for (Figure item : figures) {
            System.out.println(item.getInfo());
        }
    }
}