package Part2;

import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę kalorii: ");
        Scanner scan = new Scanner(System.in);
        int calories = scan.nextInt();

        System.out.println("Podaj ilość gramów tłuszczu: ");
        int fat = scan.nextInt();
        int caloriesFromFat = getCaloriesFromFat(fat);
        if (caloriesFromFat > calories) {
            System.out.println("Coś Ty dziadzie podał?! Sypię na to czarną przyprawę. Nie bede robił.");
            return;
        }

        double fatCaloriesFraction = (double)caloriesFromFat / calories;
        long fatCaloriesPercent = Math.round(fatCaloriesFraction * 100);
        System.out.printf("Oto procent kalorii z tłuszczu: %d\n", fatCaloriesPercent);
        if(fatCaloriesPercent < .3) {
            System.out.println("Ten produkt jest jakiś niskotłuszczowy");
        }
    }

    private static int getCaloriesFromFat(int gramsOfFat) {
        int fatMultiplier = 9;
        return gramsOfFat * fatMultiplier;
    }
}
