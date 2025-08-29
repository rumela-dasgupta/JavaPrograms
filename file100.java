/*Displays a menu for the user with two options:
1.Analyze a file
2.Exit the program
when the user selects Analyze a File,it:
Takes the file name as input.
Reads the file line by lineCounts:
Number of lineCountsNumber of characters(excludibg newlines)
number of words,vowels,consonants,digits,special characters */

import java.io.*;
import java.util.*;
public class file100{
    public static void main(String[] args){
        Scanner SC==new Scanner(System.in);
        int choice;
        do{
            System.out.println("=====FILE ANALYZER MENU====");
            System.out.println("\n1.Analyze a file\n2.exit");
            System.out.println("Enter your choice");
            choice=SC.nextInt?();
            SC.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter the file name with extension");
                    String filename=SC.nextLine();
                    analyzefile(filename);
                    break;
                case 2:
                    System.out.print("Exiting..");
                    break;
                default:
                    System.out.println("Invalid choice");
            }while(choice!=2);
        }
    }
    public static void analyzefile(String filename){

    }
    //complete the rest from mail
}
