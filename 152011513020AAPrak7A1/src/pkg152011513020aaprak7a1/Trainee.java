package pkg152011513020aaprak7a1;

public class Trainee extends Member{
    private int lamaTraining;
    
    Trainee (String nama, int umur, int lamaTraining){
        super(nama, umur);
        this.lamaTraining   = lamaTraining;
    }
    
    public int getLamaTraining(){
        return this.lamaTraining;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Lama Training   : " + this.lamaTraining);
    }
}