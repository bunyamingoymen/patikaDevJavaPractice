import java.util.Scanner;

public class Main {

    static int power(int n, int us, int tmp){
        if(us == 1) return tmp*n;
        else if(us == 0) return 1;
        else return power(n,us-1,tmp*n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = s.nextInt();

        System.out.println("Us giriniz: ");
        int us = s.nextInt();
        System.out.println(power(n,us,1));
    }

    /*
    2^3 = 2*2*2
    2^4 = 2*2*2*2
     */
}
