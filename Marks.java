import java.util.Scanner;
public class Marks{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int[] marks=new int[5];
        int sum=0;
        System.out.println("enter marks of 5 subjects(out of 100):");
        for(int i=0;i<5;i++){
            System.out.print("subject"+(i+1)+":");
            marks[i]=scanner.nextInt();
            sum+=marks[i];
        }
        int max=marks[0];
        int min=marks[0];
        for(int i=1;i<5;i++){
            if(marks[i]>max) max=marks[i];
            if(marks[i]<min) min=marks[i];

        }
        double percentage=((double)sum/500)*100;
        double cgpa=percentage/9.5;
        String grade;
        if(percentage>90)
        grade="A+";
        else if(percentage>=80)
        grade="A";
        else if(percentage>=70)
        grade="B";
        else if(percentage>=60)
        grade="C";
        else if(percentage>=50)
        grade="D";
        else grade="F";
        System.out.println("\n---Result--");
        System.out.println("Maximum Marks:"+max);
        System.out.println("Minimum Marks:"+min);
        System.out.printf("Percentage:%.2f%%\n",percentage);
        System.out.printf("CGPA:%.2f\n",cgpa);
        System.out.println("grade: "+grade);
        scanner.close();
    }
}