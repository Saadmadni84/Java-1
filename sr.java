import java.util.Scanner;

public class sr {
	static void bubblesort(int[] ar)
	{
		int temp;
		for(int i=0;i<(ar.length)-1;i++)
		{
			for(int j=0;j<ar.length-1-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
		ar[i] = scan.nextInt();
		}
        bubblesort(ar);
        for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" "); 
		}
	}

}
