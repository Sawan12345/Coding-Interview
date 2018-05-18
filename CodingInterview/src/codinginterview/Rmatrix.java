/*
 * given an image represented by an N*N matrix where each pixel in the image is 4 byte write a metho
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codinginterview;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JPanel;

/**
 *
 * @author Komal
 */
public class Rmatrix {

  
        
        //try with simple 2d matrix
    //simple swap
    
   
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");

        }
    }
    
    //Try for 2x2    
    
    //-------main matrix--------------------------
    //0 1 2 3
    //0-0 1 2 3 
    //1-4 5 6 7 
    //2-8 9 10 11 
    //3-12 13 14 15
    
//output will be
    
    //12 8 4 0
    //13 9 5 1
    //14 10 6 2
    //15 11 7 3
    //level first
    
    //code ne jevu ko evu j kare
       public static void rotate(int [][] arr){
           int last = arr.length-1;
    int level=0;     
           for(int j=0; j<last; j++){
               for(int i=j; i<last; i++){
               int temp = arr[level][i];
               arr[level][i] = arr[i][last];
               arr[i][last] = arr[last][last-i];
               arr[last][last-i]= arr[last-i][level];
               arr[last-i][level]=temp;
               }
               last--;
               level++;
           }
           printMatrix(arr);
       }
//  public static void rotateInner(int [][] arr){
//           int last = arr.length-2;
//           int level=0;     
//          rotate(arr);
//           for(int i=1; i<last; i++){
//
//               int temp = arr[i][i];
//               arr[i][i] = arr[i][last];
//               arr[i][last] = arr[last][last];
//               arr[last][last]= arr[last][i];
//               arr[last][i]=temp;

//           }
//           printMatrix(arr);
//       }

}