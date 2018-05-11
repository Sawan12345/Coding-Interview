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
public class OneAway {
    
    //I can compare the string , character count
    //but what if there are two operations for insert or delete?!
   //lets chexk for any one edit
    public boolean oneEdit(String str1, String str2)
    {
       char[] c1= str1.toCharArray();
       char[] c2= str2.toCharArray();
       int counter=0; 
       int count1=0;
        int count2=0;
        
        int minLength = Math.min(c1.length, c2.length);

for(int i = 0; i < minLength; i++)
{
        if (c1[i] != c2[i])
        {
            counter++;    
        }
}
        System.out.println(counter);
        
       for(int i=0; i<=str1.length()-1; i++){
           count1++;
       }
       for(int i=0; i<=str2.length()-1; i++){
           count2++;
       }
        if(str1.equals(str2)){
            System.out.println("zero edit away");
        return true;
        }
         if(count1 == count2+1){
           if(str1.contains(str2)){
                System.out.println("one insert away");
               return true;
           }
           }else if(count1 == count2-1){
           
              System.out.println("one delete away");
               return true;
          }else if(count1 == count2){
              for(int i=0; i<count1-1; i++)
              {
                  if(c1[i]!=c2[i]){
                  System.out.println("one replace away");
                  }
              
              }
           }
        System.out.println("not running inside");
   return false;
    }

}