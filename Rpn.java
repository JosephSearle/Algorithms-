import java.util.Scanner;

public class Rpn {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        stack nums = new stack();
        String str = "";

        while(s.hasNextLine()) {
            str = str + s.nextLine() + " ";
        }

        String[] arr = str.split(" ");

        for(int i = 0; i < arr.length; i++) {
            switch(arr[i]) {
                case "x":
                    int a = nums.pop();
                    int b = nums.pop();
                    nums.push(b * a);
                    break;
                case "-":
                    int c = nums.pop();
                    int d = nums.pop();
                    nums.push(d - c);
                    break;
                case "+":
                    int e = nums.pop();
                    int f = nums.pop();
                    nums.push(f + e);
                    break;
                default:
                    nums.push(Integer.parseInt(arr[i]));
            }
        }
        System.out.println(nums.pop());
    }

    public static class stack {

        public class Node {
            int value;
            Node next;
        }

        private Node head;

        public void push(int y) {
            Node x = new Node();
            x.value = y;
            x.next = head;
            head = x;
        }

        public int pop() {
            Node x = head;
            head = (head.next != null) ? head.next : null;
            return x.value;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }
}