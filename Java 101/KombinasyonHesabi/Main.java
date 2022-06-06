import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Formül: C(n,r) = n! / (r! * (n-r)!)
        Scanner s = new Scanner(System.in);

        System.out.println("n değerini girniz: ");
        int n = s.nextInt();

        System.out.println("r değerini giriniz: ");
        int r = s.nextInt();

        int nfactor = 1;
        for(int i = 1 ; i<=n;i++)
            nfactor *= i;


        int rfactor = 1;
        for(int i = 1; i<=r; i++)
            rfactor *= i;


        int nrfactor = 1;
        for(int i = 1; i<= (n-r); i++)
            nrfactor *= i;

        double result = nfactor / (rfactor * nrfactor);

        System.out.println("Sonuç: " + result);


    }
}
