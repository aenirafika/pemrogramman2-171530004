import java.util.*;
public class LSegitiga1 {
    public static void main (String[] args){

        int alas, tinggi;
        double luas;

        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Luas Segitiga ===");
        System.out.println("\n\nMasukkan Alas\t:");
        alas = input.nextInt();
        System.out.println("Masukkan Tinggi");
        tinggi = input.nextInt();
        luas = ((alas*tinggi)/2);
        System.out.println("Luas Segitiga = "+luas);
    }
}