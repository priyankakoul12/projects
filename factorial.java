class factorial
{
	public static void main(String args[])
	{
		int i,fact=1,n;
		n=Integer.parseInt(args[0]);
		for(i=1;i<=n;i++)
		{	
			fact=fact*i;
		}
		System.out.println("FACTORIAL OF "+n+ "IS:"+fact);
	}
}
		