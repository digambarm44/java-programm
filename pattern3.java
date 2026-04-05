import java.util.Scanner;
class pattern3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value :");
		//int num=sc.nextInt();
		int n=4;
		for (int i=0;i<n ;i++ )
		{
			for(int j=0;j<n+i;j++){
				if(j>=n-i-1){
					System.out.print("*"+" ");
				}else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
