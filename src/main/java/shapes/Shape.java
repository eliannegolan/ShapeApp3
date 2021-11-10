package shapes;

import java.awt.*;

public abstract class Shape implements Drawable {
    protected Point pos;
    protected Color col;

    public Shape(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }

    public abstract void draw(Graphics g);

    //  public class Shape implements draw(Graphics g);
}
