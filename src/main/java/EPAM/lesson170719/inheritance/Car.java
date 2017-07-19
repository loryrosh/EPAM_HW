package EPAM.lesson170719.inheritance;

public class Car extends Automobile {
    private static final int STANDARD_SPEED = 150;
    private static final int STANDARD_SEATS_NUMBER = 4;

    Object[] seats;

    public Car() {
        this(STANDARD_SEATS_NUMBER);
    }

    public Car(int seatsNumber) {
        seats = new Object[seatsNumber];
    }

    public int getSpeed() {
        return STANDARD_SPEED;
    }
}
