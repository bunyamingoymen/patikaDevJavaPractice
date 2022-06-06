import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner s = new Scanner(System.in);

        int right = 3;

        int balance = 1500;

        while(right>0){
            System.out.println("Lütfen kullancıı adınızı giriniz: ");
            userName = s.next();
            System.out.println("Lütfen şifrenizi giriniz: ");
            password = s.next();

            if(userName.equals("bgoymen") && password.equals("123")){

                System.out.println("Merhaba Bankamıza hoşgeldiniz!");

                int select = -1;

                do {
                    System.out.println("--------------------------------------");
                    System.out.println("Hangi işlemi yapmak istersiniz: ");
                    System.out.println("1- Para Yatırma");
                    System.out.println("2- Para Çekme");
                    System.out.println("3- Bakiye Sorgulama");
                    System.out.println("4- Çıkış Yap");
                    System.out.println("--------------------------------------");
                    select= s.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatıracağınız para miktarını giriniz:  ");
                            int price = s.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekeceğiniz para miktarını giriniz: ");
                            int price2 = s.nextInt();
                            if(balance<price2){
                                System.out.println("Yeterli Para bulunmamaktadır");
                            }else{
                                System.out.println("Paranın hazırlanıyor...");

                                balance -= price2;
                                System.out.println("Son kalan bakiye: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek üzere");
                            break;
                        default:
                            System.out.println("Hatalı işlem! Lütfen tekrar deneyiniz.");
                            break;
                    }



                }while(select != 4);
                break;

            }else{
                right--;
                System.out.println("Hatalı giriş yaptınız.");
                switch (right){
                    case 0:
                        System.out.println("Hesabınız bloke olmuştur.");
                        break;
                    default:
                        System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }


    }
}
