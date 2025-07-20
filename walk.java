import java.util.Scanner;

public class walk {
	static void walkinrow(int[] a,int k)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=k)
			{
				count++;
			}
			else
				count=count+2;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("enter the height of fence");
		int k=scan.nextInt();
		
		walkinrow(a,k);
	}

}
