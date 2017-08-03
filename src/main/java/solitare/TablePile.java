package solitare;

import java.awt.*;
import java.util.ListIterator;

class TablePile extends CardPile {
    TablePile(int x, int y, int c) {
        super(x, y);

        // initialize our pile of cards
        for (int i = 0; i < c; i++) {
            add(Solitaire.deckPile.removeLast());
        }

        // flip topmost card face up
        if (!getLast().isFaceUp()) {
            getLast().flip();
        }
    }

    @Override
    public boolean canTake(CardPile cardPile) {
        Card aCard = cardPile.get(0);
        if (isEmpty()) {
            return aCard.getRank() == 12;
        }
        Card topCard = getLast();
        return (aCard.getColor() != topCard.getColor()) &&
                (aCard.getRank() == topCard.getRank() - 1);
    }

    @Override
    public void select(int tx, int ty) {
        if (isEmpty()) {
            return;
        }

        // if face down, then flip
        Card topCard = getLast();
        if (!topCard.isFaceUp()) {
            topCard.flip();
            return;
        }

        // else see if any getSuit pile can take card
        topCard = removeLast();
        for (int i = 0; i < 4; i++) {
            CardPile cardPile = new CardPile(x, y);
            cardPile.add(topCard);
            if (Solitaire.suitPile[i].canTake(cardPile)) {
                Solitaire.suitPile[i].add(topCard);

                if (!isEmpty() && !getLast().isFaceUp()) {
                    getLast().flip();
                }
                return;
            }
        }
        // else see if any other table pile can take card
        for (int i = 0; i < 7; i++) {
            CardPile cardPile = new CardPile(x, y);
            cardPile.add(topCard);
            if (Solitaire.tableau[i].canTake(cardPile)) {
                Solitaire.tableau[i].add(topCard);

                if (!isEmpty() && !getLast().isFaceUp()) {
                    getLast().flip();
                }
                return;
            }
        }
        // else put it back on our pile
        add(topCard);
    }

    @Override
    public boolean includes(int clickX, int clickY) {
        int yCardsHeadersBottom = y + Card.CARD_HEAD_HEIGHT * (size() - 1);
        return x <= clickX && clickX <= x + Card.WIDTH &&
                y <= clickY && clickY <= yCardsHeadersBottom + Card.HEIGHT;
    }

    @Override
    public void display(Graphics g) {
        // выкладывать карты со сдвигом в CARD_HEAD_HEIGHT пикселей
        ListIterator<Card> iter = listIterator(0);
        int pos = y;
        while (iter.hasNext()) {
            iter.next().draw(g, x, pos);
            pos += Card.CARD_HEAD_HEIGHT;
        }
    }
}
