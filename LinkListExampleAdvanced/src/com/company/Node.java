package com.company;

// <T> is temporary
public class Node <T>{

    // T can be int/string/... anything
    public T data;
    public Node next;

    public Node(T data){
        this.data = data;
    }
}
