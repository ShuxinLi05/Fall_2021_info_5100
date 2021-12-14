package com.company;

public class LinkList <T> {

    public Node head;

    public LinkList(){
        head = null;
    }
    /*

    public void add(T data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head = node;

    }

     */


    public void addToHead(T data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head = node;

    }


    public void addToTail(T data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }
        Node<T> temp = head;
        while(temp.next != null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
/*
        node.next = head;
        head = node;

 */

    }


    public void printList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();

    }

    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }




    }



}
