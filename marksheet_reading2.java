// write a program to create a data file called as "marksheet_1.csv" which contain the following:
//header_line: roll,Paper1,Paper2,Paper3,Total,Average,Grade
//Add approx 10 records in it
import java.io.*;
import java.util.*;
public class marksheet_reading{
    public static void main(String[] args)throws IOException{
        String grade,file1;
        file1="Marksheet_1.csv";
        String record=""; //record=1 complete record/line
        BufferedReader fp1=new BufferedReader(new FileReader(file1));
        String header_1;
        header_1=fp1.readLine();
        System.out.println((header_1)+"\n");
        String values[];
        int n=0;
        while((record=fp1.readLine())!=null){
            System.out.println(record);
            values=record.split(",");
            int roll=int(values[0]);
            int p1=int(values[1]);
            int p2=int(values[2]);
            int p3=int(values[3]);
            int total=int(values[4]);
            int av=int(values[5]);
            n=n+1;

        }
        fp1.close();
        System.out.println("Total number of records found in "+file1+"="+String.valueOf(n));
        System.out.println(file1+" Created Succesfully");
    
}
}