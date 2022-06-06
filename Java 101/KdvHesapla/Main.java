import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double oran = 0.18;

        System.out.println("Ürünün fiyatını giriniz:");
        double kdvOlmadan = scan.nextDouble();
        double kdvTutari = kdvOlmadan * oran;
        double kdvIle = kdvOlmadan + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + kdvOlmadan);
        System.out.println("KDV'li Fiyat: " + kdvIle);
        System.out.println("KDV Tutarı: " + kdvTutari);
    }
}
