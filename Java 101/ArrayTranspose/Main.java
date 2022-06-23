public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 4;

        int[][] transpose = new int[3][2];

        for(int i = 0;  i<2; i++){
            for(int j = 0; j<3; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println("Matris: ");
        for(int i = 0;  i<2; i++){
            for(int j = 0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Transpoze: ");
        for(int i = 0;  i<3; i++){
            for(int j = 0; j<2; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
