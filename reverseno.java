import java.util.Scanner;
class reverseno
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		int num=sc.nextInt();
		int rev=0;
		while(num>0){
			int lastnum=num%10;//no extract hoga idhar
			rev=rev*10+lastnum;//no reverse hoga
			num=num/10;//upadte hogi condititon
		}
		System.out.println("reverseno no is : "+rev);// print hoga reverse no
	}
}
