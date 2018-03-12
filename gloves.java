/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAIYAZ
 */
import java.util.*;
public class gloves {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
            int n=sc.nextInt();
            int l[]=new int[n];
            int g[]=new int[n];
            int flag=0;
            for(int n_i=0;n_i<n;n_i++)
            {
                l[n_i]=sc.nextInt();
            }
            for(int n_i=0;n_i<n;n_i++)
            {
                g[n_i]=sc.nextInt();
                if (!(g[n_i]>=l[n_i]))
                {
                    flag=1;
                }
            }
            if (flag==1)
            {
               flag=0; 
               for(int n_i=0;n_i<n;n_i++)
               {
                 if (!(g[n_i]>=l[n-n_i-1]))
                 {
                    flag=1;
                    break;
                 }
                 
              }
               if(flag==1)
                   System.out.println("None");
               else
                   System.out.println("back");
            }
            else 
            {
               for(int n_i=0;n_i<n;n_i++)
               {
                 if (!(g[n_i]>=l[n-n_i-1]))
                 {
                    flag=1;
                    break;
                 }
                 
               }
               if(flag==1)
                   System.out.println("front");
               else
                   System.out.println("both");
            }
        }
    }
    
}
