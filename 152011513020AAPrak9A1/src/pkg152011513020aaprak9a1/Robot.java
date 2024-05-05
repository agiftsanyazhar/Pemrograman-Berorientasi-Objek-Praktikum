package pkg152011513020aaprak9a1;

public abstract class Robot {
    protected String nama;
    protected String pemilik;
    protected int tahun;
    
    void setTahunPembuatan (int tahun){
        this.tahun  = tahun;
    }
    
    abstract void setNama (String nama);
    
    abstract void displayData ();
}