import java.util.Scanner;

public class Trianglegame{
	static void trianglegame(float a,float b,float c)
	{
		if ((a+b)<c || (b+c)<a || (a+c)<b)
		{
			System.out.println("zero prize");
			
		}
		else if(a==b && b==c && c==a)
		{
			System.out.println("1st prize");
			
		}
		else if((a+b==c) || (a+c==b) || (b+c==a))
		{
			System.out.println("second prize");
			
		}
		else 
		{
			System.out.println("third prize");
			
		}
	}
	


	



	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first angle");
		float a=scan.nextFloat();
		System.out.println("enter the second angle");
		float b=scan.nextFloat();
		System.out.println("enter the third angle");
		float c=scan.nextFloat();
		trianglegame(a,b,c);
		
	}

}
