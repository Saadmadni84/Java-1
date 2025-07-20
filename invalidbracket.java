import java.util.Scanner;

public class invalidbracket {
    static int invalid(String s){
        int count=0;
        int bracket=0;
        char key='{';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==key){
                bracket++;
            }
            else {
                if(bracket<=0){
                    count++;
                }
                else{
                    bracket--;
                }
            }
       
        }
        return (count+bracket);
        
    }
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    System.out.println(invalid(s));
}
}
