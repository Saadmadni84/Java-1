import java.util.Scanner;

public class circularrotation {
	static void circ(int [] a,int k,int q)
	{
		int[] j=new int[a.length];
		for(int i=0;i<a.length;i++)
		{

			j[(i+k)%a.length]=a[i];
		}
		for(int i=0;i<q;i++)
		{
			System.out.println(j[i]);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int q=scan.nextInt();
		int[] a= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		circ( a , k, q);
	}

}


public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> q) {
    // Create a new list for the rotated array, initialized to the same size as the input
    List<Integer> j = new ArrayList<>(a.size());
    
    // Fill the list j with a default value (e.g., 0 or null)
    for (int i = 0; i < a.size(); i++) {
        j.add(0); // You can initialize with 0 or any default value.
    }

    // Perform the rotation
    for (int i = 0; i < a.size(); i++) {
        int newIndex = (i + k) % a.size(); // Calculate new index after rotation
        j.set(newIndex, a.get(i)); // Assign the value from a to the rotated position in j
    }

    // Answer the queries
    List<Integer> result = new ArrayList<>();
    for (int index : q) {
        result.add(j.get(index)); // Get the element at the queried index
    }

    return result;
}






