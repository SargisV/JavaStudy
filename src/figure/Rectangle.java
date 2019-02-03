package figure;

import java.awt.*;

/**
 * Created by nane on 12/8/18.
 */
public class Rectangle extends Figure {

    public Rectangle (int x, int y, int width, int height, Color color) {

        super(x, y, width, height, color);
    }

    Rectangle (int x, int y, int height, int width) {
        this(x, y, width, height, Color.BLUE);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return getX() <= x && x <= getX() + getWidth() && getY() <= y && y <= getY() + getHeight();
    }
}
