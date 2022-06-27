import java.util.Scanner;

public class toh {

    public static void tohd(char s, char d,char h, int n){
        if(n==0) return;
        tohd(s,h,d,n-1);
        System.out.println("move disc "+ n +" from "+s+ " to "+ d);
        tohd(h,d,s,n-1);
    }
    public static void main(String [] args){

        Scanner s= new Scanner(System.in);
        System.out.println("enter the no. of blocks ");
        int n= s.nextInt();
        tohd('s','d','h',n);
    }
}