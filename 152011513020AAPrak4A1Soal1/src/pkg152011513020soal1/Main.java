package pkg152011513020soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 4");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Array Satu Dimensi");
        System.out.println("-------------------------------------------------");
        
        System.out.print("\n");
        System.out.println("Memasukkan Nilai-Nilai Vektor");
        System.out.println("Elemen Vektor ke-1");
        
        Vektor vektor1 = new Vektor(5, 13,12,3,41,15);
        
        vektor1.displayElemen();

        System.out.print("\n");
        System.out.println("Ambil Nilai Elemen ke-i");
        
        //Memilih elemen
        System.out.print("Pilih elemen            : ");
        int elmIndex = input.nextInt();

        vektor1.showElemenI(elmIndex - 1);
        
        //Input elemen
        System.out.print("Input elemen pengganti  : ");
        int newElemen = input.nextInt();
        input.nextLine();
        
        //Mengganti elemen dengan nilai baru
        vektor1.editVektor(elmIndex - 1, newElemen);
        
        //Menampilkan semua elemen
        vektor1.displayElemen();

        System.out.print("\n");
        System.out.println("Elemen Vektor ke-2");
        
        Vektor vektor2 = new Vektor(5, 16,37,8,29,17);

        vektor2.displayElemen();

        System.out.print("\n");
        System.out.println("Hasil Penjumlahan Vektor");
        
        Vektor vektor3 = new Vektor();

        vektor3.vektor = vektor3.jumlahVektor(vektor1, vektor2);
        
        vektor1.displayElemen();
        vektor2.displayElemen();
        System.out.println("---------------------------------------------- +");
        vektor3.displayElemen();
        
        System.out.print("\n");
        System.out.println("Hasil Pengurangan Vektor");

        Vektor vektor4 = new Vektor();

        vektor4.vektor = vektor4.kurangVektor(vektor1, vektor2);
        
        vektor1.displayElemen();
        vektor2.displayElemen();
        System.out.println("---------------------------------------------- -");
        vektor4.displayElemen();
        
        System.out.print("\n");
        System.out.println("Hasil Perkalian Vektor");

        Vektor vektor5 = new Vektor();

        vektor5.vektor = vektor5.kaliVektor(vektor1, 5);
        
        vektor1.displayElemen();
        System.out.println("---------------------------------------------- *5");
        vektor5.displayElemen();
        
        System.out.print("\n");
        System.out.println("Hasil Pembagian Vektor");

        Vektor vektor6 = new Vektor();

        vektor6.vektor = vektor6.bagiVektor(vektor1, 5);
        
        vektor1.displayElemen();
        System.out.println("---------------------------------------------- /5");
        vektor6.displayElemen();
    }
}