/*
import java.io.*;
mport java.io.*;
import java.util.*;
class CString{
 String s1,s2,s3;
 public void read(){
 Scanner s=new Scanner(System.in);
 try{
 System.out.print("\nEnter a String A: ");
 s1=s.nextLine();
 System.out.print("Enter a String B: ");
 s2=s.nextLine();
 }catch(Exception e){}
 }
 public void display(){
 System.out.println("\nString 1: "+s1);
 System.out.println("String 2: "+s2+"\n");
 }
 public Boolean compare(){
 if(s1.length() != s2.length()){
 return false;
 }else{
 for(int i=0;i<s1.length();i++){
 if(s1.charAt(i) != s2.charAt(i))
 return false;
 }
 return true;
 }
 }
 public void concat(){
 s3=s1+s2;
 System.out.println("\nString 3(Concatination): "+s3);
 }
}
class Str1{
 public static void main(String args[])

{
CString cs =new CString();

 
 
 cs.read();
 cs.display();
 Boolean x=cs.compare();
 if(x) System.out.println("The strings are equal!");
 else System.out.println("The strings are not equal!");
 cs.concat();
 }}
 */
 
 import java.lang.*;
import java.io.*;
import java.util.*;
class distance{
 public int inch, feet;
 public Object clone(){
	 try{
 return super.clone();
 }catch(CloneNotSupportedException e){
 return this;
 }r
 }
 public void read()throws Exception{
 DataInputStream dis = new DataInputStream(System.in);
 System.out.println("Enter feet: ");
 feet=Integer.parseInt(dis.readLine());
 System.out.println("Enter inch: ");
 inch=Integer.parseInt(dis.readLine());
 while(inch>=12){ //for conversion 12 in = 1 feet
 if(inch>=12){
 feet=feet+1;
 inch=inch-12;
 }
 }
 }
 public void display(){
 System.out.println("feet: "+feet+" inch: "+inch);
 }
}
public class Objectclonning2{
 public static void main(String args[]) throws Exception{
 distance d1 = new distance();
 d1.read();
 
 distance d2=(distance) d1.clone();
 System.out.println("\nObject 1: ");
 d1.display();
 System.out.println("\nObject 2(Clone): ");
 d2.display();
 }
}
 