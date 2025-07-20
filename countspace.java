import java.util.Scanner;

public class countspace {
    static void counts(String s)
    {
        char key = ' ';
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==key){
                count++;
            }   

        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter sentence");
        String s=scan.nextLine();
        counts(s);


    }
        
    }
    

