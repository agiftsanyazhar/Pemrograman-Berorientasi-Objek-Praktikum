package pkg152011513020aaprak7a1;

public class Member {
    protected String nama;
    protected int umur;
    
    Member (String nama, int umur){
        this.nama   = nama;
        this.umur   = umur;
    }
    
    public void setUmur(){
        this.umur   = umur;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public void display(){
        System.out.println("Nama        : " + this.nama);
        System.out.println("Umur        : " + this.umur);
    }
}