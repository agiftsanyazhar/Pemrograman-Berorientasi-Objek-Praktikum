package pkg152011513020aaprak12a1;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    static void demo(){
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;
//        Baris ini tidak lagi dikerjakan;
//        System.out.println("Ini tidak lagi dicetak");
    }
    
    public static String reverse(String s) throws Exception{
        if(s.length()==0){
            throw new Exception();
        }
        String reverseStr = "";
        for(int i=s.length()-1 ; i>=0 ; --i){
            reverseStr+=s.charAt(i);
        }
        return reverseStr;
    }
    
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Praktikum 12");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 5");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        int bil=10;
        try{
            System.out.println(bil/0);
        }
        catch(ArithmeticException e){
//            System.out.println("Pesan error: ");
//            System.out.println(e.getMessage());
//            System.out.println("Info stack erase");
//            e.printStackTrace();
//            e.printStackTrace(System.out);
        }
        catch(Exception e){
            System.out.println("Ini menghandle error yang terjadi");
        }
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 6");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        try{
            demo();
            System.out.println("Selesai");
        }
        catch(NullPointerException e){
            System.out.println("Ada pesan error: "+e);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 7");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        try{
            throw new Exception("Here's my Exception");
        }
        catch(Exception e){
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
//            e.printStackTrace();
        }
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 8");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
//        Test3 c=new Test3();
//        c.methodA();
//        c.methodB();
        
        Test3 T3 = new Test3();
        T3.methodA();
        try{
            T3.methodB();
        }
        catch(IOException e){
            System.out.println("Error di Method B");
        }
        finally{
            System.out.println("Ini selalu dicetak");
        }
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 9");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        try{
            System.out.println(reverse("This is a string"));
        }
        catch(Exception e){
            System.out.println("The String was blank");
        }
        finally{
            System.out.println("All done");
        }
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 10");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        
        String bookList[]={"Satu","Dua","Tiga"};
        int yearList[]={1920,1230,1940};
        try{
            RandomAccessFile books = new RandomAccessFile("books.txt","rw");
            for(int i=0;i<3;i++){   
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            books.seek(0);
            System.out.println(books.readUTF()+" "+books.readInt());
            System.out.println(books.readUTF()+ " "+books.readInt());
            books.close();
        }

        catch(IOException e){
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 11");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
        int position=1;
        try{
            if(position>0){
                throw new RangeErrorException("Position " +position);
            }
        }
        catch(RangeErrorException e){
            System.out.println("Range error: " +e.getMessage());
        }
        System.out.println("This is the last program.");
        
        System.out.print("\n");
        System.out.println("-------------------------------------------------");
        System.out.println("Percobaan 12");
        System.out.println("-------------------------------------------------");
        System.out.print("\n");
    }
}