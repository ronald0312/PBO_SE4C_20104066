package latihan;

import java.util.Scanner;

public class Ank_ayam {
        // Kita buat object 'input' dari class 'Scanner' terlebih dahulu
    public static void main(String[] args) {
        // Buat 2 variable untuk menampung nilai inputan nantinya
        int anx, i = 1;
        Scanner input = new Scanner(System.in);
        // Proses input
        System.out.print("Masukkan jumlah anak ayam : ");
        anx = input.nextInt();
        // Perintah perulangan  Do-while
        do {
            //Output akhir program
            System.out.println("Anak ayam turun" + anx);
            anx = anx - i;
            System.out.println("Mati 1 tinggal" + anx);
        }
        while (anx > i);
        {
            System.out.println("Anak ayam turun 1 tinggal induknya");
        }
    }
}
