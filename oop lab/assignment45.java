public class assignment45
	{  
    		public static void main(String[] args)
			{  
        			final String resource1 = "a";  
        			final String resource2 = "b";    
        			Thread t1 = new Thread()
					{  
            					public void run()
							{  
                						synchronized(resource1)
									{  
                    								System.out.println("Thread 1: locked resource 1");  
                    								try
											{ 
                        									Thread.sleep(100);
                    									}
										catch(Exception e)
											{
											}  
                    								System.out.println("Thread 1: waiting for resource 2");  
                    								synchronized(resource2)
											{  
                        									System.out.println("Thread 1: locked resource 2");  
                    									}  
                							}  
            						}  
        				};  
        			Thread t2 = new Thread()
					{  
            					public void run()
							{  
                						synchronized(resource2)
									{  
                    								System.out.println("Thread 2: locked resource 2");    
                    								try
											{ 
                        									Thread.sleep(100);
                    									}
										catch(Exception e)
											{
											}  
                    								System.out.println("Thread 2: waiting for resource 1");  
                    								synchronized(resource1)
											{  
                        									System.out.println("Thread 2: locked resource 1");  
                   		 							}
							                }  
            						}  
        				};    
        			t1.start();  
        			t2.start();  
    			}  
	}