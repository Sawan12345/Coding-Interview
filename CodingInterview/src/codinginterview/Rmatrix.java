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

    //swap step by step   
//	public static void rotate(int[][] matrix){
//		int l=matrix.length;
//		for(int i=0;i<l/2;i++){
//			for(int j=i;j<l-i-1;j++){
//				int t=matrix[i][j];
//				matrix[i][j]=matrix[j][l-i-1];
//				matrix[j][l-i-1]=matrix[l-i-1][l-j-1];
//				matrix[l-i-1][l-j-1]=matrix[l-j-1][i];
//				matrix[l-j-1][i]=t;
//			}
//		}
//		
//	}
        
        //try with simple 2d matrix
    //simple swap
    
    int level=0;
    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");

        }
    }
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
    
       public static void rotate(int [][] arr){
           int length = arr.length-1;
           int level=0;
           for(int i=0; i<arr.length; i++){

               int temp = arr[i][i];
               arr[i][i] = arr[i][length];
               arr[i][length] = arr[length][length-i];
               arr[length][length-i]= arr[length-i][level];
               arr[length-i][level]=temp;
            
           }
           printMatrix(arr);
        }
    }
//
//    
//    //lets rotate
//    static void rotateMatrix90(int arr[][]) {
////        int length = arr.length-1;
//        //rotating 1st layer
//        for (int i = arr.length; i < arr.length ; i++) {
//            for (int j = i; j < arr[0].length ; j++) {
// 
//                
//                int t = arr[arr.length-1][arr.length-1];
//                arr[arr.length-1][arr.length-1] = arr[i][j] ;
//                arr[i][j] = t;
//            }
//        }
//              printMatrix(arr);  
//    }
        
        
        
//	public static void main(String[] args){
//		int matrix[][] = new int[][] { { 1, 2, 3,4,5},
//				{ 6,7,8,9,10 }, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} };
//		rotate(matrix);
//		for(int i=0;i<matrix.length;i++){
//			for(int j=0;j<matrix[0].length;j++){
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}


