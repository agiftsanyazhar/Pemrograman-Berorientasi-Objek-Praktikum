package pkg152011513020aaprak12a1;

import java.io.IOException;

public class Test3 {
    public void methodA(){
        System.out.println("Method A");
    }
    
    public void methodB() throws IOException{
        System.out.println(20/0);
        System.out.println("Method B");
    }
}