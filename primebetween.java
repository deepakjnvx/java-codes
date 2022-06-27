import java.util.Scanner;
public class primebetween {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            isPrime(i);
        }  
    }
    public static void isPrime(int n){
        boolean flag=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(n+" is not a primr no.");
                flag=true;
                return;
            }

        }
        if(flag==false){
            System.out.println(n+" is a prime no.");
            return;
        }
    }
}

