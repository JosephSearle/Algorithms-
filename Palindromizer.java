import java.util.Scanner;

public class Palindromizer {

    public static void main(final String[] args) {

        final Scanner s = new Scanner(System.in);
        final String input = s.nextLine();

        final byte[] strInBytesArray = input.getBytes();
        final byte[] result = new byte[strInBytesArray.length];

        for(int i = 0; i < strInBytesArray.length; i++) {
            result[i] = strInBytesArray[strInBytesArray.length - i - 1];
        }

        System.out.println(input + new String(result));
    }
}