package solitare;

import java.awt.*;

class TablePile extends CardPile {
    TablePile(int x, int y, int c) {
        super(x, y);

        // initialize our pile of cards
        for (int i = 0; i < c; i++) {
            push(Solitaire.deckPile.pop());
        }

        // flip topmost card face up
        if (!top().isFaceUp()) {
            top().flip();
        }
    }

    @Override
    public boolean canTake(Card aCard) {
        if (empty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = top();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }

    @Override
    public void select(int tx, int ty) {
        if (empty()) {
            return;
        }

        // if face down, then flip
        Card topCard = top();
        if (!topCard.isFaceUp()) {
            topCard.flip();
            return;
        }

        // else see if any getSuit pile can take card
        topCard = pop();
        for (int i = 0; i < 4; i++) {
            if (Solitaire.suitPile[i].canTake(topCard)) {
                Solitaire.suitPile[i].push(topCard);

                if (top() != null && !top().isFaceUp()) {
                    top().flip();
                }
                return;
            }
        }
        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++) {
            if (Solitaire.tableau[i].canTake(topCard)) {
                Solitaire.tableau[i].push(topCard);

                if (top() != null && !top().isFaceUp()) {
                    top().flip();
                }
                return;
            }
        }
        // else put it back on our pile
        push(topCard);
    }

    @Override
    public boolean includes(int clickX, int clickY) {
        int yCardsHeadersBottom = y + Card.CARD_HEAD_HEIGHT * (size - 1);
        return x <= clickX && clickX <= x + Card.WIDTH &&
                yCardsHeadersBottom + 1 <= clickY && clickY <= yCardsHeadersBottom + Card.HEIGHT;
    }

    @Override
    public void display(Graphics g) {
        stackDisplay(g, top());
    }

    // перебрать все стопки до дна, а затем выкладывать со сдвигом в 35 пикселей,
    // начиная с последней, рубашкой вверх, а первую (в данном случае заключительную) - картинкой вверх
    private int stackDisplay(Graphics g, Card aCard) {
        if (aCard == null) {
            return y;
        }

        int locally = stackDisplay(g, aCard.link);
        aCard.draw(g, x, locally);
        return locally + Card.CARD_HEAD_HEIGHT;
    }
}
