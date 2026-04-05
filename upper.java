import java.util.Scanner;
class upper
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the character:");
		char ch=sc.next().charAt(0);
		String op=((ch>='A'&&ch<='Z')||(ch>='a'&&ch'z')?
			        (ch+"it is UPPERCASE"):
		             (ch+"it is lowercase"));
		System.out.println(op);
	}
}
