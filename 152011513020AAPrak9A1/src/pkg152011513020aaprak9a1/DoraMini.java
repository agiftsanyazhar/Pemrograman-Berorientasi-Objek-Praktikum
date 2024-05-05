package pkg152011513020aaprak9a1;

public class DoraMini extends Robot {
    void sayDora(){
        System.out.println("Halo, Saya Dora Mini");
    }

    @Override
    void setNama(String nama) {
        super.nama   = nama;
    }

    @Override
    void displayData() {
        System.out.println("Nama    : " + super.nama);
        System.out.println("Pemilik : " + super.pemilik);
        System.out.println("Tahun   : " + super.tahun);
    }
}