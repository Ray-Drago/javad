import java.io.*;
import java.nio.file.*;
class Filedemo2
{
    public static void main(String args[])
    {
        try
        {
            Path pf=Paths.get("E:\\k\\4file.txt");
            Path p=Files.createFile(pf);
            
            DataInputStream d=new DataInputStream(System.in);
           System.out.println("Enter String:");
            
            String dt=d.readLine();
            Files.write(pf,dt.getBytes());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}