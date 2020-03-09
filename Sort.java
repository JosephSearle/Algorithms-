import java.util.Scanner;
import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = "";

        while(s.hasNextLine()) {
            str = str + s.nextLine() + " ";
        }

        String[] arr = str.split(" ");

        int[] nums = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        System.out.println(Arrays.toString(nums));

        boolean sorted = false;
        int temp = 0;

        while(!sorted) {
            sorted = true;
            for(int i = 0; i < nums.length - 1; i++) {
                if(nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}