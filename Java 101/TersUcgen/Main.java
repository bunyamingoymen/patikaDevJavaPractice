import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen basamak sayısı giriniz: ");
        int n = s.nextInt();

        for(int i = 0;i<n;i++){
            for(int j = n; j> (n-i); j--){
                System.out.print(" ");
            }
            for(int j = 0 ; j<(2 * (n - i))-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
