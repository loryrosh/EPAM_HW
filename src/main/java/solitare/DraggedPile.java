package solitare;

public class DraggedPile extends CardPile {
    public DraggedPile(int xCoord, int yCoord) {
        super(xCoord, yCoord);
    }

    public void updateCoords(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }
}
