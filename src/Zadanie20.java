import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        double sugarBase = 1.5;
        double butterBase = 1;
        double flourBase = 2.75;
        int cookiesBase = 48;
        System.out.println("Ile chcesz ciastek?");
        Scanner scan = new Scanner(System.in);
        int desiredNumberOfCookies = scan.nextInt();
        double multiplier = (double)desiredNumberOfCookies / cookiesBase;
        double newSugar = sugarBase * multiplier;
        double newButter = butterBase* multiplier;
        double newFlour = flourBase* multiplier;

        System.out.println("Tyle potrzeba szklanek cukru: " + newSugar);
        System.out.println("Tyle potrzeba szklanek masła: " + newButter);
        System.out.println("Tyle potrzeba szklanek maki: " + newFlour);
    }
}
