import java.util.Scanner;

public class TheAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        while(scanner.hasNextInt()) {
            total += scanner.nextInt();
            count++;
        }

        int average = total / count;

        System.out.println("Average: " + average);
    }
}