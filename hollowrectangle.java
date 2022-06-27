import java.util.Scanner;
public class hollowrectangle {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter length and breadth of rectangle: ");
        int l=s.nextInt();
        int b=s.nextInt();
        hrect(l,b);
    }
    public static void hrect(int l,int b){
        for(int i=1;i<=b;i++){
            for(int j=1;j<=l;j++){
                if(i==1 || i==b || j==1 ||j==l){
                    System.out.print("* ");
                }else System.out.print("  ");
            } 
            System.out.println(""); 
        }
    }
}
