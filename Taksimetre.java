import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        // Java ile gidilen mesafeye(KM) göre taksimetre tutarını ekrana yazdıran bir program yazın.
        // şartlar & conditions
        //condition1 Taksimetre KM başına 2.20 TL tutmaktadır.
        // Minimum ödenecek tutar 20TL dir. 20TL altındaki ücretler yine 20TL alınacaktır.
        //Taksimetre açılış ücreti 10TL'dir.
        // para üstü filan verilmez, karşının taksisiyim diyip darlanacak, mümkünse sigara da yak ki üstü başı leş olsun
        Scanner input = new Scanner(System.in);
        double kmCarpani = 2.20;
        System.out.println("Mesafe Giriniz(KM cinsinden) :");
        double mesafe = input.nextDouble();

        double ucret = (10 + (mesafe * kmCarpani)) < 20 ? 20 : (10 + (mesafe * kmCarpani));
         ucret = Math.round(ucret);

        System.out.println("Taksimetre ücreti :" + ucret);
    }
}
