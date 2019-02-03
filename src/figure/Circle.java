package figure;

import java.awt.*;

/**
 * Created by nane on 12/8/18.
 */
public class Circle extends Figure {


    public Circle(int x, int y, int diameter){

        this(x, y, diameter, Color.BLUE);
    }

    public Circle(int x, int y, int diameter, Color color){

        super(x, y, diameter, diameter, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        int r = getHeight() / 2;
        int dY = getY() + getHeight()/2 - y;
        int dX = getX() + getWidth()/2 - x;
        return dX * dX + dY * dY <= r * r;
    }

    private int getRadius(){
        return getHeight() / 2;
    }

    private int getDiameter(){
        return getHeight();
    }

}
