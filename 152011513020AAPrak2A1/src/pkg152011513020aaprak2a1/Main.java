package pkg152011513020aaprak2a1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 2");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Simulasi Fighting Game");
        System.out.println("-------------------------------------------------");
        
        GameCharacter raiden    = new GameCharacter ("Raiden", 10, 20);
        GameCharacter subZero   = new GameCharacter ("Sub-Zero", 5, 25);
        
        raiden.display ();
        subZero.display ();
        
        System.out.println("-------------------------------------------------");
        System.out.println("                    FIGHT!                       ");
        System.out.println("-------------------------------------------------");
        System.out.println("Objek Raiden memulai pertarungan dengan melakukan \n"
                + "tendangan pada objek Sub-Zero.");
        raiden.kick (subZero);
        
        System.out.println("Objek Sub-Zero melakukan perlawanan dengan menendang \n"
                + "balik objek Raiden.");
        subZero.kick (raiden);
        
        System.out.println("Objek Sub-Zero menyerang Raiden dengan pukulan \n"
                + "berturut-turut sebanyak 3x (gunakan perulangan).");
        for (int i=0; i<3; i++){
            subZero.hit (raiden);
        }

        System.out.println("Pertarungan diakhiri oleh Raiden dengan melakukan \n"
                + "tendangan beruntun 4x pada objek.");
        for (int i=0; i<4; i++){
            raiden.kick (subZero);
        }   
     
        System.out.println("-------------------------------------------------");
        System.out.println("                    FIGHT END                    ");
        System.out.println("-------------------------------------------------");
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("                      SCORE                      ");
        System.out.println("-------------------------------------------------");
        
        raiden.display ();
        subZero.display ();
        
        System.out.println("-------------------------------------------------");
        System.out.println("                    THE WINNER                   ");
        System.out.println("-------------------------------------------------");
        raiden.winnerCheck (subZero);
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 2 Pecahan");
        System.out.println("-------------------------------------------------");
        int pembilang;
        int penyebut;
        int lainPembilang;
        int lainPenyebut;
        
        Pecahan a;
        Pecahan b;
        
        System.out.print("Masukkan pembilang      : ");
        pembilang       = input.nextInt();
        System.out.print("Masukkan penyebut       : ");
        penyebut        = input.nextInt();
        System.out.print("Masukkan pembilang lain : ");
        lainPembilang   = input.nextInt();
        System.out.print("Masukkan penyebut lain  : ");
        lainPenyebut    = input.nextInt();
        
        a = new Pecahan(pembilang, penyebut);
        b = new Pecahan(lainPembilang, lainPenyebut);
        
        a.tambah (b);
    }
}