import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat= 5.00;
        double total;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        armutKilo = scan.nextInt();

        System.out.print("Elma Kaç Kilo? : ");
        elmaKilo = scan.nextInt();

        System.out.print("Domates Kaç Kilo? : ");
        domatesKilo = scan.nextInt();

        System.out.print("Muz Kaç Kilo? : ");
        muzKilo = scan.nextInt();

        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKilo = scan.nextInt();

        total = (armutKilo * armutFiyat) + (elmaKilo * elmaFiyat) + (domatesKilo * domatesFiyat)
                + (muzKilo * muzFiyat) + (patlicanKilo * patlicanFiyat);

        System.out.println("Toplam tutar: " + total);


    }
}
