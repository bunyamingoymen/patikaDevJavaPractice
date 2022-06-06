import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = s.nextInt();

        int total = 0;
        for(int i = 1; i<n;i++){
            if(n%i == 0){
                total += i;
            }
        }

        if(total == n){
            System.out.println(n + " Mükemmel sayıdır");
        }else{
            System.out.println(n + " Mükemmel sayı değildir");
        }
    }
}
