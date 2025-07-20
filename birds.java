import java.util.Scanner;

public class birds {
	static int migbirds(int[] a)
	{
		int [] bird=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			bird[a[i]]++;
		}
		int maxindex=0, max=0;
		for (int i = 1; i < bird.length; i++)
		{
			if(max<bird[i])
			{
				max=bird[i];
				maxindex=i;
			}
		}
		return maxindex;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
		a[i] = scan.nextInt();
		}
		System.out.println(migbirds(a));
		

	}

}
