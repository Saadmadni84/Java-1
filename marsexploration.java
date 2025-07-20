import java.util.Scanner;

public class marsexploration {
    static int marsExploration(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='S'){
                count++;
            }
            i++;
            if(s.charAt(i)!='O'){
                count++;
            }
            i++;
            if(s.charAt(i)!='S'){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(marsExploration(s));
        }

    
}
