public class Zadanie19 {
    public static void main(String[] args) {
        //Producent napojów bezalkoholowych przeprowadził ankietę z udziałem 12 467
        //konsumentów i odkrył, że około 14% ankietowanych kupuje przynajmniej jeden
        //napój energetyczny tygodniowo. Około 64% kupujących napoje energetyczne
        //preferuje smak cytrusowy. Napisz program wyświetlający następujące informacje:
        //przybliżoną liczbę ankietowanych osób, które kupują przynajmniej jeden napój
        //energetyczny tygodniowo;
        //przybliżoną liczbę ankietowanych osób, które preferują napoje energetyczne o
        //smaku cytrusowym.
        int numberOfSurveyed = 12467;
        double percentOfEnergophans = .14;
        double percentOfCitrophans = .64;

        long numberOfEnergophans = Math.round(numberOfSurveyed * percentOfEnergophans);
        long numberOfCitrophans = Math.round(numberOfEnergophans * percentOfCitrophans);

        System.out.println("Ilość osób pijące energole przynajmniej raz w tygodniu: " + numberOfEnergophans);
        System.out.println("Ilość osób pijące energole cytrusowe przynajmniej raz w tygodniu: " + numberOfCitrophans);
    }
}
