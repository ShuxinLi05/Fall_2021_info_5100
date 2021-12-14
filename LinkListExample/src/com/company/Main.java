package com.company;

public class Main {

    public static void main(String[] args) {
        /*

        LinkList<Integer> list = new LinkList();

        list.add(5);
        list.add(-1);
        list.add(3);
        list.add(4);
        list.add(8);

        list.printList();

        LinkListChar listChar = new LinkListChar();

        listChar.add('a');
        listChar.add('b');
        listChar.add('c');
        listChar.add('d');
        listChar.add('e');

        listChar.printList();

         */

        LinkList<Integer> list = new LinkList<>();

        list.addToHead(5);
        list.addToHead(-1);
        list.addToHead(3);
        list.addToHead(4);
        list.addToHead(8);

        list.printList();
/*
        LinkList<String> listNames = new LinkList<>();

        listNames.add("Ashish");
        listNames.add("Tom");
        listNames.add("Peter");
        listNames.add("Bill");
        listNames.add("Glenn");



        listNames.printList();

 */

    }
}
