public class BinaryTree {

    private int value;
    private int count;
    private BinaryTree left, right;

    //Create empty tree.
    public BinaryTree() {
        count = 0;
        left = null;
        right = null;
    }

    public void insert(int x) {
        if(count == 0) {
            value = x;
            count = 1;
            left = new BinaryTree();
            right = new BinaryTree();
        }else if(x == value) {
            count++;
        }else if(x < value) {
            left.insert(x);
        }else {
            right.insert(x);
        }
    }

    public void print() {
        if(count != 0) {
            left.print();
            System.out.println(value + " (" + count + ") ");
            right.print();
        }
    }
}