package Part2;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        System.out.println("Podaj ile chcesz kupić pakietów: ");
        Scanner scan = new Scanner(System.in);
        int numberOfPackages = scan.nextInt();

        int defaultPrice = 99;
        int[] numberBreakpoints = {0, 10, 20, 50, 100};
        int[] priceBreakpoints = {0, 20, 30, 40, 50};
        int selectedIndex = 0;

        for (int i = 0; i < numberBreakpoints.length; i++) {
            if(numberOfPackages <= numberBreakpoints[i]) {
                selectedIndex = i-1;
                break;
            }
        }
        double discount = priceBreakpoints[selectedIndex] / 100;
        double newPrice = defaultPrice - defaultPrice * discount;

        double totalPrice = numberOfPackages * newPrice;

        System.out.println(totalPrice);
    }
}
