/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Komal
 */
public class Node {
    
    Node next =null;
    int data;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
    public Node(int newData){
    data = newData;
    next= null;
    }
    public Node(int newData, Node newNext){
      data= newData;
      next=newNext;
    }
    
//    public void appenTotail(int d){
//    Node end =new Node(d);
//    Node n =this;
//    while(n.next != null){
//        n=n.next;
//    }
//    n.next=end;
//    }
}
