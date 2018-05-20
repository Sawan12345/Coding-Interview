/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;
import java.util.LinkedList;
/**
 *
 * @author Komal
 */
public class LinkedMain {

    
    public static void main(String[] args){
        LinkedList<String> lm = new LinkedList<>();
        lm.addFirst("komal");
        lm.add("jay");
        lm.add("komal");
        
         
        Node n =new Node(12);
        n.appenTotail(16);
        n.appenTotail(12);
        n.appenTotail(13);
        n.appenTotail(4);
        n.appenTotail(13);
        n.appenTotail(11);
        System.out.println("Before deletion");
        n.printnode();
//        n.deleteNode(n.next, 11);
        System.out.println("after deletion");
        n.duplicate();
        n.printnode();
//        System.out.println(n.data);
//        System.out.println(n.next.data);
//        System.out.println(n.next.next.data);
       
        
//        System.out.println(lm);
 }   
}
