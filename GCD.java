import java.util.Scanner;
class GCD
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first digit :");
		int n1=sc.nextInt();
		System.out.println("Enter the second digit :");
		int n2=sc.nextInt();
		int small=n1<n2?n1:n2;
		while(true)
		{
			if(n1%small==0 && n2%small==0)
			{
				System.out.println("GDC is :"+small);
				break;
			}
			small--;
		}
	}
}
