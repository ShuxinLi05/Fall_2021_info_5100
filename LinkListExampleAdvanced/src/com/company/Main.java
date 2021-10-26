package com.company;

public class Main {

    public static void main(String[] args) {

        LinkList<Integer> list = new LinkList<Integer>();
        //LinkList list = new LinkList();

        list.add(5);
        list.add(-1);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(2);

        list.printList();

        LinkList<String> listNames = new LinkList<>();

        listNames.add("Amy");
        listNames.add("Bob");
        listNames.add("Charley");
        listNames.add("David");
        listNames.add("Emily");
        listNames.add("Fred");
        listNames.add("Garrett");

        listNames.printList();

    }
}
