import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int maximum(int a[],int n)
    {
        int max=a[0];
        int i;
        int pos=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                pos=i;
            }
        }
        //System.out.println("returned element is"+i);
        return pos;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=in.nextInt();
            int player=0;
            while(n!=0)
            {    
            int max=maximum(a,n);
            n=max;
          //      System.out.println("Maximum is"+n);
            if(n==0)
                break;
            if(player==0)
                player=1;
            else
                player=0;
            }
            if(player==0)
                System.out.println("BOB");
            else
                System.out.println("ANDY");
        }
    }
}
