import java.util.Scanner;
public class fibonacci{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter the no. ");
        int n=s.nextInt();
        System.out.println(fibonaccix(n));
    }
    public static int fibonaccix(int n){
        if(n<0){
            System.out.println("negative no.");
            return -1;
        }
        if(n==1||n==0) return n;
        return fibonaccix(n-1)+fibonaccix(n-2);

    }
}
    