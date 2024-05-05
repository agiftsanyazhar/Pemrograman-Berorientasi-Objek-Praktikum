package pkg152011513020aaprak5a1;

public class PengambilanUang extends Tabungan{
    private int proteksi;
    
    PengambilanUang (int saldo){
        super(saldo);
    }
    
    PengambilanUang (int saldo, int proteksi){
        super(saldo);
        this.proteksi       = proteksi;
    }
    
    public int getSaldo(){
        return super.saldo;
    }
    
    public boolean ambilUang(int jumlah){
        if (super.saldo-this.proteksi > jumlah){
            super.saldo = super.saldo-jumlah;
            
            return true;
        }
        else {
            return false;
        }
    }
}