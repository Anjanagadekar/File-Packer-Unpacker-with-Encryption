import java.io.*;
import java.util.*;

class program583
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

            System.out.println("number of files into folder:"+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("file name :"+fArr[i].getName());
                System.out.println("file name :"+fArr[i].length());
                
            }
        }
        else
        {
            System.out.println("there is no such folder");
        }
    
    }
    
}
 

