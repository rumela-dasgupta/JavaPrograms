import java.io.*;
import java.util.*;
class calc{
    void calc(int n){
     double x,sum=0;
     for(x=0.1;x<=2.0;x+=0.1){
        sum=1;
        double term=1;
        double i=1;
        while(i<=n){
        term=term*(x/i);
        sum+=term;
        i++;
        }
        double actual = Math.exp(x);
        System.out.print("Actual: "+sum+" library func: "+actual+"\n");
     }

    }
    public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    System.out.print("Enter n: ");
    int n=S.nextInt();
    calc obj=new calc();
    obj.calc(n);

    }
}