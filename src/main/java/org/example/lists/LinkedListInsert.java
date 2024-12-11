package org.example.lists;

public class LinkedListInsert {
    private ListNode head;

    public static class ListNode {
        private int data; // this represents the content of list

        private ListNode next;// this represents the pointer

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void diasplayList() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //get the total length of the single linked list

    public int displayLength() {
        if (head == null) {
            return 0;
        }
        int countList = 0;

        ListNode current = head;

        while(current != null) {
            countList ++;
            current = current.next;
        }
        return  countList;
    }

    public void insertNodeFirst(int value) {
        ListNode newNodeValue = new ListNode(value);
        newNodeValue.next = head;
        head = newNodeValue;
    }

    public void insertNodeAtLast(int value) {
        ListNode newNodeValue = new ListNode(value);

        if (head == null) {
            head = newNodeValue;
            return;
        }

        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }

        current.next = newNodeValue;
    }

    public static void main(String[] args) {
        LinkedListInsert ll = new LinkedListInsert();

        ll.head = new ListNode(20);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(5);

        ll.head.next = second;
        second.next = third;
        third.next = fourth;

        ll.diasplayList();
        System.out.println("Total length is " + ll.displayLength());

        System.out.println("Insert new node at the beginning");

        ll.insertNodeFirst(100);
        ll.diasplayList();

        System.out.println("Insert new node at the end");

        ll.insertNodeAtLast(657);
        ll.diasplayList();

    }
}
