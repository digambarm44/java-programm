import java.util.Scanner;
class digit2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the value:");
		char ch=sc.next().charAt(0);
		String op=((ch>='0'&&ch<='9')?
		(ch+"it is digit"):
		(ch+"it is not digit"));
		System.out.println(op);
	}
}
