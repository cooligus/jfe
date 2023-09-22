package Part2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("Dobra młody, dawaj dzień miesiąca: ");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        // TODO: check whether it is day of month


        System.out.println("Dobra młody, dawaj numer miesiąca: ");
        int month = scan.nextInt();
        // TODO: check whether it is month

        System.out.println("Dobra młody, dawaj dwa ostatnie cyfry roku: ");
        int year = scan.nextInt();
        // TODO: check whether this number is in good format

        if(day * month == year) {
            System.out.println("Data jest magiczna");
        } else {
            System.out.println("Data nie jest magiczna");
        }

    }
}
