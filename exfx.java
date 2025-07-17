//exfx.java : using taylor expansion
import java.util.*;
//non taylor expansion
public class exfx{
    public static int fact(int n){
    int fact=1;
    for(int i=1;i<=n; i++){
        fact*=i;
    }
    return fact;
    }

public static double Taylor(double x,int n){
    double term,sum=0.0;
    for (int i=0;i<=n;i++){
        term=Math.pow(x,i)/fact(i);
        sum+=term;
    }
    return sum;
}
public static void main(String[] args){
    Scanner S=new Scanner(System.in);
    double x;
    int n;
    System.out.print("enter the value of x(<=2): ");
    x=S.nextDouble();
    

System.out.print("enter no of terms\n");
n=S.nextInt();
System.out.println("e^x(Taylor's)= "+ Taylor(x,n));
System.out.println("e^x(standard library)= "+Math.exp(x));
System.out.println("Precision: "+Math.abs(Math.exp(x)-Taylor(x,n)));
S.close();

}
}