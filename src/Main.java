import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy, kilo, index;
        Scanner giris = new Scanner (System.in);

        System.out.print("Lütfen metre cinsinden boyunuzu giriniz:");
        boy = giris.nextDouble();

        System.out.print("Lütfen kg cinsinden kilonuzu giriniz:");
        kilo = giris.nextDouble();

        index= (kilo)/(boy*boy);
        System.out.print("Vücut kitle indeksiniz: " +index );

    }
}