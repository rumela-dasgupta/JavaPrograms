/* write a program to input ecode,name,basic_pay of 'n' employees where n<=10
calculate the following:
i)da=10% of basic basic_pay
ii) hra=15%of basic_pay
iii)medical=5% of basic_pay
iv)gross_pay=basic_pay+da+hra+medical
v)pf=8.3% pf (basic_pay+da)
vi)net_pay=gross-pf
choose filename=salary_1.csv */
import java.io.*;
import java.util.*;
public class salary_1{
    public static void main(String[] args)throws IOException{
        Object[][] salary={{501,"Abc",60000},{502,"bcd",40000},{503,"efg",50000},{504,"hig",90000},{505,"klm",44000},{506,"opq",60000},{507,"mnc",50500},{508,"vbn",70000},{509,"tyo",65000},{510,"Amc",77000}};
        int i,n,da,hra,medical,gross_pay,pf,net_pay,ecode,basic_pay;
        String name;
        file1="salary_1.csv";
        String record="";
        FileWriter fp2=new FileWriter(file1);
        String header_1="ecode,name,basic_pay,da,hra,medical,gross_pay,pf,net_pay,\n";
        fp2.append(header_1);
        n=10;
        for(i=0;i<n;i++){
            ecode=(int)salary[i][0];
            name=(String)salary[i][1];
            basic_pay=(int)salary[i][2];
            da=(10*basic_pay)/100;
            hra=(15*basic_pay)/100;
            medical=(5*basic_pay)/100;
            gross_pay=basic_pay
            av=total/3;
    }
}