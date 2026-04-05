import java.util.Scanner;
class ReadData
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the first name");
		int n1=sc.nextInt();
		System.out.println("entre the second name");
		int n2=sc.nextInt();
		int ans=n1+n2;
		System.out.println("the sum of "+n1+"and"+n2+"is"+ans);
	}
}
