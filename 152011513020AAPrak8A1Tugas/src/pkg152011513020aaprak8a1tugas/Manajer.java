package pkg152011513020aaprak8a1tugas;

public class Manajer extends Pegawai{
    private int tunjangan;
    
    Manajer (String nama, int gaji, int tunjangan){
        super(nama, gaji);
        this.tunjangan  = tunjangan;
    }
    
    int infoGaji(){
        return super.gaji;
    }
    
    int infoTunjangan(){
        return this.tunjangan;
    }
}