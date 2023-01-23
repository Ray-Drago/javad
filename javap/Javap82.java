//Write a program to implement a user defined Exception, 
//which will throw an Exception when a given number is prime.

import java.io.*;
import java.util.*;
import java.lang.Math.*;
class NewException extends Exception{
 NewException(String message){
 super(message);
 }
}
class Javap82
{
 static boolean isPrime(int n){
 if (n <= 1) return false;
 for (int i = 2; i < n; i++)
 if (n % i == 0)
 return false;
 return true;
 }
 public static void main(String args[])
 {
 try{
     DataInputStream dis=new DataInputStream(System.in);
     System.out.print("Enter a Number: ");
     int a=Integer.parseInt(dis.readLine());
 
     if(isPrime(a)) throw new NewException ("Prime Numbers not Allowed!");
     else System.out.println("The non-prime number you entered is: "+a);
 }
 catch(NewException e)
   {
    System.out.println(e);
   }   
 catch(Exception e)
    {
      System.out.println(e);
    }
  }
}