import java.io.*;
import java.util.*;

class program582
{
    public static void main(String A[]) throws Exception
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of folder:");
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists())&&(fobj.isDirectory()))
        {
            System.out.println("Folder is present");

            File fArr[] = fobj.listFiles();

            System.out.print("number of files into folder:"+fArr.length);
        }
        else
        {
            System.out.println("there is no such folder");
        }
    
    }
    
}
 
