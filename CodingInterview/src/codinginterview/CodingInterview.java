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
//ans 1
//      URLify ui= new URLify();
//      System.out.print(ui.insertStr("KOmal Suthar 123"));

//ans 2
//        String str = "tact coa";
//        PermutationPalindrom permutation = new PermutationPalindrom();
//        permutation.Permute(str, 0, str.length()-1);
  
//ans 3
//        OneAway o= new OneAway();
//        o.oneEdit("pale", "bale");

//ans 4
//        StringCompression sc= new StringCompression();
//        sc.compresed("aaabbbaac");

//    Rmatrix rm = new Rmatrix(); 
   int matrix[][] = new int[][] {{0,0,1,2},{2,3,4,5}};
//                rm.printMatrix(matrix);
//		rm.rotate(matrix);
//                rm.rotateInner(matrix);
//    Zmatrix zm =new Zmatrix();
//    zm.printMatrix(matrix);
   
    StringRotation sr= new StringRotation();
    sr.isRotation("waterbottle","ewaterbottl");
    }
}

