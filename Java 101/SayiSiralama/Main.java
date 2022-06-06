import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner s = new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz: ");
        num1 = s.nextInt();

        System.out.println("2.Sayıyı giriniz: ");
        num2 = s.nextInt();

        System.out.println("3.Sayıyı giriniz: ");
        num3 = s.nextInt();

        if(num1>num2 && num1>num3){
            if(num2>num3){
                System.out.println("num1>num2>num3");
            }else{
                System.out.println("num1>num3>num2");
            }
        } else if (num2>num1 && num2>num3) {
            if(num1>num3){
                System.out.println("num2>num1>num3");
            }else{
                System.out.println("num2>num3>num1");
            }
        }else{ // Bu else girerse o zaman kesin mum3 en büyüktür
            if(num1>num2){
                System.out.println("num3>num1>num2");
            }else{
                System.out.println("num3>num2>num1");
            }
        }
    }
}
