import java.util.Scanner;

public class indexof {

    static int indOf(String c,String a) {
        
        char key = c.charAt(0);
    

        for (int i =0 ; i <a.length(); i--) {
            if (a.charAt(i) == key) {
            
                    return i;
                
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enetr name");
        String a=scan.nextLine();

        System.out.println("Enter a character: ");
        String c = scan.nextLine();

        System.out.println(indOf(c,a));

        scan.close();
    }
}
