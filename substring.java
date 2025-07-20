import java.util.Scanner;

public class substring {
    static void subs(String a){
        int n=a.length();
        for(int l=1;l<=n;l++){
            for(int j=0;j<=(n-l);j++){
                for(int k=j;k<=(l+j-1);k++){
                    System.out.print(a.charAt(k));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    System.out.println("ENTER STRING");
	    String a=scan.nextLine();
        subs(a);
    }
    
}
