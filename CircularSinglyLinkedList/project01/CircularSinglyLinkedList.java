package CircularSinglyLinkedList.project01;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode (int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        this.last = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public void insertFirst(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
        }else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data){
        ListNode temp = new ListNode(data);
        if(last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        System.out.println("Inserting nodes at the beginning");
        csll.insertFirst(1);
        csll.insertFirst(2);
        csll.insertFirst(3);
        csll.display();
        System.out.println("Length :- " + csll.length());

        CircularSinglyLinkedList csll1 = new CircularSinglyLinkedList();
        System.out.println("Inserting nodes at the beginning");
        csll1.insertLast(11);
        csll1.insertLast(22);
        csll1.insertLast(33);
        csll1.display();
        System.out.println("Length :- " + csll1.length());
    }
}
