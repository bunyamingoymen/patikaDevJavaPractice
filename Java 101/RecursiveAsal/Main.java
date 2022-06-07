import java.util.Scanner;

public class Main {

    static boolean isAsal(int n, int tmp){
        if(tmp == 1){
            return true;
        }else{

            if(n%tmp == 0){
                return false;
            }else{
                return isAsal(n, tmp-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        int n = s.nextInt();
        if(isAsal(n,n-1)){
            System.out.println(n + " sayısı ASALDIR !");
        }else{
            System.out.println(n + " sayısı ASAL değildir !");
        }

    }
}
