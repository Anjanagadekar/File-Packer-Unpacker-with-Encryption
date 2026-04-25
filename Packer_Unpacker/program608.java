// Unpacking code
import java.io.*;
import java.util.*;

class program608
{
    public static void main(String A[]) throws Exception
    {
        // variable creation
        Scanner sobj = null;
        String Filename = null;
        File fpackobj = null;
        FileInputStream fiobj = null;
        byte bHeader[] = new byte[100];
        String Header = null;

        sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file : ");

        Filename = sobj.nextLine();

        fpackobj = new File(Filename);

        if(fpackobj.exists()== false)
        {
            System.out.println("Error : there is no such packed file");
            return;
        }

        fiobj = new FileInputStream(fpackobj);

        // read the header
        fiobj.read(bHeader,0,100);

        Header = new String(bHeader);

        System.out.println("Header : "+Header);



    }
    
}
 

