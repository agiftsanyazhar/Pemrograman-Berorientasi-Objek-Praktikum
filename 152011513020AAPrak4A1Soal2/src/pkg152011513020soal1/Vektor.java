package pkg152011513020soal1;

public class Vektor {
    int [] vektor;
    int[] arr;
    int sizeMaks;
    int size;

    Vektor (int sizeMaks){
        this.vektor     = new int[sizeMaks];
        this.arr        = new int[sizeMaks];
        this.sizeMaks   = sizeMaks;
        this.size       = 0;
    }
    
    public void addElement(int element){
        if (this.size < this.sizeMaks){
            this.vektor[this.size]  = element;
            this.arr[this.size]     = element;
            this.size++;
            System.out.println("    Input Berhasil");
        }
        else {
            System.out.println("    Input Error. Vektor Sudah Penuh");
        }
    }
    
    public int getSizeElement(){
        return this.size;
    }
    
    public int getElement(int index){
        return this.vektor[index];
    }
    
    public int[] getVektor (){
        return this.vektor;
    }
    
    public void changeElement(int element, int index){
        this.vektor[index - 1]    = element;
    }
    
    public void display(){
        System.out.println("\nNilai Vektor");
        System.out.print("A[");
        for (int i=0; i<this.sizeMaks; i++){
            System.out.print(" " + this.vektor[i] + " ");
        }
        System.out.print("]");
    }
    
    public int jumlahVektor(int [] x){
        int sum = 0;
        for (int i=0; i<this.size; i++){
            sum = sum + x[i];
        }
        return sum;
    }
    
    public int[] kurangVektorKonst(int konst){
        for (int i=0; i<this.vektor.length; i++){
            this.arr[i] = this.vektor[i] - konst;
        }
        return this.arr;
    }
    
    public int[] kuadratVektor(int [] x){
        for (int i=0; i<this.vektor.length; i++){
            this.arr[i] = x[i]*x[i];
        }
        return this.arr;
    }
    
    public int[] pangkat3Vektor(int [] x){
        for (int i=0; i<this.vektor.length; i++){
            this.arr[i] = x[i]*x[i]*x[i];
        }
        return this.arr;
    }
    
    public int mean(){
        int mean = jumlahVektor(this.vektor)/this.vektor.length;
        return mean;
    }
    
    public int varians(){
        int varians = jumlahVektor(kuadratVektor(kurangVektorKonst(mean())))/(this.size-1);
        return varians;
    }
    
    public int E3(){
        int e3 = jumlahVektor(pangkat3Vektor(kurangVektorKonst(mean())))/(this.size-1);
        return e3;
    }
}