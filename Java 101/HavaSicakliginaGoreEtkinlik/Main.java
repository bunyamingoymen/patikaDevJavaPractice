import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sicaklik;

        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen bir sıcaklık değeri giriniz: ");
        sicaklik = s.nextInt();
        if(sicaklik<=5){

            System.out.println("Kayak yapılabilir");

        }else if(5< sicaklik && sicaklik<=25){
            if(sicaklik<10){
                System.out.println("Sinemaya gidilebilir");
            }
            else if(10<=sicaklik && sicaklik<=15){
                System.out.println("Sinemaya gidilebilir veya piknik yapılabilir");
            }else{
                System.out.println("Piknik yapılabilir");
            }
        }else{
            System.out.println("Yüzme etikinliğine gidilebilir");
        }
    }
}
