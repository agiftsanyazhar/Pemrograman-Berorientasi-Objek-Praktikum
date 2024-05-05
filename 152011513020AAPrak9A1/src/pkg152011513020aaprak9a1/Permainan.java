package pkg152011513020aaprak9a1;

import java.util.Scanner;

public abstract class Permainan {
    Scanner input=new Scanner(System.in);
    
    private String namaPemain;
    private int levelPemain;
    private String namaLevelPemain;
    
    void setNamaPemain (String nama){
        this.namaPemain     = nama;
    }
    
    void setLevelPemain (int level){
        this.levelPemain     = level;
        if (level>0 && level<=20){
            this.namaLevelPemain    = "Normal";
        }
        else if (level>20 && level<=80){
            this.namaLevelPemain    = "Medium";
        }
        else if (level>80 && level<=100){
            this.namaLevelPemain    = "Hard";
        }
    }
    
    String getNamaPemain (){
        return this.namaPemain;
    }
    
    int getLevelPemain (){
        return this.levelPemain;
    }
    
    String getNamaLevelPemain (){
        return this.namaLevelPemain;
    }
    
    void jalankan(){
        System.out.print("Masukan nama player     : ");
        String nama = input.nextLine();
        setNamaPemain (nama);
        System.out.print("Masukan level player    : ");
        int level   = input.nextInt();
        setLevelPemain (level);
        System.out.print("Masukan hit             : ");
        int hit     = input.nextInt();
        System.out.print("Masukan miss            : ");
        int miss    = input.nextInt();
        
        System.out.println("Nama        : " + getNamaPemain());
        System.out.println("Level       : " + getLevelPemain());
        System.out.println("Nama level  : " + getNamaLevelPemain());
        
        if (hitungSkor(hit, miss) < 0){
            System.out.println("Error");
        }
        else {
            System.out.println("Skor        : " + hitungSkor(hit, miss));
        }
    }
    
    abstract int hitungSkor (int hit, int miss);
}