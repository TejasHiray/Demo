import java.util.*;
class functions{
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return ;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();

    //     printMyName(name);
    // }

    public static int sum(int a, int b){
        int ans= a+b;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        int ans=sum(a,b);
        System.out.println(ans);
    }
}