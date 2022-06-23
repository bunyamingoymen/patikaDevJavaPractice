import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dizinin boyutu n: ");
        int n = s.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i<n;i++){
            System.out.println( (i+1) + ". Eleman: ");
            numbers[i] = s.nextInt();
        } // for sonu


        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                if(numbers[i]>numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j]=tmp;
                } // if sonu
            } // iç for sonu
        } // büyük for sonu

        System.out.print("Sıralamanız: " );
        for(int i : numbers) System.out.print(i + " ");
    }//main sonu
} // class sonu
