import java.util.Scanner;
class digit
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the value:");
		char ch=sc.nextline().charAt(0);
		String op=(ch>='65'&&ch<='90')?(ch+"it is UPPERCASE"):(ch+"it is lower case");
		System.out.println(op);
	}
}
