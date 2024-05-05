package pkg152011513020aaprak3a1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 3");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Tabungan");
        System.out.println("-------------------------------------------------");
        
        boolean status1;
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal                  : " + tabungan.getSaldo());
        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan   : 3000");
        status1 = tabungan.ambilUang(6000);
        System.out.print("Jumlah uang yang diambil    : 6000");
        if (status1)
            System.out.println("    Ok");
        else
            System.out.println("    Gagal");
        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan   : 3500");
        status1 = tabungan.ambilUang(4000);
        System.out.print("Jumlah uang yang diambil    : 4000");
        if (status1)
            System.out.println("    Ok");
        else
            System.out.println("    Gagal");
        status1 = tabungan.ambilUang(1600);
        System.out.print("Jumlah uang yang diambil    : 1600");
        if (status1)
            System.out.println("    Ok");
        else
            System.out.println("    Gagal");
        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan   : 2000");
        System.out.println("Saldo sekarang              : " + tabungan.getSaldo());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Mahasiswa");
        System.out.println("-------------------------------------------------");
        
        Mahasiswa mhs = new Mahasiswa("Jono", 12345);
        System.out.println("Nama    : " + mhs.getNama());
        System.out.println("NRP     : " + mhs.getNrp());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3 Truk");
        System.out.println("-------------------------------------------------");
        
        Truk truk = new Truk(900);
        boolean status2;
        System.out.println("Muatan maksimal                : " + truk.getMuatanMaks());
        status2 = truk.tambahMuatan(500.0);
        System.out.print("Tambah muatan                  : 500");
        if (status2)
            System.out.println("    Ok");
        else
            System.out.println("    Gagal");
        status2 = truk.tambahMuatan(300.0);
        System.out.print("Tambah muatan                  : 300");
        if (status2)
            System.out.println("    Ok");
        else
            System.out.println("    Gagal");
        status2 = truk.tambahMuatan(150.0);
        System.out.print("Tambah muatan                  : 150");
        if (status2)
            System.out.println("    Ok");
        else
            System.out.println("    Gagal");
        status2 = truk.tambahMuatan(50.0);
        System.out.print("Tambah muatan                  : 50");
        if (status2)
            System.out.println("     Ok");
        else
            System.out.println("     Gagal");
            System.out.println("Muatan sekarang (dalam Newton) : " + truk.getMuatan());
    }
}