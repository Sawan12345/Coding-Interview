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
public class Zmatrix {
    
//    1 0   [00][01]
//    2 3   [10][11]
    
//    0 0
//    2 0
    
    //iterate array and look for zero element
    static void printMatrix(int arr[][]) {
        
        int M=arr.length;
        int N=arr[0].length;
        
        //this is additional
    boolean[] row = new boolean[M];
    boolean[] col = new boolean[N];
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            if (arr[i][j] == 0) {
                row[i] = true;
                col[j] = true;
                
                //store i and j for next step
            }
        }
    }
    for (int i = 0; i < M; i++) {
        //use Strored i if its true than make it constant change jth row    [00][01][02]will be zero
        if (row[i]) { 
            for (int j = 0; j < N; j++) {
                arr[i][j] = 0;
            }
        }
    }
    for (int j = 0; j < N; j++) {
        //use Strored j if its true than make it constant change ith row    [00][10][20]will be zero
        if (col[j]) {
            for (int i = 0; i < M; i++) {
                arr[i][j] = 0;
            }
        }
    }
     for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");

    }
}
}
