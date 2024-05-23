import java.util.*;
class String5{
    publis static void main(String args[]){
        String str="Tejas",nstr='';
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Tejas");
        for (int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println(nstr);
    }
}