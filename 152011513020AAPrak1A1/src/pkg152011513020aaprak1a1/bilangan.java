package pkg152011513020aaprak1a1;

public class bilangan {
    // Deklarasi variabel
    int bil;
    String hasil;
    
    // Deklarasi constructor
    bilangan (int xbil){
        this.bil = xbil;
        
        if (this.bil%2==0){
            this.hasil = "Positif genap";
        } if (this.bil%2!=0){
            this.hasil = "Positif ganjil";
        } if (this.bil%2==0 && this.bil<0){
            this.hasil = "Negatif genap";
        } if (this.bil%2!=0 && this.bil<0){
            this.hasil = "Negatif ganjil";
        }
    }
    
    // Deklarasi display
    public void display (){
        System.out.println("Hasil : " + this.hasil);
    }
}