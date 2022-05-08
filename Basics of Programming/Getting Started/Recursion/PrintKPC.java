import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        
        String str= scn.next();
        
        printKPC(str,"");

    }
    
    static String[] codes={";","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String ques, String ans) {
        
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        char ch=ques.charAt(0);
        
        String roq= ques.substring(1);
        String codeforch= codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++)
        {
        char cho=codeforch.charAt(i);
        printKPC(roq, ans+cho);
        }
    }

}