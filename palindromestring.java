import java.util.Scanner;

public class palindromestring {
    static boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            
            j--;
            i++;

        }
        return true;
        
    }

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String s=scan.nextLine();
       System.out.println(isPalin(s));
    }
}
