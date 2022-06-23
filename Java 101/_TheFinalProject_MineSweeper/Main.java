import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen mayın tarlasının satır sayısını belirleyiniz: ");
        int x = s.nextInt();
        System.out.println("Lütfen mayın tarlasının sütun sayısını belirleyiniz:");
        int y = s.nextInt();
        MineSweeper ms = new MineSweeper(x,y);
        ms.run();
    }
}
