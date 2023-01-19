import java.io.*;
public class odeven
{
    public static void main(String args[])
    {
        int x;
        try{
            System.out.println("Enter x:");
            DataInputStream dis= new DataInputStream(System.in);
            x=Integer.parseInt(dis.readLine());
            if(x%2==0)
            {
                System.out.println("it is even");
            }
            else
            {
                 System.out.println("it is odd");
            }
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
}