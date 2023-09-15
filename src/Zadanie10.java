import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swoje oba imiona i nazwisko, każde we własnej linii: ");
        firstName = scan.nextLine();
        middleName = scan.nextLine();
        lastName = scan.nextLine();
        System.out.println("Dobrze. Oto Twoje personalia: " + firstName + " " + middleName + " " + lastName);
        firstInitial = firstName.charAt(0);
        middleInitial = middleName.charAt(0);
        lastInitial= lastName.charAt(0);
        System.out.println("Natomiast to są Twoje inicjały: " + firstInitial + middleInitial + lastInitial);

    }
}
