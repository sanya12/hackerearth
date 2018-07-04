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
public class lastdigitfib {

    /**
     * @param args the command line arguments
     */
    
       public static void main(String args[])
       {
        Fiboalgo obj=new Fiboalgo();
        int num=obj.calculate();
        System.out.println("length is"+num);
        long value=(obj.n+2)%num;
        int res=(int)value;
        //System.out.println(res);
        //value=(int)value;
        System.out.println(obj.mod[res]-1);
    }
    
}
    