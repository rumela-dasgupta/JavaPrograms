import java.io.*;
import java.util.*;

class func {
    int a[] = new int[20];

    void inputArray(int n) {
        Scanner S = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            a[i] = S.nextInt();
        }
    }
    int sum(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
    double avg(int n) {
        return (double)sum(n) / n; 
    }
    int maxnum(int n){
        int m=a[0];
        for(int i=0;i<n;i++){
            if(m<a[i]) m=a[i];
        }
        return m;
    }
    double sd(int n){
    double avgn=avg(n);
    double sumsq = 0.0;
    for(int i = 0; i < n; i++) {
        double diff = a[i]-avgn;
        sumsq += diff * diff;
    }
    double variance = sumsq / n;
    return Math.sqrt(variance);
    }
    public static void main(String args[]){
        System.out.print("Enter n: ");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        func obj=new func();
        obj.inputArray(n);
        System.out.print("Sum: "+obj.sum(n)+"\n");
        System.out.print("Average: "+obj.avg(n)+"\n");
        System.out.print("maxnum: "+obj.maxnum(n)+"\n");
        System.out.print("Standard Deviation: "+obj.sd(n)+"\n");
    }
}
