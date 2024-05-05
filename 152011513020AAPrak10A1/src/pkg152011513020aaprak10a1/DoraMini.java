package pkg152011513020aaprak10a1;

public class DoraMini implements Robot, Doraemon{
    private String nama;
    private String pemilik;
    private int tahun;
    
    void setPemilik (String pemilik){
        this.pemilik = pemilik;
    }
    
    String getPemilik (){
        return this.pemilik;
    }

    @Override
    public void setNama(String nama) {
        this.nama   = nama;
    }

    @Override
    public void setTahunPembuatan(int tahun) {
        this.tahun  = tahun;
    }

    @Override
    public void displayData() {
        System.out.println("Nama            : " + this.nama);
        System.out.println("Pemilik         : " + this.pemilik);
        System.out.println("Tahun Pembuatan : " + this.tahun);
    }

    @Override
    public void sayDora() {
        System.out.println("Halo, Saya Dora Mini");
    }

    @Override
    public void displayKantongAjaib() {
        System.out.println("Saya juga seperti Doraemon yang \n"
                + "memiliki kantung ajaib");
    }
}