import java.io.*;
class Foreachsumdemo
{
public static void main(String srgs[])
{
int a[]={5,6,8,9,7};
int sum=0;
for(int i:a)  //for each loop
{
sum=sum+i;
}
System.out.println("Sum i is "+sum);
}
}