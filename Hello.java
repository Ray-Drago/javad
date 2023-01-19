class Hello
{
    public static void main(String args[])
    {
        int count;
        int i;
        count=args.length;
      System.out.println("No :of argumments :"+count);
      while(i<count)
      {
        System.out.println("The"+ i +"th argument is "+args[i]);
        i++;
      } 
         }
}