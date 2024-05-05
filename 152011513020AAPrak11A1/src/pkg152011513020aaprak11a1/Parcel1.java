package pkg152011513020aaprak11a1;

public class Parcel1 {
    public Tujuan ke (String s){
        
        class Tujuannya implements Tujuan {
            private String label;
            
            Tujuannya (String tuj){
                label   = tuj;
            }
            
            public String bacaLabel (){
                return label;
            }
        }
        
        return new Tujuannya (s);
    }
}

interface Tujuan {
    String bacaLabel ();
}