package Part2;

import Part2.Helpers.Runner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Runner[] runners = new Runner[3];

        int numberOfRunners = 3;
        for (int i = 0; i < numberOfRunners; i++) {
            runners[i] = new Runner();
            System.out.printf("Podaj nazwisko biegacza %d: ", i);
            runners[i].name = scan.nextLine();
            System.out.printf("Podaj czas biegu biegacza %d: ", i);
            runners[i].runningTime = scan.nextInt();
            scan.nextLine();
        }

        Arrays.sort(runners,
                new Comparator<Runner>() {
                    public int compare(Runner runner1, Runner runner2) {
                        if (runner1.runningTime > runner2.runningTime) {
                            return 1;
                        } else if (runner1.runningTime < runner2.runningTime) {
                            return -1;
                        }
                        return 0;
                    }
                }
        );

        for(Runner guy : runners) {
            System.out.println(guy.name);
        }
    }
}
