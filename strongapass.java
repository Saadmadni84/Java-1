import java.util.Scanner;
public class strongapass {
    static int minimumNumber(int n, String password){
        int di=1;int lc=1; int up=1; int sc=1;
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(c>='0' && c<='9'){
                di=0;
            }
            else if(c>='a' && c<='z'){
                lc=0;
            }
            else if(c>='A' && c<='Z'){
                up=0;
            }
            else {
                sc=0;
            }

        }
        if((di+up+lc+sc)>6-n){
            return (di+up+lc+sc);
        }
        else{
            return (6-n);
        }

        }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        scan.nextLine();
	    String password=scan.nextLine();
        System.out.println(minimumNumber(n, password));
    }
}
