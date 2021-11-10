package shapes;

import java.awt.*;


public class Square extends Rectangle
{
     private int s; //side

    public Square(Point initPos, Color col, int side)
    {
        super(initPos,col,side,side);
        s = side;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x,pos.y, s, s);
    }
}
