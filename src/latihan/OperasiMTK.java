package latihan;

import java.util.Scanner;

public class OperasiMTK {
    public static void main(String[] args) {
        // Kita buat object 'input' dari class 'Scanner' terlebih dahulu
        Scanner scan = new Scanner(System.in);
        // Buat 3 variable untuk menampung nilai inputan nantinya
            int a,b,c;
        // Proses input
            System.out.print("Masukan Nilai a = ");
            a= scan.nextInt();
            System.out.print("Masukan Nilai b = ");
            b= scan.nextInt();
            System.out.print("Masukan Nilai c = ");
            c= scan.nextInt();
        //Output akhir program
        System.out.println("Hasil dari A+B-C adalah = " + (a+b-c));
    }
}
