import java.util.Scanner;

public class arraysumofallsubarrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = s.nextInt();
        System.out.println("enter the array elements: ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        sumsubarray(a, n);

    }

    public static void sumsubarray(int[] a, int n) {
        int k=1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                System.out.println("subarray no. "+(k++)+" : "+sum);
            }
        }
    }
}
