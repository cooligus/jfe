package Part2;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        double basicFee = 10;

        System.out.println("Podaj ilość czeków miesięcznie: ");
        Scanner scan = new Scanner(System.in);
        int numberOfChecks = scan.nextInt();

        double[] prices = {0.04, 0.06, 0.08, 0.1};
        double[] checks = {60, 40, 20, 0};
        int selectedIndex = 0;

        for (int i = 0; i < checks.length; i++) {
            if(numberOfChecks >= checks[i]) {
                selectedIndex = i;
                break;
            }
        }

        double checksPrice = numberOfChecks * prices[selectedIndex];
        double totalPrice = checksPrice + basicFee;

        System.out.println(totalPrice);
    }
}
