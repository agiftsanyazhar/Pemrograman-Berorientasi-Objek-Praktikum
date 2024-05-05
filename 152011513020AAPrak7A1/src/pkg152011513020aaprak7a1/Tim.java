package pkg152011513020aaprak7a1;

public class Tim {
    private String nama;
    Member[] M;
    Trainee[] T;
    int i, j;

    Tim(){
        this.M = new Member[5];
        this.T = new Trainee[5];
        this.i = 0;
        this.j = 0;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setMember(Member x){
        this.M [this.i] = new Member (x.getNama(), x.getUmur());
        this.i++;
    }

    void setTrainee(Trainee x){
        this.T [this.j] = new Trainee (x.getNama(), x.getUmur(), 
                x.getLamaTraining());
        this.j++;
    }

    void displayFullMember(){
        for (int i=0; i<this.i; i++){
            System.out.println("Nama        : " + M[i].getNama());
            System.out.println("Umur        : " + M[i].getUmur());
        }
    }

    void displayTrainee(){
        for (int j=0; j<this.j; j++){
            System.out.println("Nama        : "+T[j].getNama());
            System.out.println("Umur        : "+T[j].getUmur());
            System.out.println("Lama Train  : "+T[j].getLamaTraining());
        }
    }
}