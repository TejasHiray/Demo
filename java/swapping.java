import java.util.*;
class swap{
    public static void main(String args[]){
        int x,y,t;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println(x+" "+y);
        t=x;
        x=y;
        y=t;
        System.out.println(x+" "+y);
        System.out.println();

    }
}