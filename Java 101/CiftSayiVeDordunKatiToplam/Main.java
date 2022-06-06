import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = 0;

        int total = 0;
        do{
            System.out.println("Lütfen bir sayı giriniz: ");
            number = s.nextInt();
            if(number %2 == 0 && number%4 == 0)
                total +=number;

        }while(number % 2 == 0);

        System.out.println("çift ve 4'ün katları olan sayıların toplamı: " + total);
    }
}
