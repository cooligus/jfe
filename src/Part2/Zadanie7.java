package Part2;

import java.util.Scanner;
import java.util.Arrays;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[3];

        System.out.println("Podaj teraz trzy imiona oddzielone enterem: ");
        for (int i = 0; i < names.length; i++) {
            names[i] = scan.nextLine();
        }

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));
    }
}
