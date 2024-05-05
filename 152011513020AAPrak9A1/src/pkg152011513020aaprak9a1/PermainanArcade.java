package pkg152011513020aaprak9a1;

public class PermainanArcade extends Permainan{
    int skor;
    
    @Override
    int hitungSkor(int hit, int miss){
        this.skor   = hit*3-miss;
        
        return this.skor;
    }
}