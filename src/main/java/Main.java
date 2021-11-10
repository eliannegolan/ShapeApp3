import drawingUI.DrawingUIController;


import drawingUI.DrawingUIController;

import javax.swing.*;
import java.awt.*;

public class Main
{
    static GraphicsConfiguration gc; // Class field containing config info
    public JPanel mainPanel;
    Point p1 = new Point(50,50);
    Point p2 = new Point(50,30);
    Point p3 = new Point(10,80);
    Color col = new Color(0x992266);


    public static void main(String[] args) {
        DrawingUIController duc = new DrawingUIController();
        JFrame frame = new JFrame(gc); // Create a new JFrame
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.add(duc.getMainPanel());



        // This next line closes the program when the frame is closed
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

