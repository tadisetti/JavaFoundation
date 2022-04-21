import java.util.*;
class Palindrome
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaible
      int n,rem=0,denum;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
        n=sc.nextInt();
      
      int temp=n;
      //using while loop
      while(n!=0)
        {
        denum=n%10;
      rem=rem*10+denum;
      n=n/10;
          }
          if(temp==rem)
          {
            //print result
        System.out.println("it is palindrome number");
          }
          else
          {
           System.out.println("it is not palindrome number");
          }
          }
          }
      
    