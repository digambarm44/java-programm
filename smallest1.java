class smallest1 
{
	public static void main(String[] args) 
	{
	  int n1=23;
	  int n2=24;
	  int n3=25;
	  int ans=n1<n2?(n1<n3?n1:n3):(n2<n3?n2:n3);
	  System.out.println(ans);
	}
}
