import java.util.*;
class Multipletable
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaiable
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println("Enter muliplication values");
     //using while loop
      for(int i=1;i<=10;i++)
        {
          //print result
          System.out.println(n+"*"+i+"="+(n*i));
        }
        
        
    }
  }