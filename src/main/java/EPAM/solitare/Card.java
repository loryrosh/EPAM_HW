package EPAM.solitare;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

class Card {
    final String names[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    // data fields for colors and suits
    final static int width = 123;
    final static int height = 150;

    final static int red = 0;
    final static int black = 1;

    final static int heart = 0;
    final static int spade = 1;
    final static int diamond = 2;
    final static int club = 3;

    final Image imgHeart;
    final Image imgSpade;
    final Image imgDiamond;
    final Image imgClub;
    final Image imgCard;

    // data fields
    private int rank;
    private int suit;
    private boolean faceup;

    Card link; // следующая карта - доступна напрямую

    // constructor
    Card(int sv, int rv) {
        suit = sv;
        rank = rv;
        faceup = false; // карта закрыта (лежит лицом вниз)

        imgHeart = readCardImage("cards/full/heart.png");
        imgSpade = readCardImage("cards/full/spade.png");
        imgDiamond = readCardImage("cards/full/diamond.png");
        imgClub = readCardImage("cards/full/club.png");
        imgCard = readCardImage("cards/full/card.png");
    }

    public void draw(Graphics g, int x, int y) {
        // clear rectangle, draw border
        g.clearRect(x, y, width, height);
        g.setColor(Color.white);
        g.drawRect(x, y, width, height);

        // draw body of card
        if (isFaceUp()) {
            if (getColor() == red) {
                g.setColor(Color.red);
            } else {
                g.setColor(Color.blue);
            }
            g.drawString(names[getRank()], x + 7, y + 20);
            switch (getSuit()) {
                case heart:
                    if (imgHeart != null) {
                        g.drawImage(imgHeart, x, y, width, height, null);
                    } else {
                        g.drawLine(x + 25, y + 30, x + 35, y + 20);
                        g.drawLine(x + 35, y + 20, x + 45, y + 30);
                        g.drawLine(x + 45, y + 30, x + 25, y + 60);
                        g.drawLine(x + 25, y + 60, x + 5, y + 30);
                        g.drawLine(x + 5, y + 30, x + 15, y + 20);
                        g.drawLine(x + 15, y + 20, x + 25, y + 30);
                    }
                    break;
                case spade:
                    if (imgSpade != null) {
                        g.drawImage(imgSpade, x, y, width, height, null);
                    } else {
                        g.drawLine(x + 25, y + 20, x + 40, y + 50);
                        g.drawLine(x + 40, y + 50, x + 10, y + 50);
                        g.drawLine(x + 10, y + 50, x + 25, y + 20);
                        g.drawLine(x + 23, y + 45, x + 20, y + 60);
                        g.drawLine(x + 20, y + 60, x + 30, y + 60);
                        g.drawLine(x + 30, y + 60, x + 27, y + 45);
                    }
                    break;
                case diamond:
                    if (imgDiamond != null) {
                        g.drawImage(imgDiamond, x, y, width, height, null);
                    } else {
                        g.drawLine(x + 25, y + 20, x + 40, y + 40);
                        g.drawLine(x + 40, y + 40, x + 25, y + 60);
                        g.drawLine(x + 25, y + 60, x + 10, y + 40);
                        g.drawLine(x + 10, y + 40, x + 25, y + 20);
                    }
                    break;
                case club:
                    if (imgClub != null) {
                        g.drawImage(imgClub, x, y, width, height, null);
                    } else {
                        g.drawOval(x + 20, y + 25, 10, 10);
                        g.drawOval(x + 25, y + 35, 10, 10);
                        g.drawOval(x + 15, y + 35, 10, 10);
                        g.drawLine(x + 23, y + 45, x + 20, y + 55);
                        g.drawLine(x + 20, y + 55, x + 30, y + 55);
                        g.drawLine(x + 30, y + 55, x + 27, y + 45);
                    }
                    break;
            }
        } else { // face down
            if (imgCard != null) {
                g.drawImage(imgCard, x, y, width, height, null);
            } else {
                g.setColor(Color.yellow);
                g.drawLine(x + 35, y + 5, x + 35, y + 145);
                g.drawLine(x + 85, y + 5, x + 85, y + 145);
                g.drawLine(x + 5, y + 40, x + 115, y + 40);
                g.drawLine(x + 5, y + 70, x + 115, y + 70);
                g.drawLine(x + 5, y + 100, x + 115, y + 100);
            }
        }
    }

    public int getColor() {
        if (getSuit() == heart || getSuit() == diamond) {
            return red;
        }
        return black;
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
