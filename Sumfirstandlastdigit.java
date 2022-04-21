import java.util.*;
class Sumfirstandlastdigit
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaible
      int sum=0,n;
      Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      System.out.println("Enter Sum of first and last digit");
      //using while loop
      while(n!=0)
        {
          int rem=n%10;
          sum=sum*rem;
          n=n/10;
        }
      //print result
      System.out.println(sum);
    }
  }