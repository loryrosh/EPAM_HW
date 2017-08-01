package solitare;

class DeckPile extends CardPile {

    DeckPile(int x, int y) {
        // first initialize parent
        super(x, y);
        populate(new CardPile(0, 0), new CardPile(0, 0));
    }

    @Override
    public void select(int tx, int ty) {
        // если уже перебрали всю стопку - больше карт нет
        if (empty()) {
            while (!Solitaire.discardPile.empty()) {
                Card card = Solitaire.discardPile.pop();
                card.flip();
                Solitaire.deckPile.push(card);
            }
            return;
        }
        Solitaire.discardPile.push(pop());
    }

    private void populate(CardPile pileOne, CardPile pileTwo) {
        // create the new deck
        // first put them into a local pile
        int count = 0;
        for (int i = 0; i < Solitaire.AMOUNT_PILES_LEFT; i++) { // 4 масти
            for (int j = 0; j < Solitaire.AMOUNT_ALL_PILES; j++) { // по 13 карт
                pileOne.push(new Card(i, j));
                count++;
            }
        }

        // then pull them out randomly
        for (; count > 0; count--) {
            int limit = ((int) (Math.random() * 1000)) % count;
            // move down to a random location
            for (int i = 0; i < limit; i++) {
                pileTwo.push(pileOne.pop());
            }
            // then add the card found there
            push(pileOne.pop());

            // then put the decks back together
            while (!pileTwo.empty()) {
                pileOne.push(pileTwo.pop());
            }
        }
    }
}
