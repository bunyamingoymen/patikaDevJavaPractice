import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int km, age, yolculukType;
        double ucret = 0.10;

        System.out.println("Mesafayi giriniz(km cinsinden): ");
        km = s.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        age = s.nextInt();

        System.out.println("Yolculuk türünüz giriniz:(1- gidiş, 2-gidiş-dönüş): ");
        yolculukType = s.nextInt();

        if( (km> 0 ) && (age > 0) && ( (yolculukType == 1) || (yolculukType == 2) ) ){

            double total = km * ucret;


            if(yolculukType == 2){
                total *=2;
            }

            double ageIndirim = -1;

            if(age<12){
                ageIndirim = 0.5;
            }else if(12<=age && age<24){
                ageIndirim = 0.1;
            }else if(age>65){
                ageIndirim = 0.3;
            }

            if(ageIndirim != -1){
                total = total - (total * ageIndirim);
            }

            if(yolculukType == 2){


                total = total - (total * 0.20);
            }

            System.out.println("Toplam Tutar: " + total + " TL");

        }else{
            System.out.println("Hatalı veri girdiniz!");
        }
    }
}
