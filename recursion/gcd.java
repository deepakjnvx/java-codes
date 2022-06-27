import java.util.Scanner;

public class gcd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers to calculate GCD...");
        int x = s.nextInt();
        int y = s.nextInt();
        gcd(x, y);
        // System.out.println(gcd(x,y));34
    }

    public static void gcd(int m, int n) {

        int p = m % n;
        if (p == 0)
            System.out.println("gcd of given numbers is " + n);
        else {
            gcd(n, p);
            // System.out.println("hello"); here hello will print every time when root
            // functions return something
        }

    }

    // public static int gcd(int m,int n){
    // if(n==0) return m;
    // return gcd(n,m%n);
    // }
}
