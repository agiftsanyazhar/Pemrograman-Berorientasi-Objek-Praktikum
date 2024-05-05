package pkg152011513020aaprak11a1;

// Non Static
public class Problem {
    String s;
    
    class Inner {
        void testMethod() {
            s   = "Set from Inner";
            
            System.out.println(s);
        }
    }
    
}