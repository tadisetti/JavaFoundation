import java.util.Scanner;
class Naturalnumbers
  {
    //main method
    public static void main(String args[])
    {
      //declear a variable
      int i=1,n;
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter natural numbers");
      n=sc.nextInt();
     
      //using while loop
      while(i<=n)
        {
          //print result
          System.out.println(i);
          i++;
          }
      }
    }
  