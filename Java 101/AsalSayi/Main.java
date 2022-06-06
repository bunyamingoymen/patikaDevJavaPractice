public class Main {
    public static void main(String[] args) {
        for(int i = 2; i<100;i++){
            boolean is_asal = true;
            for(int j = 2; j<i; j++){
                if(i%j == 0 ){
                    is_asal = false;
                    break;
                }
            }
            if(is_asal){
                System.out.print(i + " ");
            }
        }
    }
}
