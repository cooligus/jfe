package Part2;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        System.out.println("Podaj odległość: ");
        Scanner scan = new Scanner(System.in);
        double distance = scan.nextDouble();

        System.out.println("Podaj wagę: ");
        double packageWeight = scan.nextDouble();

        int distanceDivider = 500;

        double[] prices = {1.1, 2.2, 3.7, 3.8};
        double[] weights = {0, 1, 3, 5};
        int selectedIndex = 0;

        for (int i = 0; i < weights.length; i++) {
            if(packageWeight < weights[i]) {
                selectedIndex = i-1;
                break;
            }
        }

        double numberOfDistances = Math.floor(distance / distanceDivider);
        double finalPrice = prices[selectedIndex] * numberOfDistances;
        System.out.println(finalPrice);
    }
}
