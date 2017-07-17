package EPAM.lesson170717.solitare;

import java.applet.Applet;
import java.awt.*;

public class Solitare extends Applet {
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile tableau[];
    static SuitPile suitPile[];
    static CardPile allPiles[];

    @Override
    public void init() {
        // first allocate the arrays
        allPiles = new CardPile[13]; // 13 стопок открытых карт (верхние и на веере)
        suitPile = new SuitPile[4]; // стопки вверху по мастям (4)
        tableau = new TablePile[7]; // 7 раздвинутых стопок карт

        // then fill them in
        allPiles[0] = deckPile = new DeckPile(335, 5); // колода карт (закрытых)
        allPiles[1] = discardPile = new DiscardPile(268, 5); // стопка, куда мы открываем закрытую колоду
        for (int i = 0; i < 4; i++) {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(15 + 60 * i, 5);
        }
        for (int i = 0; i < 7; i++) { // 7 стопок на столе
            allPiles[6 + i] = tableau[i] =
                    new TablePile(5 + 55 * i, 80, i + 1);
        }
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        for (int i = 0; i < 13; i++) {
            if (allPiles[i].includes(x, y)) {
                allPiles[i].select(x, y);
                repaint();
                return true;
            }
        }
        return true;
    }
}
