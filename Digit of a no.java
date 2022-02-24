import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int dig=0;
      int temp=n;
      while(temp!=0)
      {
          temp=temp/10;
          dig++;
          
      }
      int x=(int)Math.pow(10,dig-1);
      while(x!=0)
      {
          int q=n/x;
          n=n%x;
          x=x/10;
          System.out.println(q);
      }
      
     }
    }