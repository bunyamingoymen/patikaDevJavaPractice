import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10,20,20,10,10,20,5,20};

        ArrayList<Integer> repeat = new ArrayList();

        for(int i = 0; i<numbers.length;i++){
            if(!repeat.contains(numbers[i])){
                repeat.add(numbers[i]);
            }
        }

        for(int i = 0; i<repeat.size();i++){
            int count = 0;
            for(int j =0; j<numbers.length;j++){
                if(repeat.get(i) == numbers[j]){
                    count++;
                }
            }
            System.out.println(repeat.get(i) + " sayısı " + count + " kere tekrar etti");
        }
    }
}
