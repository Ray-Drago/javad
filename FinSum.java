import java.io.*;
class Sum
{
 static int x,y,z;
 static void fun(int x,int y)
  {
    z=x+y;
    System.out.println("sum is "+z);
  }
}
class FinSum
{
public static void main(String args[])
  {
  Sum s=new Sum(5,5);
  Sum.fun();
  }
 }