class M4 
{
	public static void main(String[] args) 
	{
		
		factorial(10);
		factorial(7);
		adding(20,34);
		
	}
	public static void factorial(int num)
	{
		int fact=1;
		while (num>1)
		{
			fact=fact*num;
			num--;
		}
		System.out.println(fact);
}
        public static void adding(int n1,int n2)
	{
			System.out.println(n1+n2);
	}
 }
