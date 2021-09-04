// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

// Input Format
// A number n
// A number m
// e11
// e12..
// e21
// e22..
// .. n * m number of elements

// Output Format
// e11
// e21
// ..
// en1
// en2
// en3
// ..
// enm
// e(n-1)m
// ..
// e1m
// e1(m-1)
// ..
// e12
// e22
// e32
// ..
package Two_D_Array;
import java.util.*;
public class Spiral_Traversal{
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        //taking input for size of row and column
        int row = scn.nextInt();
        int column = scn.nextInt();
        int arr[][] = new int[row][column];
        //filling the array
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int min_row = 0;
        int min_col = 0;
        int max_row = arr.length - 1;
        int max_col = arr[0].length - 1;
        int tcn = row * column;
        int count = 0;

        while(count < tcn){
            //left wall
            for(int i = min_row, j = min_col; i <= max_row && count < tcn; i++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            min_col++;

            //bottom wall
            for(int i = max_row, j = min_col; j <= max_col && count < tcn; j++){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            max_row--;

            //right wall
            for(int i = max_row, j = max_col ; i >= min_row && count < tcn; i--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            max_col--;

            //top wall
            for(int i = min_row, j = max_col; j >= min_col && count < tcn; j--){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            min_row++;
        }

    }
}