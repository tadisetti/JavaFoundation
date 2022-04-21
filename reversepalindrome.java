import java.util.*;
class reversepalindrome 
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaible
      int n,rem=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
        n=sc.nextInt();
      
      int temp=n,revs=0;
      //using while loop
      while(n!=0)
        {
        rem=n%10;
      revs=revs*10+rem;
      n=n/10;
          }
      //print result
      System.out.println(revs);    
      }
  }
    
