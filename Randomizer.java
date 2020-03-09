import java.util.Random;

public class Randomizer {

    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int rows = Integer.parseInt(args[2]);
        int cols = Integer.parseInt(args[3]);
        int[][] arr = new int[rows][cols];
        Random rand = new Random();

        // Create 2D array
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt((min - max) + 1) + min;
            }
        }

        // print 2D array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}