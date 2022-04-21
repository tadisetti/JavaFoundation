import java.util.*;
class Productdigit
  {
    //amin method
    public static void main(String args[])
    {
      //declear a varaible
      int n,product=0,rem;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      n=sc.nextInt();
      //using while loop
      while(n!=0)
        {
          rem=n%10;
          product=product*10+rem;
          n=n/10;
          
        }
      //print result
      System.out.println(product);
      
    }
  }