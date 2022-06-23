public class Main {
    public static void main(String[] args) {
        int[] numbers= {1,1,2,2,4,5,6,6,7,7,9,9,10,12,14};

        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length;j++){
                if( (numbers[i] == numbers[j]) && (numbers[i]%2 == 0) ){
                    System.out.println("Dizide tekrar eden çift sayı: " + numbers[i]);
                    break;
                }
            }
        }
    }
}
