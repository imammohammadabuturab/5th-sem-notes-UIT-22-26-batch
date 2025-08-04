//assignment 43 - java program to show that higher priority threads getting more cpu time than lower priority thread
class counter implements Runnable
	{
    		int count = 0;
    		Thread t;
    		private volatile boolean running = true;
    		public counter(int p)
			{
        			t = new Thread(this);
        			t.setPriority(p);
    			}
		public void run()
			{
        			while (running)
					{
            					count++;
        				}
    			}
		public void stop()
			{
        			running = false;
    			}
		public void start()
			{
        			t.start();
    			}
	}
public class assignment43
	{
    		public static void main( String args[] )
    			{
        			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        			counter hi = new counter(Thread.NORM_PRIORITY + 3);
        			counter lo = new counter(Thread.NORM_PRIORITY - 3);
        			lo.start();
        			hi.start();
        			try
					{
            					Thread.sleep(1000);
				        }
				catch(InterruptedException e)
					{
            					System.out.println("Main thread interrupted.");
        				}
        			lo.stop();
        			hi.stop();
        			System.out.println("Low-priority thread: " + lo.count); 
        			System.out.println("High-priority thread: " + hi.count);
    			}
	}