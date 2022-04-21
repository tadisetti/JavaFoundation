import java.util.*;
class Countdigits
  {
    //main method
    public static void main(String args[])
    {
      //declear a variable 
      int num,count=0;
      Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
      System.out.println("Enter number of digits");
       //using while loop
      while(num!=0)
        {
        num=num/10;
          count++;
          {
            //print result
        System.out.println(count);
            }
      }
          }
    }
    
  
