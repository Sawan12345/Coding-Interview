/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.HashSet;

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
    
    static void removeDuplicate(Node head) 
    {
        // Hash to store seen values
        HashSet<Integer> hs = new HashSet<>();
     
        /* Pick elements one by one */
        Node current = head;
        Node prev = null;
        while (current != null) 
        {
            int curval = current.data;
             
             // If current value is seen before
            if (hs.contains(curval)) {
                prev.next = current.next;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
 
    }
    //trying to implement print(iteration) and delete
    public void duplicate(){
        //take two values and iterate through the list
        Node a=null;
        a=next;
        Node b=null;
        Node dup=null;
        
        while(a != null && a.next!=null){
        b=a;
        if(a.data == b.next.data){
            dup=b.next;
            b.next=b.next.next;
            deleteNode(a, data);
        }else{
            b=b.next;
                }
            
        }
//    Node n = next;
//    while(n.data == n.next.data){
//        System.out.print(n.data+" ");
//        System.out.println("dups");
//        n=n.next;
//        }
    }
    public int getCount()
    {
        Node temp = next;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
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
