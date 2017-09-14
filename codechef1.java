/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechef;

/**
 *
 * @author FAIYAZ
 */
import java.io.*;
import java.util.*;
public class codechef1 {
   
   public static void main(String arg[])
   {
       Scanner sc=new Scanner(System.in);
       int T=sc.nextInt();
       //System.out.println();
       String h=sc.nextLine();
       for(int i=0;i<T;i++)
       {
           String s="";
           s=sc.nextLine();
           //System.out.println("String is"+s);
           int l=s.length();
           String sub=s.substring(0,1);
           //System.out.println("first letter"+ch1);
           //char f=Character.toUpperCase(ch1);
           //System.out.println("first letter"+f);
           sub=sub.toUpperCase();
           //System.out.println("First"+sub);
           String new_s="";
           int space=s.lastIndexOf(' ');
           new_s+=sub;
           if(space>=l||space<=0)
           {
             
               new_s+=  s.substring(1,l).toLowerCase();
                System.out.println(new_s);
                 continue;
           }
           //System.out.println("space"+space);
           
           //System.out.println("Outside loop"+new_s);
           for(int j=0;j<l;j++)
           {
              if(s.charAt(j)==' ')
               {
                char ch=Character.toUpperCase(s.charAt(j+1));  
                 new_s+=". "+ch;
                  // System.out.println("else if loop"+new_s);
               }
              
              else if(j>=space+2)
               {
                   new_s+=Character.toLowerCase(s.charAt(j));
                   //  System.out.println("If loop"+new_s);
               }
               
              // System.out.println("In loop"+j+" "+new_s);
              
           }
           
                System.out.println(new_s);
       }

   }
}
