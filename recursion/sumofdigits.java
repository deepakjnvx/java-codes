import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number. ");
        int n=s.nextInt();
        System.out.println("sum of digits of given nmber: "+sumdigits(n));
    }

    public static int sumdigits (int n){
        if(n<10){
            System.out.print(n+" + ");
            return n;
        }
        int lastdigit=n%10;

        int presum= lastdigit+sumdigits(n/10);
        if(n>10){
            System.out.print(lastdigit+" + ");
        }else System.out.print(lastdigit+" = ");
        return presum;

    }
}
