package pkg152011513020aaprak8a1tugas;

public class Programmer extends Pegawai{
    private int bonus;
    
    Programmer (String nama, int gaji, int bonus){
        super(nama, gaji);
        this.bonus  = bonus;
    }
    
    int infoGaji(){
        return super.gaji;
    }
    
    int infoBonus(){
        return this.bonus;
    }
}