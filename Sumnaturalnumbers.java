import java.util.*;
class Sumnaturalnumbers
  {
    //main method
    public static void main(String args[])
    {
      //declear a variable
      int sum=0,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter n value");
      int i=1;
      //using while loop
      while(i<=n)
        {
          sum=sum+i;
          i++;
      }
      //print result
     System.out.println(sum); 
    }
  }