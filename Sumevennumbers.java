import java.util.*;
class Sumevennumbers
  {
    //main method 
    public static void main(String args[])
    {
      //declear a varaible
      int sum=0,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter Even numbers");
      int i=1;
     //using while loop
      while(i<=n)
        {
          if(i%2==0)
            sum=sum+i;
          i++;
        }
      //print result
      System.out.println(sum);
    }
  }