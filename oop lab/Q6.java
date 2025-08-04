class ScopeExample 
{

    public static void main(String[] args) 
{
        int outerVariable = 10;
        
        System.out.println("Outer Variable: " + outerVariable);
        {
            int innerVariable = 20; // Variable declared in the inner scope
            
            System.out.println("Inner Variable: " + innerVariable);
            System.out.println("Accessing Outer Variable from Inner Block: " + outerVariable);
        }

        // System.out.println("Accessing Inner Variable from Outer Block: " + innerVariable);
        
        System.out.println("Accessing Outer Variable from Outer Block: " + outerVariable);
    }
}
