import java.util.Scanner;

public class TheBigAndTheSmall {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int small = s.nextInt();
        int big = s.nextInt();

        while(s.hasNextInt()) {
            int input = s.nextInt();
            
            if(input < small) {
                small = input;
            }else if(input > big) {
                big = input;
            }
        }

        System.out.println("Smallest: " + small + "\n" + "Biggest: " + big);
    } 
}