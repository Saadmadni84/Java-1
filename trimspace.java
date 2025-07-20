import java.util.Scanner;

public class trimspace {
    static void trimSpace(String s)
    {
        char key = ' ';
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==key){
                continue;
            }
            else{
                System.out.print(s.charAt(i));
            }

        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter sentence");
        String s=scan.nextLine();
        trimSpace(s);


    }

}
