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


    public Node(int newData){
    data = newData;
    next= null;
    }
    public Node(int newData, Node newNext){
      data= newData;
      next=newNext;
    }
    
    public void printnode(){
    Node n = next;
    while(n !=null){
        System.out.print(n.data+" ");
        n=n.next;
    }
    }
    
    
    //trying to implement print(iteration) and delete
    public void duplicate(){
    Node n = next;
    while(n.data == n.next.data){
        System.out.print(n.data+" ");
        System.out.println("dups");
        n=n.next;
        }
    }
    
    
    Node deleteNode(Node head, int d){
        Node n =head;
        if(n.data == d){
        return head.next;
        }
        while(n.next !=null){
        if(n.next.data==d){
        n.next =n.next.next;
        return head;
        }
        n=n.next;
        }
    return head;
    }
    
   
    
    public void appenTotail(int d){
    Node end =new Node(d);
    Node n =this;
    while(n.next != null){
        n=n.next;
    }
    n.next=end;
    }
}
