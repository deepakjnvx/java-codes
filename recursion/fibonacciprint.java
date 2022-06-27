import java.util.Scanner;
public class fibonacciprint {
   public static void main(String[] args){
       Scanner s= new Scanner(System.in);
       int n= s.nextInt();
       System.out.print("0 ");
       for(int i=1;i<=n;i++){
           System.out.print(fib(i)+" ");
       }
    
   } 
   public static int fib(int n){
       if(n<0) return -1;
       if(n==1 || n==0) return n;
       return fib(n-1)+ fib(n-2);
   }
}
