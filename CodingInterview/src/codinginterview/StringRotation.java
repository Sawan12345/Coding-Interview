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
       public boolean isRotation(String str1, String str2){
       //waterbottlewaterbottle98 --- ewaterbottl
       int len = str1.length();
       if(len ==str2.length() &&len>0){
       String s = str1+str1;
           System.out.println(s);
       return isSubstring(s, str2);
       }
           System.err.println("error counts");
       return false;
       }
}

