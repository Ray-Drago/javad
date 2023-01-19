import java.io.*;
class Swapnum
{
    public static void main(String args[])
    {
        
        int a,b,temp=0;
        try 
        {
       
       
         System.out.println("Enter a:");
          DataInputStream dis=new DataInputStream(System.in); 
        a=Integer.parseInt(dis.readLine());

  

        System.out.println("Enter b");
        b=Integer.parseInt(dis.readLine());
          temp=a;
          a=b;
          b=temp;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
        
    }
