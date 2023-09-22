package Part2;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj masę (kg): ");
        int mass = scan.nextInt();

        System.out.println("Podaj wysokość (m): ");
        int height = scan.nextInt();

        int bmi = mass/height;
        if(bmi < 18.5) {
            System.out.println("Ty jadłeś cokolwiek dzisiaj?");
        } else if (bmi > 25) {
            System.out.println("Za dużo żresz!");
        } else {
            System.out.println("Żresz dobre ilości");
        }
    }
}
