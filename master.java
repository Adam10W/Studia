import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        // Funkcja działa przy odpaleniu "RUN", a następnie wpisaniu w konsoli liczby która nas interesuje
        System.out.println("zadanie 1.1");
        System.out.println("Wybierz indeks:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int [] FirstArray = { 1, 2, 3, 4};
        if (a == FirstArray[0]) {
            System.out.println("Podana liczba znajduje się w tablcy i ma indeks 0");
        } 
        else if (a == FirstArray[1]){
            System.out.println("Podana liczba znajduje się w tablcy i ma indeks 1");
        } 
        else if (a == FirstArray[2]){
            System.out.println("Podana liczba znajduje się w tablcy i ma indeks 2");
        } 
        else if (a == FirstArray[3]){
            System.out.println("Podana liczba znajduje się w tablcy i ma indeks 3");
        } 
        else {
            System.out.println("Podana liczba nie znajduje się w tablcy");
        } 
        
        System.out.println("____________________________________________________");

        // Aby sprawdzić czy liczba jest liczbą pierwszą należy: wybrać liczbę indeksu od 0 do 16 i podstawić ją pod znaki kwadratowe w formule "IF"
        System.out.println("zadanie 1.2");
        int [] SecondArray = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 ,15 ,16 ,17 ,18 ,19 ,20};
        if (SecondArray[2] % 3 != 0 && SecondArray[2] % 2 != 0 && SecondArray[2] % SecondArray[2] == 0) {
            System.out.println("Wybrana liczba z tablicy jest liczbą pierwszą");
        } else {
            System.out.println("Wybrana liczba z tablicy nie jest liczbą pierwszą");
        }
    }
}