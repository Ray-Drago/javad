import java.io.*;
class Randomfile
{
public static void main(String args[])
{
try
{
 RandomAccessFile r=new RandomAccessFile("123edemo.txt","rw"); // to show specified folder
	
 
 r.seek(r.length());
 String s="hi";
 System.out.println("Ptr",+r.getFilePointer());
 r.write(s.getBytes());
 r.close();
 
} 
	
catch(IOException e)
{
System.out.println(e);
}

}}