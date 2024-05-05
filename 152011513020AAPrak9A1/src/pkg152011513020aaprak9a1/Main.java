package pkg152011513020aaprak9a1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 9 Nomor 1");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        DoraMini dm   = new DoraMini();
        
        dm.sayDora();
        
        dm.setNama("Dori");
        dm.setTahunPembuatan(2021);
        
        dm.displayData();
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 9 Nomor 2");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Permainan Strategy");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        PermainanStrategy ps    = new PermainanStrategy();
        
        ps.jalankan();

        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Permainan Arcade");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        PermainanArcade pa    = new PermainanArcade();
        
        pa.jalankan();
    }
}