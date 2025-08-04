import java.io.*;
public class assignment47
	{
    		public static void main( String args[] ) throws IOException
    			{
        			char c;
        			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        			System.out.println("Enter characters, '!' to quit.");
        			do
					{
            					c = (char)br.read();
            					System.out.print(c);
        				}
				while(c != '!');
    			}
	}