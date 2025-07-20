import java.util.Scanner;

public class arraystrv {
    static String reverse(String s){
        char[] c=s.toCharArray();
        int i=0; int j=c.length-1; //no bracket because in array length is varaible not method
        while(i<j){
            char temp=c[i];
            c[i]=c[j];
            c[j]= temp;
            i++;
            j--;
        }
        return new String(c);
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s = scan.nextLine();
        s=reverse(s);
        System.out.println(s);
        
    }
}
