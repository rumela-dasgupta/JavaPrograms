import java.io.*;
import java.util.*;
public class tanx{
    public static double rad(double x){
        return x*(Math.PI/180);
    }
    public static int fact(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static double Taylorsinx(double x,int n){
        double term,sum=0.0;
        for(int i=0;i<=n;i++){
            term=(Math.pow(rad(x),2*i+1)*Math.pow(-1,i))/fact(2*i+1);
            sum+=term;
        }
        return sum;
    }
    public static double Taylorcosx(double x,int n){
        double term,sum=0.0;
        for(int i=0;i<=n;i++){
            term=(Math.pow(rad(x),2*i)*Math.pow(-1,i))/fact(2*i);
            sum+=term;
        }
        return sum;
    }
    public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    double x;
    int n;
    

System.out.print("enter no of terms\n");
n=S.nextInt();
for(x=0;x<=360;x+=5){
    double sinx=Taylorsinx(x,n);
    double cosx=Taylorcosx(x,n);
    double mathTan=Math.tan(rad(x));
    if((int)x%180==90){
        System.out.print(x+"\t"+" undefined"+ "\t"+mathTan);
    }
    else{
        double taylorTan=sinx/cosx;
        double diff=Math.abs(taylorTan-mathTan);
        System.out.println(x+taylorTan+mathTan+diff);

    }
}
S.close();
    }
}