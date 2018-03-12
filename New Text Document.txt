/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;
*/

    
     import java.util.*;
 class TestClass {
    
    static int res=-1;
    public static void calculatemax(int count,int tstart,int N,int start,int a[])
    {
        if(res<count)
            res=count;
        if(tstart==N)
            System.out.println(res);
        else
            longest(a,N,start+1);
        
            
    }
    
    
    
    public static void longest(int a[],int N,int start){
        
        int temp[]=new int[N];
        int track[]=new int[N];
        for(int i=0;i<N;i++)
        {
           temp[i]=a[i]; 
           track[i]=0;
        }
        int flag=0;
        int count=0;
        int tstart;
       /* for(int i=0;i<N;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println("startting from"+start);*/
        for(tstart=start;tstart<N;tstart++)
        {
            if(temp[tstart]==0 && flag==1)
                break;
            if(temp[tstart]==1)
            {
                count++;
                track[tstart]=1;
            }
            
            else if (temp[tstart]==0 && flag ==0)
            {
                for(int j=0;j<tstart;j++)
                   {
                       if(temp[j]==1 && track[j]==0 && flag==0)
                       {
                         int t=temp[j];
                         temp[j]=temp[tstart];
                         temp[tstart]=t;
                         count++;
                       //  System.out.println(j+"swapped with"+tstart+" "+flag);
                         flag=1;
                       }
                   }
                   
                for(int j=N-1;j>tstart;j--)
                {
                 if(temp[j]==1 && track[j]==0 && flag==0)
                       {
                         int t=temp[j];
                         temp[j]=temp[tstart];
                         temp[tstart]=t;
                         count++;
                         //System.out.println(j+"swapped with"+tstart+" "+flag);
                         flag=1;
                       }   
                }
             }//else if
        }//for
       /* for(int k=0;k<N;k++)
        {
            System.out.print(temp[k]);
        }
        System.out.println(count);*/
        calculatemax(count,tstart,N,start,a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        longest(a,N,0);
    }
    
}

    
