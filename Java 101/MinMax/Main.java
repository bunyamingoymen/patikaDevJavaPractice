import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {15,12,788,1,-1,-778,2,0};

        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int n = s.nextInt();

        int max = 9999;
        int min = -9999;
        for(int i = 0; i<numbers.length;i++){
            if((numbers[i]<n) && ((n-min) > (n-numbers[i]))){
                min = numbers[i];
            }

            if(numbers[i]>n && ((max-n) > (numbers[i]-n))){
                max = numbers[i];
            }
        }
        System.out.print("Dizi: {");
        for(int i : numbers) System.out.print(i +", ");
        System.out.println("}");
        System.out.println("Girilen sayı: " + n);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
    }

}
