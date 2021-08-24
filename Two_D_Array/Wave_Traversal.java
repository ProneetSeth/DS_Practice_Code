// You need to give two input n and m for row and columns
// Then you have to make a matrix
// Then you need to travel in a wave manner.
// For ex:
// input 
// -------
// You are given 3 x 4 matrix

// 11 12 13 14
// 21 22 23 24
// 31 32 33 34

// output:
// ---------
// 11 21 31 32 22 12 13 23 33 34 24 14


package Two_D_Array;
import java.util.*;
public class Wave_Traversal {
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        //by doing analysis i found that in even index the value of col is increasing from min ==> max 
        //and  in odd index the value of col is decreasing from max ==> min
        for(int j = 0; j < arr[0].length; j++){
            if(j % 2 == 0){
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i = arr.length -1; i >= 0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }    
}
