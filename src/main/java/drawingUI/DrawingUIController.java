package drawingUI;


import shapes.Drawing;

import javax.swing.*;
import java.awt.*;

public class DrawingUIController extends JPanel
{
    public JPanel controlsPanel;
    public JPanel mainPanel;
    public Drawing drawing;



    public DrawingUIController()
    {
        Drawing drawing = new Drawing();
        JPanel jp = new JPanel();
        controlsPanel = new JPanel();
        mainPanel = new JPanel();

        controlsPanel.setLayout(new GridLayout(3,1));
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.add(drawing);
        mainPanel.add(controlsPanel);
        drawing.addCircle();
        drawing.addRect();
        drawing.addSquare();



    }



    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void drawing() {
    }
}
