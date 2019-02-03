package figure.ui;

import figure.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nane on 12/9/18.
 */
public class FigureCanvas extends JPanel {
    private List<Figure> figures = new ArrayList<>();

    private boolean isSelected;
    private int mX;
    private int mY;

    public FigureCanvas() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePressPerformed(e);
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                mouseDragPerformed(e);
            }
        });

    }

    public void addFigure (Figure figure) {
        if(figure != null) {
            figures.add(figure);
            repaint();
        }
    }

    private Figure getSelected() {
        if(isSelected){
            return figures.get(figures.size() -1);
        }
        return null;
    }

    private void mousePressPerformed(MouseEvent e) {
        select(e.getX(), e.getY());
        mX = e.getX();
        mY = e.getY();
        if(isSelected) {
            repaint();
        }
    }

    private void mouseDragPerformed(MouseEvent e) {
        if(isSelected) {
            getSelected().move(e.getX() - mX, e.getY() - mY);
            mX = e.getX();
            mY = e.getY();
            repaint();
        }
    }

    public void update(Graphics g){
        paint(g);
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, 1000, 1000);

        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).draw(g);
        }
    }

    private void select(int x, int y){
        for (int i = figures.size() - 1; i >= 0; i--) {

            if(figures.get(i).isBelong(x, y)){
                Figure fg = figures.remove(i);
                figures.add(fg);
                isSelected = true;
                return;
            }
        }
        isSelected = false;
    }

//    private void removeAndAddAsLast(int index) {
//        Figure removedElement = figures[index];
//        for (int i = index; i < size-1; i++) {
//            figures[i] = figures[i + 1];
//        }
//        figures[size - 1] = removedElement;
//    }
}
