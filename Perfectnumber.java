import java.util.*;
class Perfectnumber
  {
    public static void main(String args[])
    {
      int i,n,sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt(); 
      System.out.println("Enter perfect number");
     //check condition
      for(i=1;i<n;i++)
        {
          if(n%i==0)
          {
            sum=sum+i;
          }
        }
      if(sum==n)
      {
        System.out.println("perfect number");
        
      }
      else
      {
      System.out.println("not perfect number");  
      }
        
    }
  }