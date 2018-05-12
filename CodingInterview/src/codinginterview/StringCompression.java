/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

import java.util.HashMap;

/**
 *
 * @author Komal
 */
public class StringCompression {
    
    public String compresed(String str){
       
        String compressString ="";
        int countConsecutive = 0;
        for(int i=0; i<str.length();i++){
        countConsecutive++;
        if(i+1 >= str.length() || str.charAt(i)!=str.charAt(i+1)){
        compressString +="" + str.charAt(i)+countConsecutive;
        countConsecutive = 0;
        }
        }
        System.out.println(compressString);
        System.out.println("hello Komal");
        return compressString.length() <str.length()? compressString:str;
    
    }
}
