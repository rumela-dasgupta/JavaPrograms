//inheritance_1.java:write a program in java to implement
//multilevel inheritance.input 'n' elements and store in 1 dimensional array a[].
//calculate and print (i) sum of all elements (ii) average of all elements (iii)largest value and (iv)standard deviation
import java.io.*;
import java.util.*;
class SUM// defining a class to calculate sum of n numbers
{
    public int sum(int a[],int n){
        int i,s;
        s=0;
        for(i=0;i<n;i++)
        s=s+a[i];
        return s;
    }
    public int large(int a[],int n){
        int big,i;
        big=a[0];
        for(i=1;i<n;i++){
        if(a[i]>big)
        big=a[i];
        }
        return big;
    }
    class Average extends SUM{
        public float average(inta[],int n){
            float avg;
            avg=(float)(sum(a,n)/n);
            return avg;
        }
    }
    class Std extends Average{
        
    }
}