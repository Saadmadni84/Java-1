import java.util.Scanner;

public class commanstring {
    public static final String YES = null;
    public static final String NO = null;
    public static String twoStrings(String s1, String s2) {
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    return "YES";
                }
            }
        }
        return "NO";

    }
      public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        System.out.println(twoStrings(s1,s2));

        
      }
    
}
