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
public class URLify {
   
    public String insertStr(String str){
        //convert to char array
        char[] c =str.toCharArray();
        int spacecount = 0;
//first count the space in the string 
        for(int i=0; i<c.length-1; i++)
        {
        if(c[i]==' ')
        
            spacecount++;
        }
        int newlength = c.length+2*spacecount;
       //create new array to insert % 2 0. 
       char[] newarry = new char[newlength+1];
       
       int newindex=0;
       newarry[newindex]='\0';
       for(int i=0; i<c.length;i++)
       {
           if(c[i]== ' '){
           newarry[newindex]= '%';
           newarry[newindex+1]= '2';
           newarry[newindex+2]= '0';
           newindex = newindex+3;
           
           }else{
           newarry[newindex]=c[i];
           newindex++;
           }
       }
       return String.valueOf(newarry);
       
    }
    
}
