package latihan;
// Rosalina Alda
// 20104066
public class StudentRecordExample {
    public static void main( String[] args ){
        StudentRecord Wahyu = new StudentRecord();
        StudentRecord Ini = new StudentRecord();
        StudentRecord Nama = new StudentRecord();
        Wahyu.setName("Wahyu");
        Ini.setName("Ini");
        Nama.setName("Nama");
        System.out.println(Wahyu.getName() );
        System.out.println("Hitung="+StudentRecord.getStudentCount
                ()
        );
    }

}