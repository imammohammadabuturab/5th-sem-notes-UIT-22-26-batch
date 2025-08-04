class que12
{
	public static void main(String[] args)
	{
		int pass=33;
		int marks=58;
		String status;
		if(marks>pass)
		{
			if(marks>70)status="keep going";
			else status="you can do better";
		}
		else
		{
			status="fail";
		}
		System.out.println(status);
	}
}