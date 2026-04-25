import java.io.*;
import java.util.*;

class program586
{
    public static void main(String A[])
        {
            int no = 21;
            int Ans = 0;

            Ans = no ^ 11;

            System.out.println("Encrypted data : "+Ans);

            Ans = Ans ^ 11;

            System.out.println("Decrypted data : "+Ans);
        }
    
    
}
