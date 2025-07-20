import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][][] a = new int[2][3][5];
				
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					
						System.out.println("enter the ages school " + i + " class " + j + " student " + k);
						a[i][j][k]=scan.nextInt();
				}
			}	
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					
						System.out.println(a[i][j][k]);
						
				}
			}	
		}
		

	}

}
