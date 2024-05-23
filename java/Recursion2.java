import java.util.*;
class Recursion2{
    public static void printNumbers(int n){
    //     if(n==0){
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumbers(n-1);
    // }
        if(n==6){
            return;
            
        }
        System.out.println(n);
        printNumbers(n+1);
    }
    public static void main(String args[]){
        int n =0;
        printNumbers(n);
    }
}