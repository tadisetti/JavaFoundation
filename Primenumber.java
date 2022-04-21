import java.util.*;
class Primenumber
  
  {
    public static void main(String args[])
    {
      int n,i;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      n=sc.nextInt();
      
       int count=0;
      
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
            
          }
        }
      if(count==2)
    
        System.out.println("it is a prime number");
        
      
      else
      
        System.out.println("it is not prime number");
      
      
      
    }
  }