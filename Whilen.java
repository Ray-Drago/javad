import java.io.*;
public class Whilen
{
    public static void main(String args[])
    {
        int i=1;
        try{
            while(i<=25)
            {
                System.out.println(i);
                i++;
            }
        }
    catch(Exception e)
        {
            System.out.println(e);
        }    
    }

}
