package EPAM.solitare;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solitaire extends Applet {
    public static final int AMOUNT_ALL_PILES = 13;
    public static final int AMOUNT_PILES_LEFT = 4;
    public static final int AMOUNT_PILES_TABLE = 7;

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
        allPiles = new CardPile[AMOUNT_ALL_PILES]; // 13 стопок карт (верхние и на веере)
        suitPile = new SuitPile[AMOUNT_PILES_LEFT]; // стопки вверху по мастям (4)
        tableau = new TablePile[AMOUNT_PILES_TABLE]; // 7 раздвинутых стопок карт

        // then fill them in
        allPiles[0] = deckPile = new DeckPile(935, 5); // колода карт (закрытых)
        allPiles[1] = discardPile = new DiscardPile(780, 5); // стопка, куда мы открываем закрытую колоду
        for (int i = 0; i < AMOUNT_PILES_LEFT; i++) {
            allPiles[2 + i] = suitPile[i] =
                    new SuitPile(5 + 160 * i, 5);
        }
        for (int i = 0; i < AMOUNT_PILES_TABLE; i++) { // 7 стопок на столе
            allPiles[6 + i] = tableau[i] =
                    new TablePile(5 + 155 * i, 180, i + 1);
        }

        addMouseListener(new SolitaireMouseListener());
        addMouseMotionListener(new SolitaireMouseMotionListener());
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < AMOUNT_ALL_PILES; i++) {
            allPiles[i].display(g);
        }
    }

    private void openCards(int start, int end, int x, int y) {
        for (int i = start; i < end; i++) {
            if (allPiles[i].includes(x, y)) {
                allPiles[i].select(x, y);
                repaint();
            }
        }
    }

    private class SolitaireMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) { // consider all piles, except deck
                openCards(1, AMOUNT_ALL_PILES, e.getX(), e.getY());
            } else if (e.getClickCount() == 1) {
                openCards(0, 1, e.getX(), e.getY()); // consider only deck pile
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Released");
        }
    }

    private class SolitaireMouseMotionListener extends MouseAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Dragged");
        }
    }
}
