public class Stack {

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