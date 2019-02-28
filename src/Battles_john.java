

import java.util.*;
import java.io.*;
public class Battles_john {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        int ground[][]=new int[N+1][N+1];
        System.out.println("Enter T hits");
        String T1=sc.nextLine();
        String T=sc.nextLine();
        String hits_T[]=T.split(" ");
        int count[]=new int[100];
        int temp_count[]=new int[100];
        int hit=0,sink=0;
        System.out.println("Enter S positions");
        String S=sc.nextLine();
        String pos_S[]=S.split(",");
        int length_pos=pos_S.length;
        int start_row=0,start_col=0,end_row=0,end_col=0,t_start_col=0;
        for(int i=0;i<length_pos;i++)
        {
            String values[]=pos_S[i].split(" ");
            int length_of_values=values.length;
            for(int j=0;j<length_of_values;j++)
            {
                char column_c=values[j].charAt(values[j].length()-1);
                String row_S = values[j].substring(0,values[j].length()-1);
                //convert row and column to numbers
                int row=Integer.parseInt(row_S.trim());
                int column=(int)column_c-64;
               // ground[row-1][column]=j+1;
                if(j==0)
                {
                    start_row=row;
                    start_col=column;
                }
                else
                {
                    end_col=column;
                    end_row=row;
                }
            }
            t_start_col=start_col;
            for(;start_row<=end_row;start_row++)
            {
                for(start_col=t_start_col;start_col<=end_col;start_col++)
                {
                    ground[start_row][start_col]=i+1;
                    count[i+1]++;
                    temp_count[i+1]++;
                }
            }
        }

        //making T in numbers
        int length_hits=hits_T.length;

        for(int k=0;k<length_hits;k++)
        {
            char column_c=hits_T[k].charAt(hits_T[k].length()-1);
            String row_S = hits_T[k].substring(0,hits_T[k].length()-1);
            //convert row and column to numbers
            int row=Integer.parseInt(row_S);
            int column=(int)column_c-64;
            count[ground[row][column]]--;
        }

        for(int i=0;i<100;i++)
        {
          

            if(temp_count[i]>0)
            {
                if(count[i]==0)
                    sink++;
                else if(count[i]<temp_count[i])
                    hit++;
            }
        }
        System.out.println("Hits"+hit);
        System.out.println("Sink"+sink);

    }

}
