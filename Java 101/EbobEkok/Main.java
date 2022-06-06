import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz: ");
        int a = s.nextInt();

        System.out.println("2.Sayıyı giriniz: ");
        int b = s.nextInt();

        //Ebob:

        int i = 1;
        String aStringEbob = "", bStringEbob = "";
        int ebob = 0;

        while(i<=a || i<=b){
            if(i<=a && a%i == 0) aStringEbob += i + ", ";
            if(i<=b && b%i == 0) bStringEbob += i + ", ";
            if(i<=b && i<=a && a%i == 0 && b%i == 0){
                ebob = i;
            }
            i++;

        }

        System.out.println(a + "'in bölenleri: " + aStringEbob);
        System.out.println(b + "'in bölenleri: " + bStringEbob);
        System.out.println("Ebob:" + ebob);

        System.out.println("---------------------------------------------------");
        i = 1;
        int aEkok  =a;
        int bEkok = b;
        int ekok = 0;

        String aStringEkok = "", bStrignEkok = "";
        while(i<10){
            aEkok = a * i;
            bEkok = b * i;
            aStringEkok += aEkok + ", ";
            bStrignEkok += bEkok + ", ";
            if(aEkok%b == 0  || bEkok%a == 0){
                ekok = (aEkok%b == 0) ? aEkok : bEkok;
                break;
            }
            i++;
        }

        System.out.println(a + "'in katları: " + aStringEkok);
        System.out.println(b + "'in katları: " + bStrignEkok);
        System.out.println("Ekok:" + ekok);

    }
}
