/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAIYAZ
 */
import java.io.*;
import java.util.*;
public class Fiboalgo {

    /**
     * @param args the command line arguments
     */
      static long mod[]=new long[1000000];
      static long n;
    public static void generateseries(int i,int m,long mod[])
    {
        
        mod[i]=(mod[i-1]+mod[i-2])%m;
        //System.out.println(mod[i]);
        
    }
    public int calculate() {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
         n=sc.nextLong();
        int m=sc.nextInt();
      
        mod[0]=0;
        mod[1]=1;
        int i;
        for(i=2;;i=i+2)
        {    
           generateseries(i,m,mod);
           generateseries(i+1,m,mod);
           if(mod[i]==0 && mod [i+1]==1)
               break;
           
        }
        return i;
    }
    public static void main(String args[])
    {
        Fiboalgo obj=new Fiboalgo();
        int num=obj.calculate();
        long value=n%num;
        int res=(int)value;
        //System.out.println(res);
        //value=(int)value;
        System.out.println(mod[res]);
    }
    
}
    