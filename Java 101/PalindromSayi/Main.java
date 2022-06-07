import java.util.Scanner;

public class Main {
    static boolean is_palindrom(int n){

        int tmp = n, reverseNumber = 0, lastNumber;

        //n değerini ters çeviriyor.
        while(tmp != 0){
            lastNumber = tmp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tmp /= 10;
        }

        if(reverseNumber == n){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = s.nextInt();

        if(is_palindrom(n)){
            System.out.println( n + " sayısı palindrom saydır");
        }else{
            System.out.println( n + " sayısı palindrom sayı değildir");
        }
    }
}
