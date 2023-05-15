
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main{
    // Ramazan Pidesi Uygulaması
    
    // Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi almaya baslayacak.
    
    
    /*
        pide_kuyrugu.offer("Hakan");
        pide_kuyrugu.offer("Ali");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Firat");
        pide_kuyrugu.offer("Mert");
        pide_kuyrugu.offer("Efe");
        pide_kuyrugu.offer("Batu");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Berkay");
        pide_kuyrugu.offer("Alper"); 
          
    */
    
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Ramazan Pidesi Uygulamasi....");
        Random random = new Random();
        
        Queue<String> pide_kuyrugu = new LinkedList<String>();
        
        pide_kuyrugu.offer("Hakan");
        pide_kuyrugu.offer("Ali");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Firat");
        pide_kuyrugu.offer("Mert");
        pide_kuyrugu.offer("Efe");
        pide_kuyrugu.offer("Batu");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Berkay");
        pide_kuyrugu.offer("Alper"); 
        
        int pide_sayisi = 1 + random.nextInt(10);
        System.out.println("Pideler Cikiyor...");
        System.out.println("Cikan Pide Sayisi : " + pide_sayisi);
        Thread.sleep(3000);
        
        while (pide_sayisi != 0) {
            
            System.out.println(pide_kuyrugu.poll() + " pideyi aldi...");
            pide_sayisi--;
            Thread.sleep(1000);
            
        }
        
        System.out.println("Pide kalmadi...");
        
        
        
}
}