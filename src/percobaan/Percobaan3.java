package percobaan;

public class Percobaan3 {
    public static void main(String[] args) {
        int c = 10;
        int[] d = new int[5];

        try {
            System.out.println(c / 10);
            System.out.println(d[10]);
        }
        catch (ArithmeticException e) {
            System.out.println("Terjadilah Kesalahan aritmatika!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebihi batas maksimal!");
        }
        catch (Exception e) {
            System.out.println("Terjadi sebuah error!");
        }
    }
}
