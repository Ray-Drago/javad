 
 
/*
  //Generic method
  //create a generic method to print an arrayimport java.io.*;
 
 class Genericmethod
 {
	 public static <A> void sumn(A a,A b)//generic method 
	 {
		 A j;
		 sum;
		 SOp sum;
	 }
	 
 


public static void main(String args[])
  {
	//more than one data type
    //same logic,only the data types differ
	
	int i=10;
	int j=20;
	double =2.3;
	double =2.3;
	//Generic method
	
  }
}


//Using genric method to find sum of elements in array
*/
class Genericmethod
 {
	 public static <G extends Number> /*bounded type genric */void printa(G[] a)//generic method 
	 {
		 double sum=0.0;
		 for(G el:a )
		 {
		  System.out.println(el);
	      sum=sum+el.doubleValue();
	     }
		 System.out.println("Sum is"+sum);
    }
 
public static void main(String args[])
  {
	//more than one data type
    //same logic,only the data types differ
	
	Integer [] ia={1,2,3,4};
     Double [] da={1.2,3.2,3.8,4.4};
	 printa(ia);
	 printa(da);
  }
 }

	//Generic method