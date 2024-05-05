package pkg152011513020aaprak9a1;

public class PermainanStrategy extends Permainan{
    int skor;
    
    @Override
    int hitungSkor(int hit, int miss){
        this.skor   = hit*5;
        
        return this.skor;
    }
}