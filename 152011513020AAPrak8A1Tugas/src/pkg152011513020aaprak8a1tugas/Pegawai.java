package pkg152011513020aaprak8a1tugas;

public class Pegawai {
    protected String nama;
    protected int gaji;
    
    Pegawai (String nama, int gaji){
        this.nama   = nama;
        this.gaji   = gaji;
    }
    
    int infoGaji(){
        return this.gaji;
    }
}