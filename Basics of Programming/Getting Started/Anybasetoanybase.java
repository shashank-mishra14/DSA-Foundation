import java.util.*;
  
  public class Main
  {
  
      public static void main(String[] args)  
      {
          Scanner scn = new Scanner(System.in);
          int n = scn.nextInt();
          
          int sourceBase = scn.nextInt();
         int  destBase= scn.nextInt();
         
         int d= getValue(n,sourceBase,destBase);
          
          System.out.println(d);
         
       }   
      
        public static int getValue(int n, int sourceBase, int destBase)
        
        {
             int dec= anybasetodecimal(n, sourceBase);
             int dn= decimaltoanybase(dec, destBase);
             return dn;
        }
        public static int decimaltoanybase(int n, int b)
        {
            int rv =0;
            
            int p =1;
            
            while(n>0)
            {
                int dig = n % b;
                
                n=n/b;
                
                rv += dig * p;
                
                p=p*10;
                
                
            }
            return rv;
        }
             public static int anybasetodecimal(int n, int b)
               {
              
                  int rv = 0;
                  int p = 1;
                  
                  while(n>0)
                  {
                      int dig = n % 10;
                      
                      n=n/10;
                      rv += dig*p;
                      p =p*b;
                      
                  }
                  return rv;
                }
           
       
    }