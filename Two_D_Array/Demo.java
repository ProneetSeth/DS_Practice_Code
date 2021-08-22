// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to display the contents of 2d array as suggested by output format below.

// Input Format
//---------------
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output Format
// e11 e12 e13 ..
// e21 e22 e23 ..


package Two_D_Array;
import java.util.*;
public class Demo {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
     }    
}
