import java.util.Scanner;
public class decimaltobinary {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n =s.nextInt();
        System.out.print("binary equivalent of given number: ");
        dtb(n);
    }
    public static void dtb(int n){
        if(n>1) dtb(n/2);
        System.out.print(n%2);
    }
}
