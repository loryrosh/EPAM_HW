package EPAM.lesson170901;

public enum Seasons {
    WINTER("low") {
        {
            System.err.println("зима близко");
        }

        @Override
        public String getTemp() {
            return super.getTemp() + " ну очень холодно!";
        }
    },

    SPRING("medium") {
        {
            System.err.println("зима прошла");
        }
    },

    SUMMER("high"), AUTUMN("medium");

    private final String temperature;

    // конструктор - обязательно нужно его использовать для заданных констант
    private Seasons(String temperature) {
        this.temperature = temperature;
    }

    public String getTemp() {
        return temperature;
    }
}
