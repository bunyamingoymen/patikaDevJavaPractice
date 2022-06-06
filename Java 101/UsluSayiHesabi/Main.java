import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int n = s.nextInt();

        System.out.println("Ne kadar üs hesaplansın?");
        int us = s.nextInt();
        int result = n;
        for(int i = 1; i<us;i++){
            result *= n;
        }

        System.out.println("Sonuç: " + result);
    }
}
