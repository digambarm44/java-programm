import java.util.Scanner;
class power
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int num=sc.nextInt();
		int power=0;
		while(num>0)
		{
			int num=num%10;
			lastnum=num*power;
			num=lastnum/=10;
		}
		System.out.println("power is :"+lastnum);
	}
}
