import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int n = s.nextInt();
        double result = 1.0;
        for(int i = 2; i<=n;i++){
            result += 1/i;
        }

        System.out.println("Sonuç: " + result);
    }

}
