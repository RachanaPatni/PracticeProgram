import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
// Createfile
/*public class fileHanding
{
    public static void main(String args[])
    {
        try{
            File myFile=new File("filename.txt");
            if(myFile.createNewFile()){
                System.out.println("File created:" + myFile.getName());
                System.out.println("Absolute path: "+ myFile.getAbsolutePath());
            }
            else {
                System.out.println("File already exists.");
            }
        }catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
*/

//Read File
import java.io.File;
import java.io.FileNotFoundException;
import  java.util.Scanner;
/*public class fileHanding
{
    public static void main(String args[])
    {
        try{
            File myFile=new File("filename.txt");
            Scanner myReader=new Scanner(myFile);
            while (myReader.hasNext()){
                String data=myReader.nextLine();
                System.out.println(data);
            }myReader.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("An error found");
            e.printStackTrace();
        }
    }
}
*/

// Get File Information
/*public class fileHanding
{
    public static void main(String args[])
    {
        File myFile=new File("filename.txt");
        if(myFile.exists()){
            System.out.println("File name: "+ myFile.getName());
            System.out.println("Absolute path:" + myFile.getAbsolutePath());
            System.out.println("Writeable:" + myFile.canWrite());
            System.out.println("File size in bytes " +myFile.length());
        }else {
            System.out.println("The file does not exist.");
        }
        }

    }

 */
//Delete file
/*
public class fileHanding
{
      public static void main(String args[])
      {
          File myFile=new File("filename.txt");
              if(myFile.delete())
          {
              System.out.println("Deleted the file: "+ myFile.getName());
          }else {
                  System.out.println("Failed to delete the file");
              }
      }
}

 */

