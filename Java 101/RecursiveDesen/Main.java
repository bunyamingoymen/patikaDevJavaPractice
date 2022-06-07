import java.util.Scanner;

public class Main {

    static int desen(int n, int tmp, int i){
        System.out.print(tmp + " ");
        if(n == tmp) return -1;

        else if(tmp<= 0)  i = (i == 1) ? 0:1;

        if(i == 1)tmp -= 5;
        else tmp += 5;

        return desen(n,tmp,i);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int n = s.nextInt();

        System.out.println("N Sayısı: " + n);
        System.out.print("Çıktısı: " + n + " ");
        desen(n,n-5, 1);
    }
}
