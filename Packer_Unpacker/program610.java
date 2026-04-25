// Unpacking code
import java.io.*;
import java.util.*;

class program610
{
    public static void main(String A[]) throws Exception
    {
        // variable creation
        Scanner sobj = null;
        String Filename = null;
        File fpackobj = null;
        File fobj = null;
        FileInputStream fiobj = null;
        byte bHeader[] = new byte[100];
        String Header = null;
        String Tokens[] = null;

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

        Header = Header.trim();

        Tokens = Header.split(" ");

        System.out.println("File name : "+Tokens[0]);
        System.out.println("File size : "+Tokens[1]);

        fobj = new File(Tokens[0]);

        fobj.createNewFile();

    }
    
}
 

