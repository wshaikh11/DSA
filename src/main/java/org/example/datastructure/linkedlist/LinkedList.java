package org.example.datastructure.linkedlist;

public class LinkedList {

    Node  head;
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList linkedList,int data) {
        Node newNode = new Node(data);
        if (linkedList.head == null) {
            linkedList.head = newNode;

        }
        else {
            Node last = linkedList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return linkedList;
    }

    public static void display(LinkedList linkedList) {
        if (linkedList.head == null) {
            return;
        }
        Node currNode = linkedList.head;
        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    public static LinkedList insertAtFirst(LinkedList linkedList,int data) {
        Node newNode = new Node(data);
        if(linkedList.head == null) {
            linkedList.head = newNode;
        }
        newNode.next = linkedList.head;
        linkedList.head = newNode;
        return linkedList;
    }

    public static LinkedList insertAtPos(LinkedList linkedList, int data, int pos) {
        Node newNode = new Node(5);
        if(pos == 1) {
            newNode.next = linkedList.head;
            linkedList.head = newNode;
            return linkedList;
        }

        int count = 0;
        int flag =0;
        Node newPos = linkedList.head;
        Node temp = linkedList.head;
        while (count != pos) {

            if(flag != pos -1) {
                temp = temp.next;
                flag ++;
            }
            newPos = newPos.next;
            count ++;
        }

        newNode.next = newPos;
        temp.next = newNode;
        return linkedList;
    }

    public static LinkedList deleteAtFirst(LinkedList linkedList) {
        Node newNode = linkedList.head;
        newNode = newNode.next;
        linkedList.head = newNode;
        return linkedList;
    }

    public static LinkedList deleteAtLast(LinkedList linkedList) {
        Node last = linkedList.head;
        Node temp = linkedList.head;
        int count =0;
        int flag =0;
        while (last.next != null) {
            last = last.next;
            count ++;
        }

        while (flag != count -1) {
            temp = temp.next;
            flag ++;
        }
        temp.next=null;
        return linkedList;

    }

    public static void deleteAtPos(LinkedList linkedList,int pos) {
        Node temp = linkedList.head;
        int size=0;
        while (temp!=null) {
            temp = temp.next;
            size++;
        }
        System.out.println(size);
        if(pos ==size) {
            deleteAtLast(linkedList);
            return;
        }
        if (pos==1) {
            deleteAtFirst(linkedList);
            return;
        }

        Node temp1 = linkedList.head;
        Node temp2 = linkedList.head;
        int count =0;
        int flag =0;
        while (count != pos) {
            temp1 = temp1.next;
            count++;
        }
        while (flag != count-2) {
            temp2 = temp2.next;
            flag ++;
        }
        temp2.next = temp1;

    }


    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList = insert(linkedList,1);
        linkedList = insert(linkedList,2);
        linkedList = insert(linkedList,3);
        linkedList = insertAtFirst(linkedList,4);
        //display(linkedList);
        linkedList = insertAtPos(linkedList,5,4);
        //display(linkedList);
        //deleteAtFirst(linkedList);
        //deleteAtFirst(linkedList);

        //deleteAtLast(linkedList);
        //deleteAtFirst(linkedList);
        deleteAtPos(linkedList,5);
        display(linkedList);


    }


}