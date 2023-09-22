**1. Liczby rzymskie**

Napisz program, który wyświetla prośbę o wpisanie wartości z przedziału od 1 do 10, a następnie
wyświetla liczbę rzymską będącą odpowiednikiem tej wartości. Jeśli podana wartość nie należy do
przedziału od 1 do 10, program powinien wyświetlać komunikat o błędzie.

**2. Magiczne daty**

Data 10 czerwca 1960 r. jest wyjątkowa, ponieważ po zapisaniu jej w pokazanym niżej formacie
iloczyn dnia i miesiąca daje w wyniku dwie ostatnie cyfry roku:

10/6/60

Napisz program, który wyświetla prośbę o podanie dnia, miesiąca (w formie liczby) i dwóch ostatnich
cyfr roku. Program powinien określać, czy iloczyn dnia i miesiąca jest równy dwóm ostatnim cyfrom
roku. Jeśli tak jest, program ma wyświetlać komunikat z informacją, że data jest magiczna. W
przeciwnym razie należy wyświetlić

komunikat, że data nie jest magiczna.

**3. Indeks BMI**

Napisz program, który oblicza i wyświetla indeks BMI (ang. body mass index) danej osoby. Indeks BMI
często służy do oceny, czy osoba o określonym wzroście ma nadwagę lub niedowagę. Ten indeks
moż na obliczyć za pomocą następującego wzoru:

BMI = waga/wzrost

Waga jest tu podawana w kilogramach, natomiast wzrost — w metrach (np. 1,85 dla 185 cm).
Program powinien wyświetlać komunikat z informacją, czy dana osoba ma optymal ną wagę, czy też
ma niedowagę lub nadwagę. Dla osoby prowadzącej siedzący tryb życia za optymalny uznaje się
indeks BMI z przedziału od 18,5 do 25. Indeks BMI poniżej 18,5 wskazuje na niedowagę, a wartość
powyżej 25 może oznaczać nadwagę.

**4. Wyniki testów i oceny**

Napisz program obejmujący zmienne do przechowywania trzech wyników testów. Program powinien
wyświetlać prośbę o wprowadzenie trzech wyników testów i przypisywać je do zmiennych. Następnie
kod ma wyświetlać średnią wyników testów i ocenę odpowiadającą tej średniej. Posłuż się
schematem ocen z poniższej tabeli:

_Średnia wyników testów Ocena_

90 – 100 5

80 – 89 4

70 – 79 3

60 – 69 2

Poniżej 60 1

**5. Masa i ciężar**

Naukowcy mierzą masę obiektów w kilogramach, a ciężar w niutonach. Jeśli znasz masę obiektu,
możesz obliczyć jego ciężar w niutonach na podstawie następującego wzoru:


ciężar = masa × 9,

Napisz program, który wyświetla prośbę o podanie masy obiektu, a następnie oblicza jego ciężar. Jeśli
ciężar przekracza 1000 niutonów, należy wyświetlić komunikat z informacją, że obiekt jest zbyt ciężki.
Jeżeli ciężar wynosi poniżej 10 niutonów, należy poinformować użytkownika, że obiekt jest za lekki.

**6. Kalkulator czasu**

Napisz program, który wyświetla prośbę o wprowadzenie liczby sekund.

- Minuta składa się z 60 sekund. Jeśli podana liczba sekund wynosi 60 lub więcej, program
    powinien wyświetlać liczbę minut wyliczoną na podstawie liczby sekund.
- Godzina składa się z 3600 sekund. Jeśli podana liczba sekund wynosi 3600 lub więcej,
    program powinien wyświetlać liczbę godzin wyliczoną na podstawie liczby sekund.
- Dzień składa się z 86 400 sekund. Jeśli podana liczba sekund wynosi 86 400 lub więcej,
    program powinien wyświetlać liczbę dni wyliczoną na podstawie liczby sekund.

Przykładowy output: _x_ sekund to _y_ dni, _z_ minut i _a_ sekund

**7. Posortowane imiona**

Napisz program, który wyświetla prośbę o podanie trzech imion, a następnie wyświetla

je posortowane rosnąco. Przykładowo, jeśli użytkownik wpisał „Czesław”, „Lucjan”

i „Adam”, program powinien wyświetlić:

Adam

Cze sław

Lucjan

1. Sprzedaż oprogramowania

Producent oprogramowania sprzedaje pakiet w cenie detalicznej 99 złotych. Rabaty

za liczbę sztuk są przyznawane zgodnie z następującą tabelą:

Sztuk Rabat

10 – 19 20%

20 – 49 30%

50 – 99 40%

100 lub więcej 50%

Napisz program, który wyświetla prośbę o podanie liczby zakupionych pakietów. Następnie program
powinien wyświetlać poziom rabatu (jeśli został przyznany) i łączną kwotę zakupu po rabacie.

**9. Opłaty za transport**

Firma „Szybkie Dostawy” nalicza następujące opłaty:

Waga przesyłki Stawka za 500 kilometrów

Kilogram lub mniej 1,10 złotego


Powyżej kilograma do trzech kilogramów 2,20 złotego

Powyżej trzech kilogramów do pięciu kilogramów 3,70 złotego

Powyżej pięciu kilogramów 3,80 złotego

Opłaty za 500 kilometrów nie są obliczane proporcjonalnie. Jeśli np. kilogramowa przesyłka

zostanie przesłana na odległość 550 kilometrów, opłata wyniesie 2,20 złotego.

Napisz program, który wyświetla prośbę o wprowadzenie wagi i odległości przesyłki,

a następnie wyświetla jej koszt.

**10. Kalkulator procentu kalorii pochodzących z tłuszczu**

Napisz program, który wyświetla prośbę o wprowadzenie liczby kalorii i gramów tłuszczu w produkcie
żywnościowym. Program powinien wyświetlać procent kalorii pochodzących z tłuszczu. Jeden gram
tłuszczu ma 9 kalorii. Dlatego:

kalo rie z tłuszczu = gramy tłuszczu × 9

Procent kalorii pochodzących z tłuszczu można obliczyć w następujący sposób:

kalorie z tłuszczu/kalorie w sumie

Jeśli kalorie pochodzące z tłuszczu stanowią mniej niż 30% kalorii w produkcie, należy dodatkowo
wyświetlać komunikat, że produkt jest niskotłuszczowy.

UWAGA: Liczba kalorii pochodzących z tłuszczu nie może być większa niż łączna liczba kalorii w
produkcie. Jeśli program wykryje, że liczba kalorii z tłuszczu jest wyższa niż łączna liczba kalorii,
powinien wyświetlać komunikat o błędzie informujący, że dane wejściowe są nieprawidłowe.

**11. Udział w biegu**

Napisz program, który wyświetla pytanie o nazwiska trzech biegaczy i czas ukończenia biegu
(podawany w minutach) przez każdego z nich. Program powinien wyświetlać nazwiska biegaczy
zgodnie z ich kolejnością na mecie.

**12. Szybkość dźwięku**

W poniższej tabeli pokazano przybliżoną szybkość rozchodzenia się dźwięku w powietrzu,

wodzie i stali:

Nośnik Szybkość

Powietrze 343 m/s

Woda 1490 m/s

Stal 5100 m/s

Napisz program, który wyświetla prośbę o wprowadzenie słowa „powietrze”, „woda” lub „stal” i
odległości, jaką fala dźwiękowa ma przebyć w wybranym nośniku. Następnie program ma wyświetlać
czas potrzebny na pokonanie tej odległości. Czas potrzebny do pokonania przez dźwięk odległości w
powietrzu można obliczyć za pomocą następującego wzoru:

czas = odległość/


Aby obliczyć czas potrzebny na pokonanie dystansu w wodzie, posłuż się następującym równaniem:

czas = odległość/

W celu o bliczenia czasu potrzebnego na pokonanie podanej odległości w stali zastosuj poniższy wzór:

czas = odległość/

**13. Operator telefonii komórkowej**

Operator telefonii komórkowej oferuje klientom trzy różne pakiety:

- Pakiet A: Cena to 39,99 złotego miesięcznie, w tym 450 darmowych minut.
    Każda następna minuta kosztuje 0,45 złotego.
- Pakiet B: Cena to 59,99 złotego miesięcznie, w tym 900 darmowych minut.
    Każda następna minuta kosztuje 0,40 złotego.
- Pakiet C: Cena to 69,99 złotego miesięcznie, brak limitu minut.

Napisz program generujący miesięczny rachunek dla klienta. Program ma wyświetlać pytanie o literę
reprezentującą pakiet wybrany przez klienta (A, B lub C) i liczbę minut rozmów. Następnie program
powinien wyświetlać łączne opłaty za dany miesiąc.

**14. Operator telefonii komórkowej, część 2.**

Zmodyfikuj program napisany w zadaniu 13., aby obliczał i wyświetlał kwotę, jaką klient korzystający
z pakietu A zaoszczędziłby, wybierając pakiety B lub C, a także kwotę zaoszczędzoną przez klienta
używającego pakietu B po zakupie pakietu C. Jeśli zmiana pakietu nie przynosi oszczędności, program
ma nie wyświetlać żadnego komunikatu.

**15. Opłaty bankowe**

Bank pobiera opłatę podstawową w wysokości 10 złotych miesięcznie plus dodatkowe opłaty za
obsługę czeków do konta firm owego:

- 0,10 złotego za czek przy mniej niż 20 czekach,
- 0,08 złotego za czek przy 20 – 39 czekach,
- 0,06 złotego za czek przy 40 – 59 czekach,
- 0,04 złotego za czek przy ponad 60 czekach.

Napisz program wyświetlający pytanie o liczbę czeków wystawionych w dan ym miesiącu. Program
powinien następnie obliczać i wyświetlać opłaty pobrane przez bank w danym miesiącu.

1. Punkty w klubie książki

Księgarnia Czytadło prowadzi klub książki przyznający klientom punkty w zależności od liczby pozycji
zakupionych w danym miesiącu. Punkty są przyznawane w następujący sposób:

- Jeśli klient zakupił 0 książek, otrzymuje 0 punktów.
- Jeśli klient zakupił 1 książkę, otrzymuje 5 punktów.
- Jeśli klient zakupił 2 książki, otrzymuje 15 punktów.
- Jeśli klient zakupił 3 książki, otrzymuje 30 punktów.
- Jeśli klient zakupił 4 książki lub więcej, otrzymuje 60 punktów.

Napisz program, który wyświetla klientom pytanie o liczbę książek zakupionych w danym miesiącu, a
następnie podaje liczbę przyznanych punktów.


**18. Program do wyboru restauracji**

Gru pa znajomych z liceum przyjeżdża do Ciebie na spotkanie po latach. Chcesz ich zabrać do lokalnej
restauracji. Nie jesteś pewien, czy znajomi są na jakiejś diecie. Do wyboru masz następujące
restauracje:

- Luksusowe Burgery u Jarka — wegetariańskie: nie, wegańskie: nie, bezglutenowe: nie;
- Pizzeria przy Dworcowej — wegetariańskie: tak, wegańskie: nie, bezglutenowe: tak;
- Kawiarnia na Rogu — wegetariańskie: tak, wegańskie: tak, bezglutenowe: tak;
- Włoski e Specjały — wegetariańskie: tak, wegańskie: nie, bezglutenowe: nie;
- Kuchnia u Szefa — wegetariańskie: tak, wegańskie: tak, bezglutenowe: tak.

Napisz program wyświetlający pytanie, czy któraś z osób jest na diecie wegetariańskiej, wegańskiej
lub bezglutenowej. Następnie program ma pokazywać tylko te restauracje, w których wszyscy znajdą
coś dla siebie. Oto przykładowe dane wyjściowe programu:

_Czy któraś z osób jest na diecie wegetariańskiej? tak [Enter]
Czy któraś z osób jest na diecie wegańskiej? nie [Enter]
Czy któraś z osób jest na diecie bezglutenowej? tak [Enter]
Możecie wybrać się do następujących restauracji:
Pizzeria przy Dworcowej
Kawiarnia na Rogu
Kuchnia u Szefa
Oto inne przykładowe dane wyjściowe programu:
Czy któraś z osób jest na diecie wegetariańskiej? tak [Enter]
Czy któraś z osób jest na diecie wegańskiej? tak [Enter]
Czy któraś z osób jest na diecie bezglutenowej? tak [Enter]
Możecie wybrać się do następujących restauracji:
Kawiarnia na Rogu
Kuchnia u Szefa_


