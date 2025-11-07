import java.io.*;
import java.util.*;
import mypackage.hcf_lcm_package;
public class hcf_lcm_package_main{
           public static void main(String[] args)throws IOException{
            int a,b;
            Scanner sc=new Scanner(System.in);
            hcf_lcm_package obj1=new hcf_lcm_package();
            System.out.println("Enter a:");
            a=sc.nextInt();
            System.out.println("Enter b:");
            b=sc.nextInt();
            int hcf_n=obj1.hcf(a,b);
            int lcm_n=obj1.lcm(a,b);
            System.out.println("hcf="+hcf_n);
            System.out.println("lcm="+lcm_n);

           }
}