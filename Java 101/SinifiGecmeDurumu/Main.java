import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkçe, muzik;

        Scanner s = new Scanner(System.in);

        System.out.println("Lütfen Matematik Notunuzu giriniz: ");
        mat = s.nextInt();

        System.out.println("Lütfen Fizik Notunuzu giriniz: ");
        fizik = s.nextInt();

        System.out.println("Lütfen Kimya Notunuzu giriniz: ");
        kimya = s.nextInt();

        System.out.println("Lütfen turkce Notunuzu giriniz: ");
        turkçe = s.nextInt();

        System.out.println("Lütfen Müzik Notunuzu giriniz: ");
        muzik = s.nextInt();

        int total = 0;

        double average = 0;

        if(0<mat && mat<100){
            total++;
            average += mat;

        }

        if(0<fizik && fizik<100){
            total++;
            average += fizik;

        }

        if(0<kimya && kimya<100){
            total++;
            average += kimya;

        }

        if(0<turkçe && turkçe<100){
            total++;
            average += turkçe;

        }

        if(0<muzik && muzik<100){
            total++;
            average += muzik;

        }

        average = average / total;

        if(average <= 55){
            System.out.println("Sınıfta kaldınız");

        }else{
            System.out.println("Sınıfı Geçtiniz");
        }
        System.out.println("Ortalamanız: " + average);
    }
}
