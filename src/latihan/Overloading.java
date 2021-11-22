package latihan;

public class Overloading {
    public void jumlah() {
        int a=3, b=5;
        System.out.println("Hasil Penjumlahan dari method jumlah = " +(a+b));
    }
    public void jumlah(int x, int y) {
        System.out.println("Hasil Penjumlahan dari method jumlah = " +(x+y));
    }

    public static void main(String[] args) {
        Overloading tt;
        tt = new Overloading();
        tt.jumlah();
        tt.jumlah(11,12);
    }
}
