package pkg152011513020aaprak5a1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 5");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Penyimpanan Uang");
        System.out.println("-------------------------------------------------");
        
        PenyimpananUang tabungan1 = new PenyimpananUang(5000,8.5/100);
        System.out.println("Uang yang ditabung          : 5000");
        System.out.println("Tingkat bunga sekarang      : 8.5%");
        System.out.println("Total uang anda sekarang    : " + tabungan1.cekUang());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Pengambilan Uang");
        System.out.println("-------------------------------------------------");
        
        PengambilanUang tabungan = new PengambilanUang(5000,1000);
        System.out.println("Uang yang ditabung          : 5000");
        System.out.println("Uang yang diproteksi        : 1000");
        System.out.println("----------------------------------");
        System.out.println("Uang yang akan diambil      : 4500 " + 
                tabungan.ambilUang(4500));
        System.out.println("Saldo sekarang              : " + 
                tabungan.getSaldo());
        System.out.println("----------------------------------");
        System.out.println("Uang yang akan diambil      : 2500 " +
                tabungan.ambilUang(2500));
        System.out.println("Saldo sekarang              : " + 
                tabungan.getSaldo());
    }   
}