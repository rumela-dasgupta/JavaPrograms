import java.io.*;
import java.util.Scanner;
class S_DEV{
    int mysum(int a[],int n){
        int i,s;
        s=0;
        for(i=0;i<n;i++){
            s=s+a[i];
        }
        return s;
    }
    float average(int a[],int n){
        float avg;
        avg=mysum(a,n)/(float)n;
        return avg;
    }
    int large(int a[],int n){
        int big,i;
        big=a[0];
        for(i=1;i<n;i++){
            if(a[i]>big)
            big=a[i];
        }
        return big;
    }
    double s_d(int a[],int n){
        double mean=average(a,n);
        double sumSquaredDiffs = 0.0;

        for (int i = 0; i < n; i++) {
            double diff = a[i] - mean;
            sumSquaredDiffs += diff * diff;
        }

        double variance = sumSquaredDiffs / n; 
        return Math.sqrt(variance);
    }
}
class q4as1java{
    public static void main(String args[])throws IOException{
    int i,s,n,big;
    float avg;
    double s_d;
    int a[]=new int[20];
    S_DEV SD=new S_DEV();
    Scanner S=new Scanner(System.in);
    System.out.print("Enter size of your array(1-20)= ");
    n=S.nextInt();
    System.out.println("Enter "+n+" elements one by one--->");
    for(i=0;i<n;i++){
        System.out.print("a["+i+"]=");
        a[i]=S.nextInt();
    }
    s=SD.mysum(a,n);
    avg=SD.average(a,n);
    big=SD.large(a,n);
    s_d=SD.s_d(a,n);
    System.out.println("sum of "+n+" elements= "+s);
    System.out.println("average of "+n+" elements= "+avg);
    System.out.println("largest of "+n+" elements= "+big);
    System.out.println("standard deviation of "+n+" elements= "+s_d);
    
}
}