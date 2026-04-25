// Unpacking code
import java.io.*;
import java.util.*;

class program607
{
    public static void main(String A[]) throws Exception
    {
        // variable creation
        Scanner sobj = null;
        String Filename = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file : ");

        Filename = sobj.nextLine();

        File fpackobj = new File(Filename);

        if(fpackobj.exists()== false)
        {
            System.out.println("Error : there is no such packed file");
        }
    }
    
}
 

