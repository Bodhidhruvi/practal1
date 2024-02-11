import java.util.Scanner;
public class sumavg
{
	public static void main (String []args)
	{
		float a,b,c,sum=0,avg=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the value of a ::");
		a=sc.nextFloat();
		System.out.print("Enter the value of b ::");
		b=sc.nextFloat();
		System.out.print("Enter the value of c ::");
		c=sc.nextFloat();
		sum=a+b+c;
		avg=sum/3;

		System.out.println("sum is ::"+sum);
		System.out.println("average is ::"+avg);
		}			
}
