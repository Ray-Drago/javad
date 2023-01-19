/*
// To creaTE A FILE
// TO READ A FILE

import java.io.*;
class Filedemo3
{
public static void main(String args[])
{
try
{
	FileInputStream f=new FileInputStream("E://javad//ffiledemo.txt"); // to show specified folder
	
	int i=f.read();
	char c =(char)i;
	System.out.println(c);
} 
	
catch(IOException e)
{
System.out.println(e);
}
}
}
*/

import java.io.*;
class Filedemo3
{
public static void main(String args[])
{
try
{
	char c;
	int i;
	int n=0;
	FileInputStream f=new FileInputStream("E://javad//ffiledemo.txt"); // to show specified folder
	
	i=f.read();
	while(i!=-1)
	{
	 c =(char)i;
	System.out.print(c);
	if(c=='a')
		n++;
	i=f.read();
	}
	System.out.println("a is"+n);
	
} 
	
catch(IOException e)
{
System.out.println(e);
}
}
}