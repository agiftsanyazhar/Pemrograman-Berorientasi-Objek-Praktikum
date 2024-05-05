package pkg152011513020aaprak4a1;

public class Kalender {
    int tanggal;
    int bulan;
    int tahun;
    
    Kalender(int tanggal){
        this.tanggal    = tanggal;
        bulan           = 1;
        tahun           = 2000;
    }
    
    Kalender(int bulan, int tahun){
        tanggal         = 1;
        this.bulan      = bulan;
        this.tahun      = tahun;
    }
    
    Kalender(int tanggal, int bulan, int tahun){
        this.tanggal    = tanggal;
        this.bulan      = bulan;
        this.tahun      = tahun;
    }
    
    public int getTanggal(){
        return this.tanggal;
    }
    
    public int getBulan(){
        return this.bulan;
    }
    
    public int getTahun(){
        return this.tahun;
    }
    
    public void setTanggal(int tanggal){
        this.tanggal    = tanggal;
    }
    
    public void setBulan(int bulan){
        this.bulan     = bulan;
    }
    
    public void setTahun(int tahun){
        this.tahun     = tahun;
    }
}