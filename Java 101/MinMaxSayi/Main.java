import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz: ");
        int n = s.nextInt();
        int min = 9999;
        int max = -9999;
        for(int i = 0;i<n;i++ ){
            System.out.println((i+1) + ". Sayıyı giriniz: ");
            int number = s.nextInt();
            if(i == 0){
                min = number;
                max = number;
            }else{
               if(min>number){
                   min = number;
               }
               if(max<number){
                   max = number;
               }
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En Küçük sayı: " + min);
    }
}
