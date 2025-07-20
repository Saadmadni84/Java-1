
public class pattern6 {

	public static void main(String[] args) {
		int n=10;
		int k=1;
		for(int i=1;i<=9;i++)
		{
			
			if(i<6)
			{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
			}
			k=k+1;
			}
			else {
				for(int j=1;j<=n-i;j++)
				{
					System.out.print(n-i);
				}
				
			}
			System.out.println();

		}

	}

}
