// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

// Input Format
//---------------
// A number n
// n1
// n2
// .. n number of elements


// Output Format
//-----------------
// A number representing max - min
import java.util.*;
public class span_of_array{
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a1 = new int[n];
        for(int i = 0; i < n; i++){
            a1[i] = scn.nextInt();
        }
        
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        for(int i = 0; i < a1.length; i++){
            if(a1[i] < minval){
                minval = a1[i];
            }
            if(a1[i] > maxval){
                maxval = a1[i];
            }
        }
        int span = maxval - minval;
        System.out.println(span);
    }
    
}