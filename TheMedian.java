import java.util.Scanner;

public class TheMedian {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = "";

        while(s.hasNextLine()) {
            str = str + s.nextLine() + " ";
        }

        String[] arr = str.split(" ");

        int[] nums = new int[arr.length];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

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

        int mid = (nums.length - 1) / 2;
        double median = 0;
        double a = nums[mid];
        double b = nums[mid + 1];

        if(nums.length%2 == 0) {
            median = (a + b) / 2; 
        }else if(nums.length%2 == 1) {
            median = nums[mid];
        }
        System.out.println("Median: " + median);
    }
}