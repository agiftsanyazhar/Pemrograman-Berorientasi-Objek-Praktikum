package pkg152011513020aaprak2a1;

public class Pecahan {
    private int pembilang;
    private int penyebut;
    
    // Contructor
    Pecahan (int xpembilang, int xpenyebut){
        this.pembilang  = xpembilang;
        this.penyebut   = xpenyebut;
    }
    
    public int getPembilang() {
        return this.pembilang;
    }

    public int getPenyebut() {
        return this.penyebut;
    }
    
    public void tambah (Pecahan lain){
        
        System.out.println("(" + this.pembilang + "/" + this.penyebut + ") + ("
                + lain.pembilang + "/" + lain.penyebut + ")");
        
        int bilang;
        int sebut;
        int z;
        
        if (this.penyebut == lain.penyebut){
            bilang  = this.pembilang + lain.pembilang;
            sebut   = this.penyebut;
            
            if (bilang == sebut){
                z   = bilang/sebut;
                System.out.println("= " + z);
            }
            
            else {
                System.out.println("= " + bilang + "/" + sebut);
            }
            
        }
        
        else if (this.penyebut == 0){
            System.out.println("Tidak terdefinisi");
        }
        
        else if (lain.penyebut == 0){
            System.out.println("Tidak terdefinisi");
        }
        
        else if (this.penyebut != lain.penyebut){
            bilang  = samaPeny(lain)/this.penyebut*this.pembilang + 
                      samaPeny(lain)/lain.penyebut*lain.pembilang;
            sebut   = samaPeny(lain);
            System.out.println("= " + bilang + "/" + sebut);
        }
    }
    
    private int samaPeny (Pecahan lain){
        int sebut;
        
        sebut   = this.penyebut*lain.penyebut;
        return sebut;
    }
}