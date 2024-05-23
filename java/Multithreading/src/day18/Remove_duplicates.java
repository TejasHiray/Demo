package day18;


import java.util.*;
class Remove_Duplicates {
    static void removeDuplicate(char str[], int length)
    {
        int c = 0;
        for (int i = 0; i < length; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
            if (j == i)
            {
                str[c++] = str[i];
            }
        }
        System.out.println(Arrays.copyOf(str, c));
    }


    public static void main(String[] args)
    {
        String a = "Good Morning Have a nice day";
        char str[] = a.toCharArray();
        int len = str.length;
        removeDuplicate(str, len);
    }
}
