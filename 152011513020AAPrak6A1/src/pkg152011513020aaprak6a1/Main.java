package pkg152011513020aaprak6a1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 6");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Orang, Dosen");
        System.out.println("-------------------------------------------------");
        
        System.out.println("Masukkan identitas dosen 1 : Agus");
        Dosen dosenl = new Dosen("Agus");
        System.out.println("Masukkan identitas dosen 2 : Budi, NIP. 1458");
        Dosen dosen2 = new Dosen("Budi", 1458);
        System.out.println("Masukkan identitas dosen 3 : Iwan, NIP. 1215, umur 47");
        Dosen dosen3 = new Dosen("Iwan", 1215, 47);
        
        System.out.println();
        dosenl.Info();
        System.out.println();
        dosen2.Info();
        System.out.println();
        dosen3.Info();
    }   
}