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
    

//    1 2 3 4
//    5 6 7 8 
//    9 10 11 12 
//    13 14 15 16

//    13 9 5 1
//    14 10 6 2
//    15 11 7 3
//    16 12 8 4
    
//    [00][01][02][03]
//    [10][11][12][13]
//    [20][21][22][23]
//    [30][31][32][33]
//    
//    j=0; j<arr.length; j++
//    {
//        i=j
//    }
    
    //1-0 for(i=0; i<a.length/2;) 0 time
    //2-1 for(i=0; i<a.length/2;) 1
    //3-1 for(i=0; i<a.length/2;) 1
    //4-2 for(i=0; i<a.length/2;) 2
    //5-2 for(i=0; i<a.length/2;) 2
    //6-3 for(i=0; i<a.length/2;) 3 
    //7-3 for(i=0; i<a.length/2;) 3
    
    //for(i=0;i<arr.length/2; i++)//for level
    //1 2 [00] [01]
    //3 4 [10] [11]
    
    //temp=[01] 
    //[01]=[00]
    //[00]=[10]
    //[10]=[11]
    //[11]=temp
    
    //3 1 [10] [00]
    //4 2 [11] [01]
    
//    1 2 3     [00][01][02]
//    4 5 6     [10][11][12]
//    7 8 9     [20][21][22]
    
//    7 4 1     [20][10][00]
//    8 5 2     [21][11][01]
//    9 6 3     [22][12][02]
    
    //code ne jevu ko evu j kare
       public static void rotate(int [][] arr){
           int N=arr.length;
           int i=0;
          for(i=0;i<arr.length/2; i++){
          
          for(int j=i; j<N-i-1;j++){
           int temp = arr[i][N-j-1];
           arr[i][N-j-1]= arr[j][i];
           arr[j][i] = arr[N-i-1][j];
           arr[N-i-1][j]=arr[N-j-1][N-i-1];
           arr[N-j-1][N-i-1]=temp;
           }
          }
           

          
           printMatrix(arr);
       }
       //debug ...debug...
       
       
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