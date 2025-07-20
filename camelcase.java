import java.util.Scanner;

public class camelcase {
    static int camelCase(String s){
        int count=1;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(c>='A' && c<='Z'){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    System.out.println(camelCase(s));
    }
    
}
