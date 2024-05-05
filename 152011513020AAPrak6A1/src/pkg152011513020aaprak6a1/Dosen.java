package pkg152011513020aaprak6a1;

public class Dosen extends Orang{
    private int nip;
    
    Dosen (String nama){
        super(nama);
    }
    
    Dosen (String nama, int nip){
        super(nama);
        this.nip    = nip;
    }
    
    Dosen (String nama, int nip, int umur){
        super(nama, umur);
        this.nip    = nip;
    }
    
    public void Info(){
        System.out.println("Nama    : " + super.nama);
        if (this.nip == 0){
            System.out.println("NIP     : -");
        } else{
            System.out.println("NIP     : " + this.nip);
        }
        if (super.umur == 0){
            System.out.println("Umur    : -"); 
        } else{
            System.out.println("Umur    : " + super.umur);
        }
    }
}