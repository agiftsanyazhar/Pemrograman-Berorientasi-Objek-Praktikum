package pkg152011513020aaprak3a1;

public class Truk {
    private double muatan;
    private final double muatanMaks;
    
    Truk(double xmuatanMaks){
        this.muatanMaks  = xmuatanMaks;
    }
    
    public double getMuatan(){
        kiloToNewts(muatan);
        newtsToKilo(muatan);
        
        return muatan;
    }
        
    public double getMuatanMaks(){
        return muatanMaks;
    }
    
    public boolean tambahMuatan(double berat){
        if ((muatan + berat) < this.muatanMaks){
            muatan = muatan + berat;
            
            return true;
        }
        else {
            return false;
        }
    }
    
    public double newtsToKilo(double berat){
        muatan = muatan/9.8;
        
        return muatan;
    }
    
    public double kiloToNewts(double berat){
        muatan = muatan*9.8;
//        muatan = muatan/1;
        
        return muatan;
    }
}