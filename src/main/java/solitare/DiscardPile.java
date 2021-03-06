package solitare;

class DiscardPile extends CardPile {

    DiscardPile(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean add(Card aCard) {
        if (!aCard.isFaceUp()) {
            aCard.flip();
        }
        return super.add(aCard);
    }

    @Override
    public int getDragStartCardIdx(int tx, int ty) {
        return size() - 1; // only consider the last card
    }

    @Override
    public int getYCoordForDragging(int cardNum) {
        return y;
    }

    @Override
    public void select(int tx, int ty) {
        if (isEmpty()) {
            return;
        }

        // берем карту
        Card topCard = removeLast();

        // спрашиваем каждую из колод сверху и на столе, может ли эта колода принять карту
        for (int i = 0; i < Solitaire.AMOUNT_PILES_LEFT; i++) {
            CardPile cardPile = new CardPile(x, y);
            cardPile.add(topCard);
            if (Solitaire.suitPile[i].canTake(cardPile)) {
                Solitaire.suitPile[i].add(topCard);
                return;
            }
        }
        for (int i = 0; i < Solitaire.AMOUNT_PILES_TABLE; i++) {
            CardPile cardPile = new CardPile(x, y);
            cardPile.add(topCard);
            if (Solitaire.tableau[i].canTake(cardPile)) {
                Solitaire.tableau[i].add(topCard);
                return;
            }
        }
        // nobody can use it, put it back on our list
        add(topCard);
    }
}
