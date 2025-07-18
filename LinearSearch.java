import java.io.*;
import java.util.*;

public class LinearSearch {
    int[] a = new int[20];
    int n;
    int num;

    LinearSearch(int[] x, int m, int num1) {
        n = m;
        num = num1;
        for (int i = 0; i < n; i++) {
            a[i] = x[i];
        }
    }

    // Linear search method
    int linear_search_method() {
        for (int i = 0; i < n; i++) {
            if (num == a[i]) {
                return i; 
            }
        }
        return -1; 
    }

    
    public static void main(String[] args) throws IOException {
        int[] a = new int[20];
        int i, num, n, flag;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter size of the list [1-20]: ");
        n = S.nextInt();

        System.out.println("Enter " + n + " numbers one by one:");
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = S.nextInt();
        }

        System.out.print("Enter number to be searched: ");
        num = S.nextInt();

        LinearSearch LS = new LinearSearch(a, n, num);
        flag = LS.linear_search_method();

        if (flag != -1) {
            System.out.println(num + " found at index " + flag);
        } else {
            System.out.println(num + " not found");
        }

        S.close();
    }
}
