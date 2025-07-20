import java.util.Scanner;

public class reversestring {
    static void reverse(String s){
        for(int i=s.length()-1;i>=0;i--)
        {
            System.err.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String s=scan.nextLine();
       reverse(s); 
    }
}
