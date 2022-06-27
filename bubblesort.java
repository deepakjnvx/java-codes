import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = s.nextInt();
        int[] array = new int[n];
        System.out.print("enter the array elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = s.nextInt();
        }
        
        bubblesort(array, n);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void bubblesort(int[] array, int n) {
        // System.out.println("hii");
        int counter = 1;
        while (counter < n) {
            for (int i = 0; i < n - counter; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
            counter++;
        }

    }
}
