class dorandom
{
	public static void main(String args[])
	{
		int i=0,count=0;
		double ans=0;
		while(ans<10)
		{
		double a=Math.random();
		System.out.println(a);
		ans=ans+a;
		i++;
		count++;
		}
	

	System.out.println("SUM OF RANDOM NUMBERS IS:"+ans);
	System.out.println("count is:"+count);
	}
}