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
public class LinkedMain {

    Node head;
    int count=0;
    
//    public LinkedMain(){
//    head =null;
//    count=0;
//    }
    
    public LinkedMain(Node newHead){
    head =newHead;
    count=1;
    }
    
    //add a node
    public void add(int newData){
    Node temp = new Node(newData);
    Node current = head;
    
    while(current.getNext() != null){
    current = current.getNext();
    }
    current.setNext(temp);
    }
    
    
    public static void main(String[] args){

 }   
}
