import java.io.*;
import java.util.*;
class ex7{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int roll,total;
        while(true){
            System.out.print("Enter roll number (0 to 100): ");
            roll=S.nextInt();
            if(roll>=0 && roll<=100){
                break;
            }
            else{
                System.out.println("Invalid roll number!");
            }
        }
        while(true){
            System.out.print("Enter total marks (1 to 100): ");
            total=S.nextInt();
            if(total>=1 && total<=100){
                break;
            }
            else{
                System.out.println("Invalid total marks!");
            }
    }
    char div='0';
    if(total>=60){
        div='1';
    }
    else if (total>=50 && total<60){
        div='2';
    }
    else if(total>=40 && total<50){
        div='3';
    }
    else if(total<40){
        div='F';
    }
    System.out.println("**Details**"+"\n"+"Roll: "+roll+"\n"+"Total: "+total+"\n"+"Division: "+div);
}
}