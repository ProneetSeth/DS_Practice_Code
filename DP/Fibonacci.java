// 1. You are given a number n.
// 2. You are required to print the nth element of fibonnaci sequence.

// Note -> Notice precisely how we have defined the fibonnaci sequence
// 0th element -> 0
// 1st element -> 1
// 2nd element -> 1
// 3rd element -> 2
// 4th element -> 3
// 5th element -> 5
// 6th element -> 8

// Input Format
// A number n

// Output Format
// A number representing the nth element of fibonnaci sequence

package DP;

import java.util.Scanner;

public class Fibonacci {
    //DP code for fibonacci 
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fibn = FibMemoized(n, new int[n+1]);
        System.out.println(fibn);
    }

    public static int FibMemoized(int n, int qb[]){
        if(n==0||n==1){
            return n;
        }

        if(qb[n] != 0){
            return qb[n]; // here in 2nd circle it will pick the result from the array and it will not solve further.10 
        }

        int fibnm1 = FibMemoized(n-1, qb);
        int fibnm2 = FibMemoized(n-2, qb);
        int fibn = fibnm1+fibnm2;

        qb[n]=fibn; // here it will store the result for 1st circle
        return fibn;
    }
}
