package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB
{
    ArrayList<Shape> shapes = new ArrayList<>(); // FIELDS

    void addSquare(Point initPos, Color col, int side) {
        Square square = new Square(initPos, col, side);
        shapes.add(square);
    }

    void addRect(Point initPos, Color col, int width, int height) {
        Rectangle rect = new Rectangle(initPos, col, width, height);
        shapes.add(rect);
    }

    void addCircle(Point initPos, Color col, int radius) // Methods
    {
        Circle circ = new Circle(initPos, col, radius);
        shapes.add(circ);
    }
    void drawShapes(Graphics g)
    {
        for (Shape s: shapes)
        {
            s.draw(g);
        }
    }
}




