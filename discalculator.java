import java.util.Scanner;

public class discalculator {
	float discalculator(float i,float s,float t,float n)
	{
		float d1=0.0f;
		float d2=0.0f;
		d1=(i*(7.0f/100)+s*(3.0f/100)+t*(2.0f/100)+n*(1.0f/100));
		float sum=i+s+t+n;
		if (sum<=25000)
		{
			d2=0;
		}
		else if(sum>=25001 && sum<=50000)
		{
			d2=sum*(5.0f/100);
		}
		else if(sum>=25001 && sum<=50000)
		{
			d2=sum*(7.0f/100);
		}
		else
		{
			d2=sum*(10.0f/100);
		}
		if(d1>d2)
		{
			return d1;
		}
		else
		{
			return d2;
		}
	
	
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the amount of iron to buy");
		float i=scan.nextFloat();
		System.out.println("enter the amount of steel to buy");
		float s=scan.nextFloat();
		System.out.println("enter the amount of tungstan to buy");
		float t=scan.nextFloat();
		System.out.println("enter the amount of nickel to buy");
		float n=scan.nextFloat();
		discalculator d=new discalculator();
		System.out.println(d.discalculator(i,s,t,n));

	}

}
