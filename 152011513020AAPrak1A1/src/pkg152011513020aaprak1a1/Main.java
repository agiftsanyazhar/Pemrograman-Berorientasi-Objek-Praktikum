package pkg152011513020aaprak1a1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 1");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Buatlah sebuah program untuk menentukan\n"
                + "apakah sebuah bilangan termasuk ke dalam salah \nsatu " 
                + "kriteria");
        System.out.println("-------------------------------------------------");
        int bil;
        bilangan a;
        
        System.out.print("Masukkan bilangan : ");
        bil = input.nextInt();
        
        a = new bilangan(bil);
        
        a.display();
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Buatlah sebuah deret");
        System.out.println("-------------------------------------------------");
        int awal, beda, jumlah;
        deret b;
        
        System.out.print("Masukkan nilai awal           : ");
        awal = input.nextInt();
        System.out.print("Masukkan beda                 : ");
        beda = input.nextInt();
        System.out.print("Masukkan jumlah kemunculan    : ");
        jumlah = input.nextInt();
        
        b = new deret(awal, beda, jumlah);
        
        b.bentukDeret();
        
        System.out.print("\n\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 3");
        System.out.println("-------------------------------------------------");
        String judul, pengarang, tahun;
        int beli;
        double jual;
        
        jualBeli c;
        
        System.out.print("Masukkan judul        : ");
        judul       = input.nextLine();
        System.out.print("Masukkan pengarang    : ");
        pengarang   = input.nextLine();
        System.out.print("Masukkan tahun        : ");
        tahun       = input.nextLine();
        System.out.print("Masukkan beli         : ");
        beli        = input.nextInt();
        
        c = new jualBeli(judul, pengarang, tahun, beli);
        
        c.display();
    }
}