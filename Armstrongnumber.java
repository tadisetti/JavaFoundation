import java.util.*;
class Armstorngnumber
  {
    public static void main(String args[])
    {
      int n,d,i,sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter a number");
      int t=n;
      for(i=1;i<=n;i++)
        {
          if(n>0)
            d=n%10;
          sum=sum+(d*d*d);
            n=n/10;
        }
      if(sum==n)
      {
        System.out.println("it is Armstrong number");
        
      }
      else
      {
      System.out.println("it is not Armstrong number");  
      }
    }
  }