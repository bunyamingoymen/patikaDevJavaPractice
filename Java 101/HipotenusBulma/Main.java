import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz: ");
        a = scan.nextInt();

        System.out.println("İKinci kenarı giriniz: ");
        b = scan.nextInt();

        c = Math.sqrt( (a*a) + (b*b) );

        System.out.println("Hipotenüs: " + c);

    }
}
