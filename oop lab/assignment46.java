class eventhread implements Runnable
	{
    		Thread t;
    		eventhread()
			{
        			t = new Thread(this,"eventhread");
        			t.start();
    			}
    		static int evensum = 0;
    		public void run() 
			{
        			for(int i = 0;i <= 1000;i=i+2)
					{
            					evensum = evensum + i;
        				}
    			}
	}
class singlethread implements Runnable
	{
    		Thread t;
    		singlethread()
			{
        			t = new Thread(this,"singlethread");
        			t.start();
    			}
    		static int singlesum = 0;
    		public void run() 
			{
        			for(int i = 0;i <= 1000;i++)
					{
	       					singlesum = singlesum + i;
					}
    			}
	} 
public class assignment46
	{
    		public static void main( String args[] )
    			{
	        		long start1 = System.nanoTime();
        			new eventhread();
       				int oddsum = 0;
        			for(int i = 1;i <= 1000;i=i+2)
					{
            					oddsum = oddsum + i;
        				}
        			long end1 = System.nanoTime();
			        long start2 = System.nanoTime();
			        singlethread single = new singlethread();
			        try
					{
            					single.t.sleep(1);
        				}
				catch(Exception e)
					{
            					e.printStackTrace();
        				}
        			long end2 = System.nanoTime();
        			System.out.println("Execution time for multiple threads is " + (end1 - start1) + " nanoseconds");
        			System.out.println("Execution time for single thread is " + (end2 - start2 - 1000000) + " nanoseconds");
    			}
	}