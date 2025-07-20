
public class pattern7 {

	public static void main(String[] args) {
		int n=5;
		int k=0;
		for(int i=1;i<=n;i++)
		{
			k=k+i;
			int l=k;
			for(int j=1;j<=i;j++)
			{
				if(j<i)
				
				    System.out.print(l-- + "*");
				else
					System.out.print(l-- + "");
					
			}
			
			System.out.println();

		}

	}

}
