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
   

    public static void main(String[] args) {
//      URLify ui= new URLify();
//      System.out.print(ui.insertStr("KOmal Suthar 123"));

        String str = "tact coa";
        PermutationPalindrom permutation = new PermutationPalindrom();
         permutation.Permute(str, 0, str.length()-1);
    }
}

