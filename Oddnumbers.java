import java.util.*;
class Oddnumbers
{
  //main method
public static void main(String args[])
{
  //declear a varaible
int i=1,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
  System.out.println("Even number");
//using while loop
while(i<=n)
  { 
    if(i%2!=0)
    {
      //print result 
    System.out.println(i);
     
  }
    i++;
    }
}
}