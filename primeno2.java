import java.util.Scanner;
public class primeno2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two no. in b/w... ");
        int a= s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(isprime(i)) System.out.println(i+ " is a prime no.");
            else System.out.println(i+ " ia not a prime no.");
        }    
    }

    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
