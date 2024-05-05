package pkg152011513020aaprak8a1latihan;

public class Main {
    public static void Tugas(Pegawai peg) {
        if (peg instanceof Manajer){
            System.out.println("Tugas Manajer:");
            ((Manajer) peg).memimpin();
            ((Manajer) peg).mengawasi();
            ((Manajer) peg).mengarahkan();
            System.out.print("\n");
        }
        else if (peg instanceof Kurir){
            System.out.println("Tugas Kurir:");
            ((Kurir) peg).pickUpPaket();
            ((Kurir) peg).kirimPaket();
            System.out.print("\n");
        }
        else {
            System.out.println("Tugas Pegawai:");
            ((Pegawai) peg).buatAgenda();
            ((Pegawai) peg).entriData();
            ((Pegawai) peg).arsipData();
            ((Pegawai) peg).panggilan();
            System.out.print("\n");
        }
    }
    
    public static void main(String args[]) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 8 Latihan");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        Manajer man     =   new Manajer();
        Kurir kur       =   new Kurir();
        Tugas (man);
        Tugas (kur);
    }
}