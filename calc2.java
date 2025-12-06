import java.io.*;
import java.util.*;
class calc2{
    int fact(int n){
        int fact=1;
        int i=1;
        while(i<=n){
            fact=fact*i;
            i++;
        }
        return fact;
    }
    void calc2(int n){
        
        for(int x=0;x<=360;x+=5){
            double sum=0,sum1=0;
            double rad=(x*Math.PI)/180;
            int i=1;
            int j=0;
            while(i <= 2*n - 1 && j <= 2*n){
                double sin=Math.pow(rad,i);
                double sin1=sin/fact(i);
                int sinTermIndex = (i - 1) / 2;
                if(sinTermIndex % 2 == 1)
                    sin1 *= -1;

                sum += sin1;
                double cos=Math.pow(rad,j);
                double cos1=cos/fact(j);
               int cosTermIndex = (j) / 2;
                if(cosTermIndex % 2 == 1)
                    cos1 *= -1;

                sum1 += cos1;
                i+=2;
                j+=2;
            }
            double tan=sum/sum1;
            double actual=Math.tan(rad);
            System.out.print("Actual: "+tan+" library func: "+actual+"\n");
        }
    }
    public static void main(String[] args){
        Scanner S=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=S.nextInt();
        calc2 obj=new calc2();
        obj.calc2(n);
    }
}