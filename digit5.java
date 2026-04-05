import java.util.Scanner;
class digit5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("entre the value:");
		char ch=sc.next().charAt(0);
		String op=((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?(ch+"Alphabets"):(ch+"not character");
		((ch>='0'&&ch<='9')?(ch+"digit"):(ch+"not digit"));
		System.out.println(op);
		
	}
}
