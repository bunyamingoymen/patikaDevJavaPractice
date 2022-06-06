import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Doğum yılınızı giirniz: ");
        int year = s.nextInt();
        int mod = year % 12;
        if(mod == 0) System.out.println("Maymun");
        else if(mod == 1) System.out.println("Horoz");
        else if(mod == 2) System.out.println("Köpek");
        else if(mod == 3) System.out.println("Domuz");
        else if(mod == 4) System.out.println("Fare");
        else if(mod == 5) System.out.println("Öküz");
        else if(mod == 6) System.out.println("Kaplan");
        else if(mod == 7) System.out.println("Tavşan");
        else if(mod == 8) System.out.println("Ejderha");
        else if(mod == 9) System.out.println("Yılan");
        else if(mod == 10) System.out.println("At");
        else if(mod == 11) System.out.println("Koyun");
        else System.out.println("Hatalı veri girdiniz");
    }
}
