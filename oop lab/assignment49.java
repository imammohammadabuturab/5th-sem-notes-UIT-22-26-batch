import java.util.Stack;
public class assignment49
	{
    		public static void main( String args[] )
    			{    
        			Stack<Integer> s1 = new Stack<>();
        			s1.push(10);
				s1.push(20);
				s1.push(30);
        			s1.push(40);
				System.out.println("stack1 after pushing 10, 20, 30 and 40 :\n" + s1);
				s1.pop();
				System.out.println("stack1 after pop :\n" + s1);
				System.out.println("20 in stack1 is present in index :\n" + s1.search(20));
        			System.out.println("is stack1 empty :\n" + s1.empty());
        			Stack<String> s2 = new Stack<>();
				s2.push("hello");
				s2.push("world");
        			s2.push("java");
				System.out.println("\nstack2 after pushing 3 elements :\n" + s2);
				System.out.println("stack2 top :\n" + s2.peek());
        			s2.pop();
        			s2.pop();
				System.out.println("stack2 after pop twice :\n" + s2);
				s2.pop();
				System.out.println("stack2 after pop again :\n" + s2);
				s2.push("exiting");
        			System.out.println("stack2 after pushing 1 element :\n" + s2);
    			}
	}