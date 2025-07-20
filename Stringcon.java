import java.util.HashSet;
import java.util.Scanner;

public class Stringcon {
    public static int stringConstruction(String s){
        HashSet<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
             uniqueChars.add(s.charAt(i));
        }

        return uniqueChars.size();
       

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enetr name");
        String s=scan.nextLine();
        System.out.println(stringConstruction(s));

    }
    
}
