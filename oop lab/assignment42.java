class eventhread implements Runnable
	{
    		Thread t;
    		eventhread()
			{
        			t = new Thread(this,"eventhread");
        			t.start();
    			}
    		static int evensum = 0;
    		static int oddsum = 0;
    		public void run() 
			{
        			try
					{
            					for(int i = 0;i <= 1000;i = i + 2)
							{
                						evensum = evensum + i;
                						System.out.print("\neventhread : " + (evensum-i) + " + " + i + " = " + evensum);
                						Thread.sleep(2);
            						}
        				}
				catch(InterruptedException e)
					{
            					System.out.print("\neventhread interrupted");
        				}
        			System.out.print("\nexiting eventhread");
        			System.out.print("\ntotal sum = " + (evensum + oddsum));  
    			}
	} 
public class assignment42
	{
    		public static void main( String args[] )
    			{
        			new eventhread();
        			try
					{
            					for(int i = 1;i <= 1000;i = i + 2)
						{
                					eventhread.oddsum = eventhread.oddsum + i;
                					System.out.print("\noddthread : " + (eventhread.oddsum-i) + " + " + i + " = " + eventhread.oddsum);
                					Thread.sleep(1);
            					}
        				}
				catch(InterruptedException e)
					{
            					System.out.print("\noddthread interrupted");
        				}
        			System.out.print("\nexiting oddthread");
          		}
	}