package solitare;

class DeckPile extends CardPile {

    DeckPile(int x, int y) {
        super(x, y);
        populate(new CardPile(0, 0), new CardPile(0, 0));
    }

    @Override
    public void select(int tx, int ty) {
        // если уже перебрали всю стопку - больше карт нет
        if (isEmpty()) {
            while (!Solitaire.discardPile.isEmpty()) {
                Card card = Solitaire.discardPile.removeLast();
                card.flip();
                Solitaire.deckPile.add(card);
            }
            return;
        }
        Solitaire.discardPile.add(removeLast());
    }

    private void populate(CardPile pileOne, CardPile pileTwo) {
        // create the new deck
        // first put them into a local pile
        int count = 0;
        for (int i = 0; i < Solitaire.AMOUNT_PILES_LEFT; i++) { // 4 масти
            for (int j = 0; j < Solitaire.AMOUNT_ALL_PILES; j++) { // по 13 карт
                pileOne.add(new Card(i, j));
                count++;
            }
        }

        // then pull them out randomly
        for (; count > 0; count--) {
            int limit = ((int) (Math.random() * 1000)) % count;
            // move down to a random location
            for (int i = 0; i < limit; i++) {
                pileTwo.add(pileOne.removeLast());
            }
            // then add the card found there
            add(pileOne.removeLast());

            // then put the decks back together
            while (!pileTwo.isEmpty()) {
                pileOne.add(pileTwo.removeLast());
            }
        }
    }
}
