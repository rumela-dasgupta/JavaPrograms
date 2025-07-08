//input n number of arbitary numbers and find the maximum and minimum value from it.

import java.io.*;
import java.util.*;
class ex6{
    public static void main(String args[])throws IOException{
        Scanner S=new Scanner(System.in);
        int n,x;
        List<Integer> nums=new ArrayList<>();
        System.out.print("How many numbers to input? ");
        n=S.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Number "+(i+1)+": ");
            x=S.nextInt();
            nums.add(x);
        }
        System.out.println("The numbers you have inputted: "+nums);
        int max=nums.get(0);
        int min=nums.get(0);
        for(int i:nums){
            if(i>max){
                max=i;
            }
            if(i<min){
               min=i;
            }
        
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);

    }
}