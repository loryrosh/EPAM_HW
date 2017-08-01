package solitare;

import java.awt.*;

class CardPile extends Component {
    protected int x;
    protected int y;
    protected int size;

    private Card firstCard;

    CardPile(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
        firstCard = null; // пустая стопка
    }

    // access to cards are not overridden
    public Card top() {
        return firstCard;
    } // первая карта в стопке - та, что наверху

    public boolean empty() {
        return firstCard == null;
    }

    // имитация работы стека
    public void push(Card aCard) {
        aCard.link = firstCard;
        firstCard = aCard;
        size++;
    }

    public Card pop() {
        Card result = null;
        if (firstCard != null) {
            result = firstCard;
            firstCard = firstCard.link;
        }
        size--;
        return result;
    }

    // the following are sometimes overridden
    public boolean includes(int clickX, int clickY) {
        return x <= clickX && clickX <= x + Card.WIDTH && y <= clickY && clickY <= y + Card.HEIGHT;
    }

    // что делать стопке (реакция на клик мышкой)
    public void select(int tx, int ty) {
    }

    // можно ли в эту стопку положить эту карту?
    public boolean canTake(Card aCard) {
        return false;
    }

    public void display(Graphics g) {
        g.setColor(Color.white);
        if (firstCard == null) {
            g.drawRect(x, y, Card.WIDTH, Card.HEIGHT);
        } else {
            firstCard.draw(g, x, y);
        }
    }
}
