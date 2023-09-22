package Part2;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Dobra młody, podaj trzy oceny (0-100): ");
        Scanner scan = new Scanner(System.in);

        int[] grades = new int[3];

        for(int i = 0; i < 3; i ++) {
            grades[i] = scan.nextInt();
        }

        int average = (grades[0] + grades[1] + grades[2]) / grades.length;
        if(average >= 90) {
            System.out.println("Masz 5");
        } else if (average >= 80) {
            System.out.println("Masz 4");
        } else if (average >= 70) {
            System.out.println("Masz 3");
        } else if (average >= 60) {
            System.out.println("Masz 2");
        } else {
            System.out.println("Masz 1");
        }

    }
}
