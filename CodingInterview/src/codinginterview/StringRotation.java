/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

/**
 *
 * @author Komal
 */
public class StringRotation {

    public boolean isSubstring(String str1, String str2){
    
       if(str1.contains(str2)){
           System.out.println("true");
       return true;
       }else{
        System.out.println("false");
       return false;
    }
    }
       public boolean isRotation(String s1, String s2){
       
       int len = s1.length();
       if(len ==s2.length() &&len>0){
       String s1s2 = s1+s2;
           System.out.println(s1s2);
       return isSubstring(s1s2, s2);
       }
           System.err.println("error counts");
       return false;
       }
}

