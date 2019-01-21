import java.util.Scanner;

public class Silnia {

    public static void main(String[] args) {

        int liczba;
        System.out.println("Podaj liczbę którą chcesz obliczyć: ");
        Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika
        liczba = odczyt.nextInt();
        int obliczonaLiczba = 1;
        for(int i = 1; i <= liczba; i ++){
            obliczonaLiczba *= i;
        }
        System.out.println("Silnia wynosi: " + obliczonaLiczba);

    }

}
