package pkg152011513020aaprak3a1;

public class Tabungan {
    private int saldo;
    
    Tabungan(int xsaldo){
        this.saldo          = xsaldo;
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public int simpanUang(int jumlah){
        this.saldo  = this.saldo + jumlah;
        
        return this.saldo;
    }
    
    public boolean ambilUang(int jumlah){
        if (this.saldo > jumlah){
            this.saldo = this.saldo - jumlah;
            
            return true;
        }
        else {
            return false;
        }
    }
}