import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1 = 0, num2 =0, result;
        String islem = "+";

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        num1 = scan.nextInt();

        System.out.println("İkinci Sayıyı giriniz: ");
        num2 = scan.nextInt();

        System.out.println("İşlemi giriniz(+,-,/,*): " );
        islem = scan.next();

        switch (islem){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
               result = -1;
        }

        System.out.println("Sonuç: " + result);
    }
}
