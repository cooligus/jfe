package Part2;

import Part2.Helpers.Pair;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę sekund: ");
        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();

        int[] secondsInTimestamps = {86400, 3600, 60};
        int[] numberOfTimestamps = new int[3];

        for (int i = 0; i < secondsInTimestamps.length; i++) {
            Pair newPair = getTimestamps(seconds, secondsInTimestamps[i]);
            numberOfTimestamps[i] = newPair.timestamps;
            seconds = newPair.first;
        }
        System.out.printf("Liczba dni: %d, liczba godzin: %d, liczba minut: %d, liczba sekund: %d", numberOfTimestamps[0], numberOfTimestamps[1], numberOfTimestamps[2], seconds);
    }
    private static Pair getTimestamps(int seconds, int secondsInTimestamp) {
        Pair toReturn = new Pair();
        if(seconds >= secondsInTimestamp) {
            int rest = seconds % secondsInTimestamp;
            toReturn.timestamps = seconds / secondsInTimestamp;
            toReturn.first = rest;
        }
        return toReturn;
    };
}
