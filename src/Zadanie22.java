public class Zadanie22 {
    public static void main(String[] args) {
        //W zeszłym miesiącu Jacek kupił trochę akcji firmy Acme Software. Oto szczegóły tej
        //transakcji:
        //liczba zakupionych akcji: 1000,
        //        cena zakupu akcji: 32,87 złotego za akcję, prowizja wypłacona brokerowi: 2% ceny
        //akcji.
        //        Po dwóch tygodniach Jacek sprzedał akcje. Oto szczegóły transakcji sprzedaży:
        //liczba sprzedanych akcji: 1000,
        //        cena sprzedaży akcji: 33,92 złotego za akcję,
        //        prowizja wypłacona brokerowi: 2% ceny akcji.
        //        Napisz program wyświetlający następujące informacje:
        //kwotę zapłaconą przez Jacka za akcje,
        //wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie,
        //kwotę otrzymaną przez Jacka ze sprzedaży akcji,
        //        wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży,
        //        zysk Jacka ze sprzedaży akcji po zapłaceniu obu prowizji (jeśli wysokość zysku
        //m jest ujemna, oznacza to, że Jacek poniósł stratę)
        int numberOfActions = 1000;
        double provision = 0.02;

        double startActionPrice = 32.87;
        double endActionPrice = 33.92;

        double cost = startActionPrice * numberOfActions; // koszt akcji
        double startProvision = provision * cost; // prowizja przy zakupie
        double totalCost = cost + startProvision; // koszt akcji wraz z prowizją

        double value = endActionPrice * numberOfActions; // wartość ze sprzedaży
        double endProvision = provision * value; // prowizja przy sprzedaży
        double realValue = value - endProvision; // rzeczywista wartość ze sprzedaży

        double profit = realValue - totalCost;
        System.out.println("Koszt zakupu: " + cost);
        System.out.println("Prowizja przy zakupie: " + startProvision);
        System.out.println("Wartość ze sprzedaży: " + value);
        System.out.println("Prowizja przy sprzedaży: " + endProvision);
        System.out.println("Zysk: " + profit);

    }
}
