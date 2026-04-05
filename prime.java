class M5 
{
	public static void main(String[]args)
	{
		int num=5;
	    int den=1;
		while (num>den)
		
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
			if (num==den)
			{
				System.out.println("prime number");
			}
				else
			{
					System.out.println("not prime number");
		}
}
}
