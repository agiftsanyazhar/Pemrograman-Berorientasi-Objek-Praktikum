package pkg152011513020aaprak11a1;

// Non Static
public class Luar {
    private String variabelLuar = "Variabel Luar";
    
    class Dalam {
        String VariabelDalam    = "Variabel Dalam";
        
        public void bicara (){
            System.out.println(VariabelDalam);
            System.out.println(variabelLuar);
        }
        
    }
    
}