import java.io.*;
public class Sdigit
{
    public static void main(String args[])
    {
        int n,rem=0,sum=0,n1;
        try{
            System.out.println("Enter a digit :");
            DataInputStream dis =new DataInputStream(System.in);
            n=Integer.parseInt(dis.readLine());
            n1=n;
            while(n!=10){
                rem=n%10;
                sum=sum+rem;
                n=n/10;
            
            }
            System.out.println("Sum of digit is "+sum);
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
}