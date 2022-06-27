import java.util.Scanner;
public class palindrome {
    public static void main(String [] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enetr the string");
        String sr=s.nextLine();
        boolean flag=true;
        int n=sr.length();
        for(int i=0;i<n/2;i++){
            int a=(int)sr.charAt(i);
            int b=(int)sr.charAt(n-1-i);
            if(a-b!=0){
                System.out.println(sr+" is not a palindrome.");
                flag=false;
                break;
            }
        }
        if(flag==true) System.out.println(sr+" is a palindrome."); 
    }
//     String original, reverse = ""; // Objects of String class  
//     Scanner in = new Scanner(System.in);   
//     System.out.println("Enter a string/number to check if it is a palindrome");  
//     original = in.nextLine();   
//     int length = original.length();   
//     for ( int i = length - 1; i >= 0; i-- )  
//        reverse = reverse + original.charAt(i);  
//     if (original.equals(reverse))  
//        System.out.println("Entered string/number is a palindrome.");  
//     else  
//        System.out.println("Entered string/number isn't a palindrome.");   
//  } 
}
