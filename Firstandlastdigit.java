import java.util.*;
class Firstandlastdigit
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaible
      int count=0,n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter first and last digit");

      int lastdigit=n%10;
     //using while loop
      while(n>10)
      {
        n=n/10;
        }
      
        int firstdigit=n;
      {
        //print result
        System.out.println(firstdigit+" "+ lastdigit);
      }
    }
  }