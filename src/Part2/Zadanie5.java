package Part2;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj masę (kg): ");
        double weight = scan.nextDouble();
        int massMultiplier = 9;
        double mass = weight * massMultiplier;

        if(mass > 1000) {
            System.out.println("Za ciężkie");
        } else if(mass < 10) {
            System.out.println("Za lekkie");
        } else {
            System.out.println("Jest wporzo");
        }
    }
}
