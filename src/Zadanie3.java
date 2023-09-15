public class Zadanie3 {
    // Be aware! This is not foolproof method!
    public static void main(String[] args) {
        int howManyLines = 7;
        int initialStars = 1;
        int starsToMulitpleBy = 2;
        for (int i = 0; i < howManyLines; i++) {
            int howManyStars = i * starsToMulitpleBy + initialStars;
            if(howManyStars > howManyLines){
                howManyStars = (howManyLines - i - 1) * starsToMulitpleBy + initialStars;
            }
            int howManySpaces = (howManyLines - howManyStars) / 2;

            for (int j = 0; j < howManySpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < howManyStars; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < howManySpaces; j++) {
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
