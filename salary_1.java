import java.io.*;
import java.util.*;
public class salary_1{
    public static void main(String[] args)throws IOException{
        Object[][] salary={{"E01","Abc",60000},{"E02","bcd",40000},{"E03","efg",50000},{"E04","hig",90000},{"E05","klm",44000},{"E06","opq",60000},{"E07","mnc",50500},{"E08","vbn",70000},{"E09","tyo",65000},{"E10","Amc",77000}};
        int i,n,da,hra=0,medical=0,gross_pay,pf,net_pay,basic_pay;
        String name,file1,ecode;
        file1="salary_1.csv";
        String record="";
        FileWriter fp2=new FileWriter(file1);
        String header_1="ecode,name,basic_pay,da,hra,medical,gross_pay,pf,net_pay\n";
        fp2.append(header_1+"\n");
        n=10;
		System.out.print(header_1);
        for(i=0;i<n;i++){
            ecode=(String)salary[i][0];
            name=(String)salary[i][1];
            basic_pay=(int)salary[i][2];
            da=(10*basic_pay)/100;
            hra=(15*basic_pay)/100;
            medical=(5*basic_pay)/100;
            gross_pay=basic_pay+da+hra+medical;
			pf=(int)((8.3*(basic_pay+da))/100);
			net_pay=gross_pay-pf;
			if(hra>=10000)
				hra=10000;
			if(medical<=5000)
				medical=5000;
			record=String.valueOf(ecode)+","+"\t"+String.valueOf(name)+","+"\t"+String.valueOf(basic_pay)+","+"\t";
            record=record+String.valueOf(da)+","+"\t";
            record=record+String.valueOf(hra)+","+"\t";
            record=record+String.valueOf(medical)+","+"\t";
            record=record+String.valueOf(gross_pay)+","+"\t";
			record=record+String.valueOf(pf)+","+"\t";
            record=record+net_pay+"\n";
            fp2.append(record);
            System.out.print(record);

            
        }
		
        fp2.close();
        System.out.println(file1+" Created Succesfully");
    }
}