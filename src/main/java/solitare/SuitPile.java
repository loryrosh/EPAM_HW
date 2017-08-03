package solitare;

class SuitPile extends CardPile {

    SuitPile(int x, int y) {
        super(x, y);
    }

    @Override
    public boolean canTake(CardPile cardPile) {
        // не можем класть стопку карт
        if (cardPile.size() > 1)
            return false;

        Card aCard = cardPile.get(0);
        if (isEmpty()) {
            return aCard.getRank() == 0; // кладем туза
        }
        Card topCard = getLast();
        return (aCard.getSuit() == topCard.getSuit()) &&
                (aCard.getRank() == 1 + topCard.getRank()); // проверяем порядок карт
    }
}
