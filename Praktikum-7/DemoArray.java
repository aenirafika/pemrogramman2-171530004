public class DemoArray { //membuat class baru dg nama DemoArray dengan modifier public
 //setiap claas yang ada method main pasti bisa dijalankan
    public static void main(String[] args) { // membuat method main yg berfungsi sbg method  yg pertama kali dijalankan
        System.out.println("\nContoh1\n");
        String nama[] = new String[5]; //pendeklarasian variabel dan memberi panjang array
        nama[0] = "Andi Novianto"; //pemberian nilai/inisialisasi pada array elemen ke nol dengan nilai Andi Novianto
        nama[1] = "Zidna Aisya";
        System.out.println(nama[0]);
        System.out.println(nama[1]);
        System.out.println(nama[2]); //outputnya null karena belu diinisialisasi

        System.out.println("\n\nContoh 2\n");
        int nilai[] = {75, 80, 90, 100}; //deklarasi variabel array dengan nama nilai dan tipe data int dan memiliki panjang array 4 dan langsung di inisialisasikan
        System.out.println("Cetak Nilai elemen 0 : "+nilai[0]);
        System.out.println("Cetak Nilai elemen 1 : "+nilai[1]);
        System.out.println("Cetak Nilai elemen 2 : "+nilai[2]);
        System.out.println("Cetak Nilai elemen 3 : "+nilai[3]);
        int jumlah = nilai[1] + nilai[2] + nilai[3]; //sintak utk menjumlah nilai dari variabel array
        System.out.println("Jumlah Nilai elemen (1+2+3) : "+jumlah);
        
    }
}