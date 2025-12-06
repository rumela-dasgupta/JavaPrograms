import java.util.*;

class TowerOfHanoip {

    // Recursive function
    void toh(int n, char from, char to, char aux) {
        if(n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move n-1 disks from 'from' to 'aux' using 'to'
        toh(n-1, from, aux, to);

        // Move the largest disk
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Move n-1 disks from 'aux' to 'to' using 'from'
        toh(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TowerOfHanoip obj = new TowerOfHanoip();

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        obj.toh(n, 'A', 'C', 'B');  
        // From A → To C → Auxiliary B
    }
}
