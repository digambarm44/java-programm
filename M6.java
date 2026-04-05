class M6
{
	public static void main(String[] args) 
	{
		even(22656587);
	}
	public static void even(int num)
	{
		while(num!=0){
			int rem=num%10;
			if(rem%2==0){
			System.out.println(rem+" Even");
		}else{
			System.out.println(rem+" Odd");
		}
		num/=10;
			
		}
		
}
}
