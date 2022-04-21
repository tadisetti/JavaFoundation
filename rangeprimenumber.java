 import java.util.*;
class rangeprimenumber
  
  {
    public static void main(String args[])
    {
      int n,i,j;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      n=sc.nextInt();
      
       int count=0;
      
      for(i=1;i<=n;i++)
        {
          count=0;
          for(j=1;j<=n;j++)
        {
          if(i%j==0)
          {
            count++;
            
          }
        }
      if(count==2)
      {
        System.out.println(i);
        }
          }
      
    }
  }