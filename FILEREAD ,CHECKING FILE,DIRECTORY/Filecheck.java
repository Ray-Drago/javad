/*
// To check file 

import java.io.*;
class Filecheck
{
public static void main(String args[])
{
try
{
File f=new File("ffiledemo.txt");
if(f.exists()) 
{
System.out.println("File Exists");
}
else{
System.out.println("File does not  Exists");
}
}
catch(Exception e)
{System.out.println(e);}
}
}
*/

import java.io.*;
class Filecheck
{
public static void main(String args[])
{
try
{
File f=new File("ffiledemo.txt");
if(f.exists()) 
{
System.out.println("File Exists");
System.out.println("File name:"+f.getName());
System.out.println("Parent nmae"+f.getParent());
System.out.println("Write ??"+f.canWrite());
System.out.println("Read :"+f.canRead());
System.out.println("Length :"+f.canRead());
System.out.println("directory :"+f.isDirectory());
System.out.println("File :"+f.isFile());
System.out.println("Path:"+f.getCanonicalPath());
}
}
catch(Exception e)
{System.out.println(e);}
}
}