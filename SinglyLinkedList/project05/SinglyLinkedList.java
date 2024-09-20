package SinglyLinkedList.project05;
import java.util.Scanner;
public class SinglyLinkedList {
    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        Scanner input = new Scanner(System.in);

        sll.insertLast(11);
        sll.insertLast(8);
        sll.insertLast(1);
//        System.out.println("Enter the no. of nodes u want to make :- ");
//        int len = input.nextInt();
//        System.out.println("Enter the nodes :- ");
//
//        for(int i=0;i<len;i++){
//            int data = input.nextInt();
//
//            sll.insertLast(data);
//        }

        sll.display();

        input.close();
    }
}
