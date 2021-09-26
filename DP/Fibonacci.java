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
