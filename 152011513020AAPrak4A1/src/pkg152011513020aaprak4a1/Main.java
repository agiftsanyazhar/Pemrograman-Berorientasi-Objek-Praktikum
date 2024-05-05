package pkg152011513020aaprak4a1;

public class Main {
    public static String getTime(Kalender kal) {
        String tmp;
        
        tmp = kal.getTanggal() + "-" + kal.getBulan() + "-" + kal.getTahun();
        
        return tmp;
    }
    
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 4");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nomor 1 Kalender");
        System.out.println("-------------------------------------------------");
        
        Kalender kal = new Kalender(8);
        System.out.println("Waktu awal                  : " + getTime(kal));
        kal.setTanggal(9);
        System.out.println("1 hari setelah waktu awal   : " + getTime(kal));
        kal=new Kalender(6,2003);
        System.out.println("Waktu berubah               : " + getTime(kal));
        kal.setBulan(7);
        System.out.println("1 bulan setelah itu         : " + getTime(kal));
        kal=new Kalender(20,10,2004);
        System.out.println("Waktu berubah               : " + getTime(kal));
        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu         : " + getTime(kal));
    }
}