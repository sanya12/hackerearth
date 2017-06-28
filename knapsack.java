import java.io.*;
import java.util.*;

public class knapsack {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
         while(T!=0)
        { 
        int n=sc.nextInt();
        int k=sc.nextInt();
        int val[][]=new int[n][k+1];
        int a[]=new int[n];
        
             
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            val[i][0]=0;
        }
        for(int i=0;i<=k;i++)
        {
            val[0][i]=0;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if(i==0)
                {
                    if(a[i]<=j)
                       val[i][j]=Math.max(0,a[i]+val[i][j-a[i]]); 
                    else
                        val[i][j]=0;
                   }
                else
                {
                 if(a[i]<=j)
                  {
                    val[i][j]=Math.max(val[i-1][j],a[i]+val[i][j-a[i]]);
                  }
                    else
                        val[i][j]=val[i-1][j];
                }
                
              //  System.out.print(val[i][j]);
            }
            //System.out.println();
        }
        System.out.println(val[n-1][k]);
        T--;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
}