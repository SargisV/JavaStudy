package before.figure.ui;

import before.figure.*;
import before.figure.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static before.figure.ui.FigureFrame.FigureType.*;


/**
 * Created by nane on 12/9/18.
 */
public class FigureFrame extends JFrame {
    private final int RECTANGLE_TYPE = 0;
    private final int CIRCLE_TYPE = 1;

    enum FigureType {
        RECTANGLE, CIRCLE;

        static FigureType getNextType(FigureType current) {
            int currentOrdinal = current.ordinal();
            return  currentOrdinal == values().length -1 ? values()[0] : values()[++currentOrdinal];
        }

    }

    enum FigureColor {
        BLACK(Color.BLACK), CYAN(Color.CYAN), GREEN(Color.GREEN), RED(Color.RED), BLUE(Color.BLUE), YELLOW(Color.YELLOW), PINK(Color.PINK);

        static Color getRandomColor(){
            Random random = new Random();
            int randomIndex = random.nextInt(values().length);
            return values()[randomIndex].color;
       }

        FigureColor(Color color) {
            this.color = color;
        }

        private Color color;

    }

    private JPanel controlPanel = new JPanel();
    private FigureCanvas canvas = new FigureCanvas();

    private boolean isLastFigureRectangle = true;
    private FigureType currentFigureType = CIRCLE;

    public FigureFrame() {
        super("Figure");

        JButton addButton = new JButton("Add Figure");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addActionPerformed(e);
            }
        });
        JButton removeButton = new JButton("Remove");
        controlPanel.add(addButton);
        controlPanel.add(removeButton);
        add(controlPanel, BorderLayout.NORTH);
        add(canvas, BorderLayout.CENTER);

        setSize(400, 300);
        setLocation(300, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addActionPerformed(ActionEvent actionEvent) {
        canvas.addFigure(getNextFigure());

//        Random random = new Random();
//        int type = random.nextInt() % 2;
//        if (isLastFigureRectangle){
//            canvas.addFigure(new Circle(20,20, 40));
//        } else {
//            canvas.addFigure(new Rectangle(70, 20, 60, 40, Color.YELLOW));
//        }
//        isLastFigureRectangle = !isLastFigureRectangle;
    }

    private Figure getNextFigure () {
        currentFigureType = FigureType.getNextType(currentFigureType);
        Color color = FigureColor.getRandomColor();

        switch (currentFigureType){
            case RECTANGLE:
                return new Rectangle(60,15,55,35, color);
            case CIRCLE:
                return new Circle(15,15,35, color);
            default:
                return null;
        }


    }





    public static void main(String[] args) {
        FigureFrame frame = new FigureFrame();
    }
}
