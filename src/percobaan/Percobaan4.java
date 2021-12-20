package percobaan;

public class Percobaan4 {
    public static void main(String[] args) {
        int[] e = new int [2];

        try {
            System.out.println("Acces element in three: " + e[3]);

        }

        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception thrown: " +ex);
        }

        finally {
            e[0] = 6;
            System.out.println("First element value: " + e[0]);
            System.out.println("Finally statement is executed!");
        }
    }
}
