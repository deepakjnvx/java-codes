import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n =s.nextInt();
        int [] array=new int[n];
        System.out.println("enter the array elements: ");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        
        insertionsort(array,n);
    }
    public static void insertionsort(int[] array,int n){
        for(int i=1;i<n;i++){
            int current = array[i];
            int j=i-1;
            while(array[j]>current && j>=0){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
