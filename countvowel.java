import java.util.Scanner;

public class countvowel {
    static void countVo(String s){
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='A' || c=='E'||c=='I'||c=='O'||c=='U' || c=='a' || c=='e'||c=='i'||c=='o'||c=='u' ){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        String s=scan.nextLine();
        countVo(s);
        
    }
    
}
