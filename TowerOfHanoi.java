//hanoi algorithm:1)Only one disk can be moved at a time.
//2)You can only move the top disk from a rod.
//3)A bigger disk cannot be placed on top of a smaller disk.

import java.io.*;
import java.util.*;
public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi problem
    public static int solveHanoi(int n, char PEG1, char PEG2, char PEG3) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + PEG1 + " to " + PEG3);
            return 1;
        }
        int nd=0;

        // Move top n-1 disks from PEG1 to PEG2
        nd+=solveHanoi(n - 1, PEG1, PEG3, PEG2);

        // Move nth disk from PEG1 to PEG3
        System.out.println("Move disk " + n + " from " + PEG1 + " to " + PEG3);
        nd=nd+1;

        // Move n-1 disks from PEG2 to PEG3
        nd+=solveHanoi(n - 1, PEG2, PEG1, PEG3);
        return nd;
    }

    public static void main(String[] args) {
        int nd=0;
        int numberOfDisks; 
        System.out.print("Enter number of disks: ");
        Scanner S=new Scanner(System.in);
        numberOfDisks=S.nextInt();
        System.out.println("Tower of Hanoi solution for " + numberOfDisks + " disks:");
        nd=solveHanoi(numberOfDisks, 'A', 'B', 'C');
        System.out.println("Total number of movements taken to shift " + numberOfDisks + " disks is "+ nd);
    }
}

