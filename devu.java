import java.util.Scanner;

class Sorting{

}
class devu{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int[] d = new int[n];
for (int i = 0; i < d.length; i++) {
d[i] = scan.nextInt();
}
sr.bubblesort(d);
int count = 0;
for (int i = 0; i < d.length-1; i++) {
if(d[i] != d[i+1]) {
count++;
}
}
System.out.println(count+1);
}
}