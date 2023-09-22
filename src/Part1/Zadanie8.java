package Part1;

import Part1.Helpers.Surface;

import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        int[][] rooms =new int[4][2];
        Scanner scan = new Scanner(System.in);
        for(int i = 0, length = rooms.length; i < length; i++) {
            System.out.println("Podajesz teraz parametry pokoju " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("Podaj " + j + " parametr pokoju " + i + ": ");
                rooms[i][j]=scan.nextInt();
            }
        }
        Surface surface = new Surface(4);
        surface.count(rooms);
    }
}
