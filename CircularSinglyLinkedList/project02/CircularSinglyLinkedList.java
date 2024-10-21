package CircularSinglyLinkedList.project02;

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

    public ListNode removeFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("Circular singly linked list is already empty");
        }
        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertLast(11);
        csll.insertLast(22);
        csll.insertLast(33);
        System.out.println("Linked List before deletion :- ");
        csll.display();
        System.out.println("Linked List after deletion :- ");
        csll.removeFirst();
        csll.display();

    }
}

