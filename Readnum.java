import java.io.*;
class Readnum
{
    public static void main(String args[])
    {
        
        String  str,str1;
        try 
        {
        System.out.println("Enter x");
        DataInputStream dis=new DataInputStream(System.in); 
        str=dis.readLine();
        System.out.println("X is :"+ str);
        System.out.println("Enter y");
        str1=dis.readLine();
        System.out.println("Y is :"+ str1);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
        
    }
