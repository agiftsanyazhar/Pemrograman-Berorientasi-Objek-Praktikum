package pkg152011513020aaprak7a1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 7");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Bimbingan Asisten/Dosen Praktikum");
        System.out.println("-------------------------------------------------");
        Tim t = new Tim();
        t.setNama("Tim T");
        Member m1 = new Member("Melody", 23);
        Member m2 = new Member("Haruka", 23);
        Member m3 = new Member("Kinal", 19);
        Trainee t1 = new Trainee("Alicia", 17,
        3);
        Trainee t2 = new Trainee("Indah", 17, 5);
        t.setMember(m1);
        t.setMember(m2);
        t.setMember(m3);
        t.setTrainee(t1);
        t.setTrainee(t2);
        System.out.println("Full Member");
        t.displayFullMember();
        System.out.println("\nTrainee");
        t.displayTrainee();
    }   
}