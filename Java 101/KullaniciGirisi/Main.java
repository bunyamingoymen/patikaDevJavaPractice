import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password;

        Scanner s = new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz: ");
        username = s.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = s.nextLine();

        if(username.equals("bgoymen") && password.equals("123")){
            System.out.println("Başarılı bir şekilde giriş yapılmıştır");
        }else{
            System.out.println("Kullanıcı adı veya şifre hatalı");
        }
    }
}
