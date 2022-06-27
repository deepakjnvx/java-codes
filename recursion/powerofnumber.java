import java.util.Scanner;
public class powerofnumber {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter a nuber and its power: ");
        int x=s.nextInt();
        int p=s.nextInt();
        System.out.println(power(x,p));
    }

    public static int power(int x,int p){
        if(x==0){
            System.out.println("invalid operation");
            return -1;
        }
        if(p==0) return 1;
        return x*power(x,p-1);
    }
}
