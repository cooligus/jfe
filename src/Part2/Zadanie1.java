package Part2;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Dobra młody, napisz liczbę od 1 do 10:");
        Scanner scan = new Scanner(System.in);

        int userNumber = scan.nextInt();
        while (userNumber > 10 || userNumber < 1) {
            System.out.println("NIE TO! OD 1 DO 10: ");
            userNumber = scan.nextInt();
        };

        String roman = switch (userNumber) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "X";
        };

        System.out.printf("Oto Twoja liczba: %s", roman);
    }
}
