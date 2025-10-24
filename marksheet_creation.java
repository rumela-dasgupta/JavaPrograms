// write a program to create a data file called as "marksheet_1.csv" which contain the following:
//header_line: roll,Paper1,Paper2,Paper3,Total,Average,Grade
//Add approx 10 records in it
import java.io.*;
import java.util.*;
public class marksheet_creation{
    public static void main(String[] args)throws IOException{
        Object[][] marks={{501,"Abc",60,70,50},{502,"bcd",40,70,60},{503,"efg",50,60,40},{504,"hig",50,80,90},{505,"klm",40,90,80},{506,"opq",60,60,65},{507,"mnc",50,45,50},{508,"vbn",70,50,30},{509,"tyo",60,45,70},{510,"Amc",77,50,30}};
        int i,n,total,roll,p1,p2,p3,av;
        String grade,file1,name;
        file1="Marksheet_1.csv";
        String record=""; //record=1 complete record/line
        FileWriter fp2=new FileWriter(file1);//fp2=object for output file
        String header_1="Roll,Name,Paper1,Paper2,Paper3,Total,Average,Grade,\n";
        fp2.append(header_1);//Adding header_ in output csv file
        n=10;
        for(i=0;i<n;i++){
            roll=(int)marks[i][0];
            name=(String)marks[i][1];
            p1=(int)marks[i][2];
            p2=(int)marks[i][3];
            p3=(int)marks[i][4];
            total=p1+p2+p3;
            av=total/3;
            if(av>70)
                grade="A";
            else if(av>60)
                grade="B";
            else if(av>50)
                grade="C";
            else if(av>40)
                grade="D";
            else grade="F";
            record=String.valueOf(roll)+","+String.valueOf(name)+","+String.valueOf(p1)+",";
            record=record+String.valueOf(p2)+",";
            record=record+String.valueOf(p3)+",";
            record=record+String.valueOf(total)+",";
            record=record+String.valueOf(av)+",";
            record=record+grade+"\n";
            fp2.append(record);
            System.out.print(record);

            
        }
        fp2.close();
        System.out.println(file1+" Created Succesfully");
    }
}