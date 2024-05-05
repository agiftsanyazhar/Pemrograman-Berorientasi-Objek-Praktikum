package pkg152011513020aaprak1a1;

public class jualBeli {
    // Deklarasi variabel
    String judul, pengarang, tahun;
    int beli;
    double jual;
    
    // Deklarasi constructor
    jualBeli (String xjudul, String xpengarang, String xtahun, int xbeli){
        this.judul      = xjudul;
        this.pengarang  = xpengarang;
        this.tahun      = xtahun;
        this.beli       = xbeli;
    }
    
    // Deklarasi method
    public void inputJudul (String judul){
        this.judul      = judul;
    }
    
    public void inputPengarang (String pengarang){
        this.pengarang  = pengarang;
    }
    
    public void inputTahun (String tahun){
        this.tahun      = tahun;
    }
    
    public void inputBeli (int beli){
        this.beli       = beli;
    }
    
    public double hargaJual (){
        this.jual       = this.beli - (0.2*this.beli);
        return this.jual;
    }
    
    // Deklarasi display
    public void display (){
        System.out.println("Judul       : " + this.judul);
        System.out.println("Pengarang   : " + this.pengarang);
        System.out.println("Tahun       : " + this.tahun);
        System.out.println("Beli        : " + this.beli);
        System.out.println("Jual        : " + hargaJual());
    }
}