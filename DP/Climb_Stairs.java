// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
// 4. You are required to print the number of different paths via which you can climb to the top.

// Input Format
// A number n

// Output Format
// A number representing the number of ways to climb the stairs from 0 to top.


package DP;

import java.util.Scanner;

public class Climb_Stairs {
    public static void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = CountPaths(n, new int[n+1]);
        System.out.println(cp);
    }

    public static int CountPaths(int n, int qb[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        int nm1 = CountPaths(n-1, qb);
        int nm2 = CountPaths(n-2, qb);
        int nm3 = CountPaths(n-3, qb);
        int cp = nm1 + nm2+ nm3;
        qb[n] = cp;
        return cp;
    }
}
