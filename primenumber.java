import java.util.Scanner;


public class primenumber {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=s.nextInt();
    boolean flag=false;
    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            System.out.println("not a prime no.");
            flag=true;
        }
    }
    if(flag==false){
        System.out.println("prime no.");
    }
    }
}
