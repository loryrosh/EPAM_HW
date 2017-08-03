package solitare;

import java.awt.*;
import java.util.LinkedList;

class CardPile extends LinkedList<Card> {
    protected int x;
    protected int y;
    protected int height;

    CardPile(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    @Override
    public boolean add(Card card) {
        if (size() == 1) {
            height = Card.HEIGHT;
        } else {
            height += Card.CARD_HEAD_HEIGHT;
        }
        return super.add(card);
    }

    // the following are sometimes overridden
    public boolean includes(int clickX, int clickY) {
        return x <= clickX && clickX <= x + Card.WIDTH && y <= clickY && clickY <= y + Card.HEIGHT;
    }

    // что делать стопке (реакция на клик мышкой)
    public void select(int tx, int ty) {
    }

    // можно ли в эту стопку положить эту карту?
    public boolean canTake(CardPile cardPile) {
        return false;
    }

    public void display(Graphics g) {
        g.setColor(Color.white);
        if (isEmpty()) {
            g.drawRect(x, y, Card.WIDTH, Card.HEIGHT);
        } else {
            getLast().draw(g, x, y);
        }
    }

    public DraggedPile getDraggedPile(int tx, int ty) {
        int yCardsHeadersBottom = y + Card.CARD_HEAD_HEIGHT * (size() - 1);

        int cardNum;
        if (ty >= yCardsHeadersBottom) {
            cardNum = size() - 1;
        } else {
            cardNum = (ty - y) / Card.CARD_HEAD_HEIGHT;
        }
        System.out.println(cardNum);

        if (cardNum != -1) {
            DraggedPile draggedPile = new DraggedPile(x, (y + Card.CARD_HEAD_HEIGHT * cardNum));
            for (int i = cardNum; i < size(); i++) {
                draggedPile.add(remove(i));
            }
            return draggedPile;
        }
        return null;
    }
}
