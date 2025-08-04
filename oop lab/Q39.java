public class Q39
	{
    		public static void main(String args[])
    			{
 				int a = 20;
        			int b = 5;
        			int arr[] = new int[5];
        			try
					{
            					int c = b/a;
            					System.out.println("c = " + c);
            					try
							{
                						arr[6] = 20;
                						System.out.println("arr[6] = " + arr[6]);
            						}
            					catch(ArrayIndexOutOfBoundsException e)
							{
                						System.out.println("the index you are trying to access is out of bounds : " + e);
            						}
        				}
        			catch(ArithmeticException e)
					{
            					System.out.println("arithmetic exception : division by 0" + e);
        				}
    			}
	}