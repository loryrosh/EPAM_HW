package solitare;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class Card {
    final String NAMES[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    final static int WIDTH = 123;
    final static int HEIGHT = 150;
    final static int CARD_HEAD_HEIGHT = 35;

    final static int RED = 0;
    final static int BLACK = 1;

    final static int HEART = 0;
    final static int SPADE = 1;
    final static int DIAMOND = 2;
    final static int CLUB = 3;

    final Image imgHeart = readCardImage("cards/full/heart.png");
    final Image imgSpade = readCardImage("cards/full/spade.png");
    final Image imgDiamond = readCardImage("cards/full/diamond.png");
    final Image imgClub = readCardImage("cards/full/club.png");
    final Image imgCard = readCardImage("cards/full/card.png");

    private int rank;
    private int suit;
    private boolean faceup;

    Card(int sv, int rv) {
        suit = sv;
        rank = rv;
        faceup = false; // карта закрыта (лежит лицом вниз)
    }

    public int getColor() {
        if (getSuit() == HEART || getSuit() == DIAMOND) {
            return RED;
        }
        return BLACK;
    }

    public boolean isFaceUp() {
        return faceup;
    }

    public void flip() {
        faceup = !faceup;
    }

    // access attributes of card
    public int getRank() {
        return rank;
    } // значение карты

    public int getSuit() {
        return suit;
    } // масть карты

    public void draw(Graphics g, int x, int y) {
        // clear rectangle, draw border
        g.clearRect(x, y, WIDTH, HEIGHT);
        g.setColor(Color.white);
        g.fillRect(x, y, WIDTH, HEIGHT);

        // draw body of the card
        if (isFaceUp()) {
            if (getColor() == RED) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.blue);
            }

            // draw the card name
            g.setFont(new Font("Palatino Linotype", Font.PLAIN, 25));
            g.drawString(NAMES[getRank()], x + 10, y + 30);

            // draw the card image
            switch (getSuit()) {
                case HEART:
                    if (imgHeart != null) {
                        g.drawImage(imgHeart, x, y, WIDTH, HEIGHT, null);
                    }
                    break;
                case SPADE:
                    if (imgSpade != null) {
                        g.drawImage(imgSpade, x, y, WIDTH, HEIGHT, null);
                    }
                    break;
                case DIAMOND:
                    if (imgDiamond != null) {
                        g.drawImage(imgDiamond, x, y, WIDTH, HEIGHT, null);
                    }
                    break;
                case CLUB:
                    if (imgClub != null) {
                        g.drawImage(imgClub, x, y, WIDTH, HEIGHT, null);
                    }
                    break;
            }
        } else { // face down
            if (imgCard != null) {
                g.drawImage(imgCard, x, y, WIDTH, HEIGHT, null);
            }
        }
    }

    private BufferedImage readCardImage(String path) {
        try {
            File imgFile = new File(Card.class.getClassLoader()
                    .getResource(path).getFile());
            return ImageIO.read(imgFile);
        } catch (Exception e) {
            return null;
        }
    }
}
