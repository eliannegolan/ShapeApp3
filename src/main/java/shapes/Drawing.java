package shapes;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas
{


    private Frame f; // =private field  of class frame, in awt
    private Circle c;
    private Rectangle r;
    private Square q;
    public ShapeDB db = new ShapeDB();
    private Point p1;
    private Point p2;
    private Point p3;
    private Color col;

    public Drawing()
    {
        Point p1 = new Point(50,50);
        Point p2 = new Point(50,30);
        Point p3 = new Point(10,80);
        Color col = new Color(0x992266);
        setupFrame();
        setupBackground();

    }

    public void addCircle()
    {
        db.addCircle(p1,col,10);

    }

    public void addRect()
    {
        db.addRect(p2,col,5,10);
    }

    public void addSquare()
    {
        db.addSquare(p3, col, 12);
    }


    private void setupBackground() {
        setBackground(Color.WHITE);  //sets Canvas background
        setSize(400,400);              // Sets Canavs size to same of frame
    }

    private void setupFrame() {
        f = new Frame("My window"); //instantiates Frame
        f.add(this);                //Adds Canvas to Frame
        f.setLayout(null);          //Stops frame from trying to layout contents
        f.setSize(400,400);         //Sets dimensions of frame
        f.setVisible(true);         //makes frame appear on screen
        f.addWindowListener(new WindowAdapter() //closes program if close window clicked
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
    }



    public void paint(Graphics g)
    {
        db.drawShapes(g);
    }


}
