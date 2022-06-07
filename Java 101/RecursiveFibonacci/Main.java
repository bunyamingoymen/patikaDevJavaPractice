import java.util.Scanner;

public class Main {
    static int fibonacci(int n){
        System.out.println(n);
        if(n == 1 || n == 2) return 1;
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = s.nextInt();
        int result = fibonacci(n);
        System.out.println("");
        System.out.println(result);
    }
}
