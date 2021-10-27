package ru.yandex.practicum.start;

public class Main {

    public static void main(String[] args) {
        double rubles = 30000.0;
        double rateUSD = 78.5;
        double dollar = (rubles / rateUSD);
        String dollars = String.format("%.2f", dollar);
        System.out.println("У вас на счету " + rubles + " рублей. В долларах это " + dollars + " долларов. Так держать!");
    }
}
