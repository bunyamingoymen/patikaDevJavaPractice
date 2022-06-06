import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen istediğiniz bir sayıyı giriniz: ");
        int number = s.nextInt();
        int tempNumber = number;
        int basValue;

        int result = 0;

        while (tempNumber != 0) {

            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;

        }
        System.out.println("Girilen Değer: " +number);
        System.out.println("Sonuç: " + result);

    }



}
