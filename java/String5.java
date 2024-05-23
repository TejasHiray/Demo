// import java.util.*;
// class String5{
//     public static void main(String [] args){
//         String str="Tejas",nstr=" ";
//         char ch;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Tejas");
//         for (int i=n;i<str.length();i++)
//         {
//             ch=str.charAt(i);
//             nstr=ch+nstr;
//         }
//         System.out.println(nstr);
//     }
// }

public class String5{
    public static void main(String[] args) {
        String str="Tejas";
        String str2=" ";

        for(int i=str.length-1; i>=0;i--){
            str2+=str;

        }
        System.out.println(str2);
    }
}