import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen eleman sayısı giriniz: ");
        int n = s.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3 = num1 + num2;

        System.out.print(num1 + " " +num2 + " ");
        for(int i = 0; i<n;i++){
            //System.out.println("num3 değeri: " + num3);
            System.out.print(num3 + " ");

            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;


        }
    }
}
