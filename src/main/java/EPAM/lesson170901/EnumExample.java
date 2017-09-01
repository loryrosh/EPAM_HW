package EPAM.lesson170901;

import EPAM.lesson170828.concurrency.Utils;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println("start");
        Seasons s;
        Utils.pause(5000);

        // инициализация Seasons начинается при обращении к Seasons.values() - в момент первого обращения к классу
        Seasons[] vals = Seasons.values();
        Utils.pause(5000);

        for (Seasons season : Seasons.values()) {
            System.out.println(season + " " + season.ordinal());
        }

        //Seasons currentSeason = Seasons.AUTUMN;
        Seasons currentSeason = Seasons.valueOf("WINTER");

        switch (currentSeason) {
            case WINTER:
                System.out.println("Зима!");
                System.out.println(Seasons.WINTER.getTemp());
                break;
            case SPRING:
                System.out.println("Весна!");
                break;
            case SUMMER:
                System.out.println("Лето!");
                break;
            case AUTUMN:
                System.out.println("Осень!");
                break;
            default:
                break;
        }

        // обращение к enum, который является Singleton
        Singleton.INSTANCE.getState();
    }
}
