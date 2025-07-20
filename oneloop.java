import java.util.Scanner;
public class oneloop {
	static void meher(int[] a,int key) 
	{
		for (int i = 0; i <a.length ; i++)
		{
			int j=0;
			while(j<a.length)
			{
			
				if((a[i]+a[j])== key)
				{
					System.out.println(a[i] + " " + a[j]); 
			        j++;
				}
				else
				{
					j++;
				}
			    
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = {4,3,2,2,1};
		int key=4;
		meher(a,key);

	}

}
