import java.util.Scanner;
import java.util.Arrays;

public class Reversi {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte [strAsByteArray.length];

        System.out.println(Arrays.toString(strAsByteArray));

        for(int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        System.out.println(new String(result));
    }
}