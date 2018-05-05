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
public class CodingInterview {

    /**
     * @param args the command line arguments
     */
   
    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
    private void permute(String str, int l, int r)
    {
       char c[]=str.toCharArray();
        int n = c.length-1;
        for(int i=0; i<=n/2;i++){
        
            char temp;
            temp = c[i];
            c[i] = c[n-1];
            c[n-1]=temp;
               }
//        System.out.println(String.valueOf(c));
//        return String.valueOf(c);
        if (l == r)
        {
            System.out.println(str);
        } else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }   
        } 
    }
 
    public String palindrom(String str)
    {
     char c[]=str.toCharArray();
        int n = c.length-1;
        for(int i=0; i<=n/2;i++){
        
            char temp;
            temp = c[i];
            c[i] = c[n-1];
            c[n-1]=temp;
               }
        System.out.println(String.valueOf(c));
        return String.valueOf(c);
        
    }
    
    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
 

    public static void main(String[] args) {
      URLify ui= new URLify();
      System.out.print(ui.insertStr("KOmal Suthar 123"));

//           String str = "tact coa";
//        int n = str.length();
//        CodingInterview permutation = new CodingInterview();
//        permutation.permute(str, 0, n-1);
//    if(permutation.palindrom(str)== permutation.permute(str, 0, n-1));
 
}
	
}

