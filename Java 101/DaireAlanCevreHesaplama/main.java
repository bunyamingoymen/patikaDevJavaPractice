import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        double pi = 3.14, alan, cevre;
        int r;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen dairenin yarıçapını giriniz: ");
        r = scan.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Girilen dairenin alanı: " + alan);
        System.out.println("Girilen dairenin çevresi: " + cevre);

    }
}
