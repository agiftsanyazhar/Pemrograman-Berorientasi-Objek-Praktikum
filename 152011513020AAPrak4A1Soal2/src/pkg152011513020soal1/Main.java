package pkg152011513020soal1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 4");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2");
        System.out.println("-------------------------------------------------");
        
        System.out.print("\n");
        System.out.println("Memasukkan Nilai-Nilai Vektor");
        System.out.println("Elemen Vektor ke-1");
        
        Vektor vektor1   = new Vektor(5);
        
        System.out.print("Input element : 1");
        vektor1.addElement(1);
        System.out.print("Input element : 2");
        vektor1.addElement(2);
        System.out.print("Input element : 3");
        vektor1.addElement(3);
        System.out.print("Input element : 4");
        vektor1.addElement(4);
        System.out.print("Input element : 5");
        vektor1.addElement(5);
        
        vektor1.display();
        
        System.out.println("\n");
        System.out.println("Hasil Penjumlahan Vektor");
        System.out.println("Jumlah      = " + 
                vektor1.jumlahVektor(vektor1.getVektor()));
        
        System.out.println("\nHasil Pengurangan Vektor");
        System.out.println("Kurang      = " +
                Arrays.toString(vektor1.kurangVektorKonst(3)));
        
        System.out.println("\nHasil Kuadrat Vektor");
        System.out.println("Kuadrat     = " +
                Arrays.toString(vektor1.kuadratVektor(vektor1.getVektor())));
        
        System.out.println("\nHasil Pangkat 3 Vektor");
        System.out.println("Pangkat 3   = " +
                Arrays.toString(vektor1.pangkat3Vektor(vektor1.getVektor())));
        
        System.out.println("\nMenghitung Mean dari Vektor");
        System.out.println("Mean        = " + vektor1.mean());
        
        System.out.println("\nMenghitung Varians dari Vektor");
        System.out.println("Varians     = " + vektor1.varians());
        
        System.out.println("\nMenghitung E3 dari Vektor");
        System.out.println("E3          = " + vektor1.E3());
    }
}