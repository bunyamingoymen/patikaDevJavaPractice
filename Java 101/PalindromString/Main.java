import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Lütfen palindrom olup olmadını kontrol etmek için bir kelime giriniz: ");
        String str = s.next();
        if(isPalindrome(str)){
            System.out.println("Bu kelime palindromdur: " + str);
        }else{
            System.out.println("Bu kelime palindrom değildir: " + str);
        }
    }
}
