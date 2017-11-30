/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc=new Scanner(System.in);
        char a[][]=new char[52][2];
        int count[]=new int[4];
        String s[]={"Ashu","Mishra","Powale","Pk"};
        for(int i=0;i<52;i++)
        {
            //System.out.println("ROW"+i);
            for(int j=0;j<2;j++)
            {
                a[i][j]=sc.next().charAt(0);
               // System.out.println(a[i][j]);
                if(j==1)
                {
                if(a[i][j]=='A'||a[i][j]=='K'||a[i][j]=='Q'||a[i][j]=='J')
                {
                 //   System.out.println("mod"+ i%4);
                    count[i%4]++;
                 }
                }
                //System.out.println("Column"+j);
            }
             //System.out.println("Row"+i);
        }
        for(int i=0;i<4;i++)
        {
            if(count[i]<=1 && (i==0||i==1))
            {
            System.out.println(s[i]);
            return;
            }
            if(i==2 && count[i]<=1 && count[i+1]<=1)
            {
                System.out.println(s[i+1]);
                return;
            }
            else if(i==2 && count[i]<=1 && count [i+1]>1)
            {
                System.out.println(s[i]);
                return;
            }
            if(i==3 && count[i]<=1)
            {
                System.out.println(s[i]);
                return;
            }
        }
     System.out.println("-1");
    }
}
