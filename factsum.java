import java.io.*;
import java.util.*;
class factsum{
    int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
        f=f*i;
        }
        return f;
    }
    int factsum(int n){
        int f=1;
        int sum=0;
        for(int i=1;i<=n;i++){
        f=f*i;
        sum+=f;
        }
        return sum;
    }
    double calfac(int n){
        double s=0.0;
        System.out.print("Enter value of x:(1-5) ");
        Scanner S=new Scanner(System.in);
        int x=S.nextInt();
        for(int i=0;i<n;i++){
            s+=(Math.pow(x,i)/fact((int)i));
        }
        return s;
    }
    public static void main(String args[]){
        System.out.print("Enter n: ");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        factsum obj=new factsum();
        System.out.print("factorial sum till "+n+" is "+obj.factsum(n)+"\n");
        System.out.print("factorial new "+n+" is "+obj.calfac(n));
    }
}