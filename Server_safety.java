import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void checkAll(int n, int[] height, int[] position) {
        // Complete this function
       
         int left[]=new int[n];
         int right[]=new int[n];
         int i=0;
         for(;i<n-1;i++)
          {
            int topple_height=position[i]+height[i];
                int j=i;
                for( j=i+1;j<n;j++)
                {
                    if(topple_height>=position[j])
                    {
                       
                        left[j]=1;
         //               System.out.println("left value j"+j);
                        continue;
                    }
                    else
                    { 
                        //i=j-2;
           //              System.out.println("left value j not equal"+j);
                        break;
                    }  
                }
             
         }
       //System.out.println("LEFT OVER");
         i=n-1;
        for(;i>=1;i--)
        {
          int topple_height=position[i]-height[i];  
          int j=i-1;
          for(j=i-1;j>=0;j--)
          { 
             if(topple_height<=position[j])
             {
              
        //        System.out.println("i+j if less"+i+" "+j); 
                right[j]=1;
                continue; 
             }
              else 
              {   
                //i=j+2;  
          //      System.out.println("i+j if not less"+i+" "+j);  
                break;
              }
           }
        }
      //System.out.println("RIGHT OVER");  
      int lft_chksum=0;
        int i2;
        for(i2=1;i2<n;i2++)
        {
            //System.out.println(left[i2]);
            if(left[i2]==1)
                continue;
            else 
                break;
        }
        if(i2==n)
            lft_chksum=1;
        int j;
        int rgt_checksum=0;
         for(j=0;j<n-1;j++)
        {
          //   System.out.println(right[j]);
            if(right[j]==1)
                continue;
            else 
                break;
        }
        if(j==(n-1))
            rgt_checksum=1;
        
        
        if(lft_chksum==1 && rgt_checksum==1)
            System.out.println("BOTH");
         else if(lft_chksum==1)
             System.out.println("LEFT");
        else if(rgt_checksum==1)
             System.out.println("RIGHT");
        else
            System.out.println("NONE");
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] position = new int[n];
        for(int position_i = 0; position_i < n; position_i++){
            position[position_i] = in.nextInt();
        }
        int[] height = new int[n];
        for(int height_i = 0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
         checkAll(n, height, position);
        //System.out.println(ret);
        in.close();
    }
}
