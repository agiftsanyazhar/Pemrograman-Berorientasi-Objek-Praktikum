package pkg152011513020soal1;

import java.util.Arrays;

public class Vektor {
    int [] vektor;
    
    //Constructor default
    Vektor() {
        
    }

    Vektor(int size, int elemen1, int elemen2, int elemen3, int elemen4, int elemen5) {
        this.vektor     = new int[size];
        this.vektor[0]  = elemen1;
        this.vektor[1]  = elemen2;
        this.vektor[2]  = elemen3;
        this.vektor[3]  = elemen4;
        this.vektor[4]  = elemen5;
    }

    //Menamilkan semua elemen array
    void displayElemen() {
        System.out.println("Elemen vektor           = " + Arrays.toString(this.vektor));
    }

    //Memilih dan mengedit elemen
    void showElemenI(int index) {
        if(!(index<0 || index>this.vektor.length)) {
            System.out.println("Elemen ke-" + this.vektor[index]);
        } else {
            System.out.println("Index out of bound!");
            System.exit(0);
        }
    }

    void editVektor(int index, int replace) {
        this.vektor[index] = replace;
    }

    int[] jumlahVektor(Vektor vektor1, Vektor vektor2) {
       int[] arr = new int[vektor1.vektor.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = vektor1.vektor[i] + vektor2.vektor[i];
        }
        return arr;
    }

    int[] kurangVektor(Vektor vektor1, Vektor vektor2) {
        int[] arr = new int[vektor1.vektor.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = vektor1.vektor[i] - vektor2.vektor[i];
        }
        return arr;
    }

    int[] kaliVektor(Vektor vektor1, int skalar) {
        int[] arr = new int[vektor1.vektor.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = vektor1.vektor[i]*skalar;
        }
        return arr;
    }

    int[] bagiVektor(Vektor vektor1, int skalar) {
        int[] arr = new int[vektor1.vektor.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = vektor1.vektor[i]/skalar;
        }
        return arr;
    }
}