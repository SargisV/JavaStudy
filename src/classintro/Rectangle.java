package classintro;

/**
 * Created by nane on 11/10/18.
 */
public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getSquear () {
        return this.height * this.width;
    }


}

