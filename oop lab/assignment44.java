class buffer
	{
    		int count = 0;
    		synchronized void consume()
			{
        			if(count == 0)
					{  
            					try
							{
                						System.out.println("consuming -> buffer empty");
                						wait();
                					}
						catch(InterruptedException e)
							{
                						System.out.println("InterruptedException caught");
            						}
        				}
        			count--;
        			System.out.println("consuming -> total items in buffer : " + count);
        			notify();
    			}
    		synchronized void produce()
			{
        			if(count == 5)
					{
            					try
							{
            							System.out.println("Producing -> buffer full");
                						wait();
                
            						} 
						catch(InterruptedException e)
							{
                						System.out.println("InterruptedException caught");
            						}
        				}
        			count++;
        			System.out.println("Producing -> total items in buffer : " + count);
        			notify();
    			}
	}
class Producer implements Runnable
	{
    		private volatile boolean running = true;
    		buffer b;
    		Producer(buffer b)
			{
        			this.b = b;
        			new Thread(this, "Producer").start();
    			}
    		public void run()
			{
        			while (running)
					{
            					b.produce();
        				}
    			}
    		public void stop()
			{
        			running = false;
    			}
	}
class Consumer implements Runnable
	{
    		private volatile boolean running = true;
    		buffer b; 
    		Consumer(buffer b)
			{
        			this.b = b;
        			new Thread(this, "Consumer").start();
    			}
    		public void run()
			{
        			while (running)
					{
            					b.consume();
        				}
    			}
    		public void stop()
			{
        			running = false;
    			}
	}
class assignment44
	{
    		public static void main(String args[])
			{
        			buffer b = new buffer();
        			Producer p = new Producer(b);
        			Consumer c = new Consumer(b);
        			try
					{
            					Thread.sleep(50);
        				}
				catch(InterruptedException e)
					{
            					System.out.println("Main thread interrupted.");
        				}
        			p.stop();
        			c.stop();
    			}
	}