package figure;

import java.awt.*;

/**
 * Created by nane on 12/8/18.
 */
abstract public class Figure {
    private int x;
    private int y;
    private int width;
    private int height;

    private Color color;

    public Figure(int x,int y,int width,int height, Color color) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    abstract public void draw(Graphics g);
    abstract public boolean isBelong(int x,int y);

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
