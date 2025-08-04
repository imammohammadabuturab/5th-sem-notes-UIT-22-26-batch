import java.io.*;
public class assignment48
	{
    		public static void main( String args[] ) throws IOException
    			{   
        			File copyfile,pastefile;
        			BufferedReader br = null;
        			BufferedWriter bw = null;
        			try
					{          
            					File f1 = new File("D:\\oop lab\\assignment48copy.txt");
            					String copypath = f1.getPath();
            					copyfile = new File(copypath);
            					System.out.println("copying from : " + copypath);
            					br = new BufferedReader(new FileReader(copyfile));   
        				}
				catch(Exception e)
					{ 
            					System.err.println(e.getMessage()); 
        				}
        			try
					{ 
            					File f2 = new File("D:\\oop lab\\assignment48paste.txt");
            					String pastepath = f2.getPath();
            					pastefile = new File(pastepath);
            					System.out.println("pasting into : " + pastepath);
            					bw = new BufferedWriter(new FileWriter(pastefile));     
        				}
				catch(Exception e)
					{ 
            					e.printStackTrace();
        				}
        			try
					{
            					int c;
            					System.out.println("the data copied and pasted is : ");
            					while((c = br.read()) != -1)
							{
                						System.out.print((char)c);
                						bw.write(c);
            						}
        				}
				catch(IOException e)
					{
            					e.printStackTrace();
        				}   
        			finally
					{
            					try
							{
                						br.close();
                						bw.close();
            						}
						catch(IOException e)
							{
                						e.printStackTrace();
            						}
        				}
			}    
	}