 import java.io.*;
 import java.lang.*;
class distance implements Cloneable
{
	float inch;
	float feet;
	distance(float feet,float inch)
	{
	this.inch=inch;
	this.feet=feet;
	}
	
	public Object clone() throws CloneNotSupportedException
	
	{
		return super.clone();
	}
}
class Clone7
{
public static void main(String args[])throws CloneNotSupportedException
{

	 distance d1=new distance(4,34);
	 distance d2=(distance)d1.clone();
	
	System.out.println(d1.feet+"feet "+d1.inch+"inches");
     System.out.println(d2.feet+"feet"+d2.inch+"inches");		 
 
}
 }