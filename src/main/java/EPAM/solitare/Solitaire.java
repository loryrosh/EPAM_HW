package EPAM.solitare;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solitaire extends Applet {
    static DeckPile deckPile;
    static DiscardPile discardPile;
    static TablePile tableau[];
    static SuitPile suitPile[];
    static CardPile allPiles[];

    @Override
    public void init() {
        ((Frame) this.getParent().getParent()).setTitle("Solitaire");
        setSize(1100, 800);
        setBackground(Color.lightGray);

        // first allocate the arrays
        allPiles = new CardPile[13]; // 13 стопок открытых карт (верхние и на веере)
        suitPile = new SuitPile[4]; // стопки вверху по мастям (4)
        tableau = new TablePile[7]; // 7 раздвинутых стопок карт

        // then fill them in
        allPiles[0] = deckPile = new DeckPile(935, 5); // колода карт (закрытых)
        allPiles[1] = discardPile = new DiscardPile(780, 5); // стопка, куда мы открываем закрытую колоду
        for (int i = 0; i < 4; i++) {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(5 + 160 * i, 5);
        }
        for (int i = 0; i < 7; i++) { // 7 стопок на столе
            allPiles[6 + i] = tableau[i] =
                    new TablePile(5 + 155 * i, 180, i + 1);
        }

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (int i = 0; i < 13; i++) {
                    if (allPiles[i].includes(e.getX(), e.getY())) {
                        allPiles[i].select(e.getX(), e.getY());
                        repaint();
                    }
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 13; i++) {
            allPiles[i].display(g);
        }
    }
}
