package BinaryTree.project06;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private class Stack {
        private ListNode top;
        private int length;

        private class ListNode {
            private TreeNode data;
            private ListNode next;

            public ListNode(TreeNode data) {
                this.data = data;
            }
        }

        public Stack() {
            top = null;
            length = 0;
        }

        public boolean isEmpty() {
            return length == 0;
        }

        public void push(TreeNode data) {
            ListNode temp = new ListNode(data);
            temp.next = top;
            top = temp;
            length++;
        }

        public TreeNode pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            TreeNode result = top.data;
            top = top.next;
            length--;
            return result;
        }

        public TreeNode peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return top.data;
        }

    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
    }

    //Iterative pre-order traversal using the custom stack class
    public void postOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack stack = new Stack();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();

        System.out.println("Iterative Post-Order Traversal:- ");
        bt.postOrderIterative(bt.root);
    }
}