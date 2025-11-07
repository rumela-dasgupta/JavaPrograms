package mypackage;

public class Mysum {
    // Method to find sum of first n numbers
    public int sum1(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }
}
