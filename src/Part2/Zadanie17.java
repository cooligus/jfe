package Part2;

import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        System.out.println("Ile kupiłeś książek?: ");
        Scanner scan = new Scanner(System.in) ;
        int books = scan.nextInt();

        int points = switch (books) {
            case 0 -> 0;
            case 1 -> 5;
            case 2 -> 15;
            case 3 -> 30;
            default -> 60;
        };

        System.out.printf("Dostałeś %d punktów.", points);
    }
}
