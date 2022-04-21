import java.util.*;
class Checkvowel
  {
    //main method
    public static void main(String args[])
    {
      //declear a variable
      char ch='a';
      int count=0;
      System.out.println("Enter  alphabet are vowel");
      {
        //using for loop
        for(ch='A';ch<='Z';ch++)
          {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
              
          
        count++;
          }
            
        {
          //print result
          System.out.println(count);
        }
      }
      
      
    }
  }
  