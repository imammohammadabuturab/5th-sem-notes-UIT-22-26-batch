class que14
{
	public static void main(String[] args)
	{
		int marks=78;
		String status;
		int a=marks/10;
		switch(a)
			{
				case 10 :status="A+";
					break;
				case 9 :status="A";
					break;
				case 8 :status="B+";
					break;
				case 7 :status="B";
					break;
				case 6 :status="C+";
					break;
				case 5 :status="C";
					break;
				case 4 :status="D";
					break;
				default :status="Failed";
			}
			System.out.println(status);
	}
}