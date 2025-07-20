
public class string1 {
	static int spaceg(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
				
		}
		return count;
	}
	public static void main(String[] args) {
		String s="how are you";
		System.out.println(spaceg(s));

	}

}



