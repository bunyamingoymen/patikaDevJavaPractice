import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kilo, boy, kitle;

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz");
        boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextDouble();

        kitle = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + kitle);
    }
}
