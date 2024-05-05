package pkg152011513020aaprak5a1;

public class PenyimpananUang extends Tabungan{
    private final double tingkatBunga;
    
    PenyimpananUang(int saldo, double tingkatBunga){
        super(saldo);
        this.tingkatBunga       = tingkatBunga;
    }
    
    public double cekUang(){
        double total;
        total   = super.saldo+(super.saldo*this.tingkatBunga) ;
        
        return total;
    }
}