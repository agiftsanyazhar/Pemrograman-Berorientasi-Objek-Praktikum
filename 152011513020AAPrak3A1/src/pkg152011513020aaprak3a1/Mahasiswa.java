package pkg152011513020aaprak3a1;

public class Mahasiswa {
    private final String nama;
    private final int nrp;
    
    Mahasiswa(String xnama, int xnrp){
        this.nama    = xnama;
        this.nrp     = xnrp;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getNrp(){
        return this.nrp;
    }
}