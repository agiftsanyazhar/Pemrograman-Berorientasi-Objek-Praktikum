package pkg152011513020aaprak11a1;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 11 Percobaan 1");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        Luar        l   = new Luar ();
        Luar.Dalam  d   = l.new Dalam ();
        
        d.bicara();
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 11 Percobaan 7");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        Parcel1 p1  = new Parcel1();
        Tujuan t    = p1.ke("Sidoarjo");
        
        System.out.println(t.bacaLabel());
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 11 Latihan 1");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        Problem outer       = new Problem ();
        Problem.Inner inner = outer.new Inner ();
        
        inner.testMethod ();
    }
}