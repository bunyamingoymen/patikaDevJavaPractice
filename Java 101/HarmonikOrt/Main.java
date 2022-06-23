public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double harmonik = 1;
        for(int i = 2 ; i<numbers.length;i++){
            harmonik += 1/i;
        }

        double result = numbers.length / harmonik;
        System.out.println("Sonuç: " + result);
    }
}
