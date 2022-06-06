import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih,muzik;
        System.out.println("Lütfen Matematik dersinin notunu giriniz");
        matematik = scan.nextInt();

        System.out.println("Lütfen Fizik dersinin notunu giriniz");
        fizik = scan.nextInt();

        System.out.println("Lütfen Kimya dersinin notunu giriniz");
        kimya = scan.nextInt();

        System.out.println("Lütfen Türkçe dersinin notunu giriniz");
        turkce = scan.nextInt();

        System.out.println("Lütfen Tarih dersinin notunu giriniz");
        tarih = scan.nextInt();

        System.out.println("Lütfen Müzik dersinin notunu giriniz");
        muzik = scan.nextInt();

        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;

        System.out.println("Not Ortalaması: " + sonuc);
    }
}
