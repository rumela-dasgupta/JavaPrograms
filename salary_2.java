import java.io.*;
public class salary_2 {
    public static void main(String[] args) throws IOException {
        Object[][] salary = {{"E01","Abc",60000},{"E02","bcd",40000},{"E03","efg",50000},{"E04","hig",90000},{"E05","klm",44000},{"E06","opq",60000},{"E07","mnc",50500},{"E08","vbn",70000},{"E09","tyo",65000},{"E10","Amc",77000}};
        String file1 = "salary_1.csv";
        FileWriter fp2 = new FileWriter(file1);
        String header_1 = "ecode,name\t,basic_pay,da\t,hra\t,medical,gross_pay\t,pf\t,net_pay\n";
        fp2.append(header_1);
        System.out.print(header_1);
        int total1=0, total2=0, total3=0, total4=0, total5=0, total6=0, total7=0;
        for (int i = 0; i < salary.length; i++) {
            String ecode = (String) salary[i][0];
            String name = (String) salary[i][1];
            int basic_pay = (int) salary[i][2];
            int da = (10 * basic_pay) / 100;
            int hra = (15 * basic_pay) / 100;
            int medical = (5 * basic_pay) / 100;
            if (hra >= 10000)
                hra = 10000;
            if (medical >= 5000)
                medical = 5000;
            int gross_pay = basic_pay + da + hra + medical;
            int pf = (int) ((8.3 * (basic_pay + da)) / 100);
            int net_pay = gross_pay - pf;
            String record = ecode + "," + name + "," + basic_pay + "," + da + "," + hra + "," + medical + "," + gross_pay + "," + pf + "," + net_pay + "\n";
            fp2.append(record);
            System.out.printf("%-5s\t%-5s\t%7d\t%6d\t%6d\t%7d\t%8d\t%6d\t%8d\n",
                    ecode, name, basic_pay, da, hra, medical, gross_pay, pf, net_pay);
            total1 += basic_pay;
            total2 += da;
            total3 += hra;
            total4 += medical;
            total5 += gross_pay;
            total6 += pf;
            total7 += net_pay;
        }

        System.out.println("\n");
        System.out.printf("TOTALS\t\t%7d\t%6d\t%6d\t%7d\t%8d\t%6d\t%8d\n",
                total1, total2, total3, total4, total5, total6, total7);

        fp2.close();
        System.out.println("\n" + file1 + " Created Successfully");
    }
}
