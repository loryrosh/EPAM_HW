package solitare;

import java.awt.*;
import java.util.ListIterator;

public class DraggedPile extends CardPile {
    public DraggedPile(int xCoord, int yCoord) {
        super(xCoord, yCoord);
    }

    public void updateCoords(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    @Override
    public void display(Graphics g) {
        if (!isEmpty()) {
            ListIterator<Card> iter = listIterator(0);
            int pos = y;
            while (iter.hasNext()) {
                iter.next().draw(g, x, pos);
                pos += Card.CARD_HEAD_HEIGHT;
            }
        }
    }
}
