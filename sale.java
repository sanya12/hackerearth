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
import java.util.*;
import java.io.*;
public class sale {
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int N=sc.nextInt();
            int price[]=new int[N];
            int quantity[]=new int[N];
            int discount[]=new int[N];
            double newprice,discountvalue=0;
            double finalvalue=0;
            for(int j=0;j<N;j++)
            {
                price[j]=sc.nextInt();
                quantity[j]=sc.nextInt();
                discount[j]=sc.nextInt();
                newprice=price[j]+(double)((discount[j]*price[j])/(double)100);
                //System.out.println(newprice);
                discountvalue=newprice-(discount[j]*newprice)/100;
                //System.out.println(discountvalue);
                finalvalue+=(price[j]-discountvalue)*quantity[j];
                //System.out.println(finalvalue);
            }
            System.out.println(finalvalue);
        }
        
    }
   
    
}
