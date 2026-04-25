import java.io.*;
import java.util.*;

class program601
{
    public static void main(String A[])
    {
        String str = "A.txt 10";

        String Arr[] = str.split(" ");

        System.out.println(Arr.length);     // 4 words in string

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
