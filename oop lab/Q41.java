public class Q41
	{
    		static void throwdemo() throws IllegalAccessException
			{
        			System.out.println("inside throwdemo");
        			throw new IllegalAccessException("demo");
    			}
    		public static void main(String args[])
   	 		{   
        			try
					{
            					throwdemo();
        				}
        	catch(IllegalAccessException e)
			{
            			System.out.println("caught " + e);
        		}
    	}
}