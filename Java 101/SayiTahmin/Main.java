import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = (int) Math.random() * 100;
        int right = 5;
        int[] wrong = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while(right>0){
            System.out.println("Lütfen tahmininizi giriniz: ");
            int entered = s.nextInt();

            if(entered<0 || entered>99){
                if(isWrong){
                    right--;
                    System.out.println("Çok fazla hatalı giriş yaptınız.");
                    System.out.println("Kalan hakkınız: " + right);
                }else{
                    System.out.println("Hatalı bir giriş yaptınız. Birdaha girilirse hakkınız düşecektir.");
                }
                continue;
            }

            if(entered == n){
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz. Sayı değeri: " + n);
                isWin = true;
                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz!");
                if(entered>n){
                    System.out.println("Girdiğiniz sayı, n sayısından büyüktür");
                }else{
                    System.out.println("Girdiğiniz sayı, n sayısından küçüktür");
                }
                wrong[5-right] = entered;
                right--;
                System.out.println("Kalan hakkınız: " + right);
            }
        }

        if(!isWin){
            if(!isWrong){
                System.out.print("Hatalı girdileriniz: ");
                for(int tmp :wrong) System.out.print(tmp + " ");
            }
            System.out.println("Oyunu kazanamadınız. n sayısı: "+n);
        }
    }
}
