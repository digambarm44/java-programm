import java.util.Scanner;
class large
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n1=sc.nextInt();
		System.out.println("Enter the number :");
		int n2=sc.nextInt();
		System.out.println("Enter the number :");
		int n3=sc.nextInt();
		int large=n1>n2?(n1>n3?n1:n3):n2>n3?n1:n3;
		while(true)
		{
			if(n1%large==0 && n2%large==0 && n3%large==0)
	     System.out.println(large);
			break;
		}
		large++;
		
		
	}
}
