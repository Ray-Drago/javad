//Generic constructor

import java.io.*;
class Gen<T,U>// genric class
{
T v1;
U v2;
Gen(T o1,U o2)// genric constructor
  {
  v1=o1;
  v2=o2;
  }
  void print()
  {
  System.out.println(v1+" s data is "+v1.getClass());
   System.out.println(v2+" s data is "+v2.getClass());
  }
 
}
 class GenCon
 {
 public static void main(String args[])
 {
 Gen<String ,Integer>g1= new Gen("A",123);
 g1.print();
 Gen<Double ,String>g2= new Gen(12.1,"b");
 g2.print();
 Gen<Double ,Double>g3= new Gen(12.11,12.3);
 g3.print();
 Gen<Integer ,Integer>g4= new Gen(12,3);
 g4.print();
 }}