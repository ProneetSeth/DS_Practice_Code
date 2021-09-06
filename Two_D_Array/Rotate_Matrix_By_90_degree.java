// 1. You are given a number n, representing the number of rows and number of columns.
// 2. You are given n*n numbers, representing elements of 2d array a.
// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
// *Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*

// Input
// a b c d
// e f g h
// i j k l
// m n o p

// Output
// m i e a
// n j f b
// o k g c
// p l h d

//The solution to this is, first do the transpose of the matrix and then reverse the column row by row


package Two_D_Array;
import java.util.*;

public class Rotate_Matrix_By_90_degree {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[][] = new int[n][n];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //Transpose
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j< arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse the column
        for(int i =0; i < arr.length; i++){
            int li = 0;
            int ri = arr[i].length - 1;
            while(li < ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
        display(arr);
    }    
    //display function
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
