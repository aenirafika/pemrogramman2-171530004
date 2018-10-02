public class Barang {
    public static void main (String[] args){
        //casting implisit
        System.out.println("Program Menghitung Total Penjualan");
        System.out.println("\nDaftar barang terjual\t: ");
        System.out.println("\nFloridina\t\t: 3000x2");
        System.out.println("\nAqua\t\t\t: 2000x3");
        System.out.println("\nMizone\t\t\t: 4000x1");
        System.out.println("\nPurple Orange\t\t: 6000x2");
        System.out.println("\nCoca Cola\t\t: 10000x1");
        //implisit
        int Floridina=2;
        float F=Floridina;
        int Aqua=3;
        float A=Aqua;
        int Mizone=1;
        float M=Mizone;
        int PurpleOrange=2;
        float P=PurpleOrange;
        int CocaCola=1;
        float C=CocaCola;

        //explisit                                                                        
        double uang=50000;
        float ug = (float) uang;

        /*
        System.out.println("\nMasukkan jumlah barang yang terjual\t");
        System.out.println("Floridina\t:");
        F = Keyboard.nextInt();
        System.out.println("Aqua\t:");
        A = Keyboard.nextInt();
        System.out.println("Mizone\t:");
        M = Keyboard.nextInt();
        System.out.println("Purple Orange\t:");
        P = Keyboard.nextInt();     
        System.out.println("Coca Cola\t:");
        C = Keyboard.nextInt();
        */

        float t = (F*3000F)+(A*2000F)+(M*4000F)+(P*6000)+(C*10000F);
        System.out.println("\nTotal penjualan adalah "+t);

        System.out.println("\nUang yang dibayarkan\t: "+ug);

        float kembalian = ug-t;
        System.out.println("Kembalian sebesar \t: "+kembalian);
    }
}