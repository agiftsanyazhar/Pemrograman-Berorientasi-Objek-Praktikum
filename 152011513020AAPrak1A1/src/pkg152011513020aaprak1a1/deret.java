package pkg152011513020aaprak1a1;

public class deret {
    // Deklarasi variabel
    int awal, beda, jumlah;
    String hasil;
    
    // Deklarasi constructor
    deret (int xawal, int xbeda, int xjumlah){
        this.awal   = xawal;
        this.beda   = xbeda;
        this.jumlah = xjumlah;
    }
    
    // Deklarasi method
    public void bentukDeret (){
        int i;
        for (i=0; i<this.jumlah; i++){
            System.out.print(this.awal + "   ");
            this.awal = this.awal + this.beda;
        }
    }
}