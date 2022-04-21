import java.util.*;
class Vowel
  {
    //main method
    public static void main(String args[])
    {
      //declear a varaible
      char ch='a';
      System.out.println("Enter vowel");
      {
        //using for loop
        for( ch='A';ch<='Z';ch++)
          {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
             //print result
              System.out.println(ch);
          }
      }
    }
  }