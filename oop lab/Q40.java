public class Q40
	{
		public static void main(String args[])
    			{
        			int a = 0;
        			int b = 5;
        			try
					{
            					int c = b/a;
            					System.out.print("c = " + c);
        				}
        			catch(ArithmeticException e)
					{
            					System.out.println("division by 0 : ");
            					throw e;
        				}
    			}
	}