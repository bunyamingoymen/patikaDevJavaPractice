import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen istediğiniz sayıyı giriniz: ");

        int number = s.nextInt();

        int sayac = 0, total = 0;

        for(int i = 0; i<=number;i++){
            if(i%3 == 0 && i%4 == 0 && i != 0){

                sayac++;
                total +=i;
                System.out.println("3 ve 4 e bölünüyor: " + i);
                System.out.println("Sayaç: " + sayac);
                System.out.println("Toplam: " + total);
            }
        }

        double average = total/sayac;

        System.out.println("3 ve 4 e bölünebilenlerin ortalaması: " + average);
    }
}
