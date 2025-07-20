import java.util.Scanner;

public class uppercasecon {
	static void upper(String a)
	{
		String t="";
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c>='a' && c<='z')
			{
				t=t+(char)(c-32);

			}
			else
			{
				t=t+c;
			}
			
		}
		System.out.println(t);
		
	}
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("eneter number");
	    String a=scan.nextLine();
	    upper(a);
	    scan.close();
	}

}
