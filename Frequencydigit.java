import java.util.*;
class Frequencydigit
  {
    // main method
    public static void main(String args[])
    {
      //decleare a varaiable
  int temp,count,digit,i;
Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int n=sc.nextInt();
      //using for loop frequency of digit
      for(i=0;i<=9;i++)
      {
      temp=n;
      count=0;
while(temp>0)
  {
    digit=temp%10;
    if(digit==i)
    {
      count++;
      }
    temp/=10;
  }
        if(count>0)
        {
          //print result
        System.out.println(i+" "+count);
  }
  }
      }
  }