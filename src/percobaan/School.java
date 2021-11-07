package percobaan;

public class School {
    public static void main(String[] args) {
        Classroom classA = new Classroom(101,"Class 101");
        Classroom classB = new Classroom(102,"Class 102");
        Classroom classC = new Classroom(103, "Class 103");

        // Student constructors
        Student stdA = new Student();
        Student stdB = new Student("Pyra");
        Student stdC = new Student(101010, "Mythra");

        // Assign student to classrooms
        classA.setStudent(stdA);
        classB.setStudent(stdB);
        classC.setStudent(stdC);

        // Output class A
        System.out.println(classA.getClassName());
        System.out.println("Class code: "+ classA.getClassCode());
        System.out.println("Student   : "+ classA.getStudent());
        System.out.println();

        // Output class B
        System.out.println(classB.getClassName());
        System.out.println("Class code: " + classB.getClassCode());
        System.out.println("Student   : " + classB.getStudent());
        System.out.println();

        // Output class C
        System.out.println(classC.getClassName());
        System.out.println("Student code: " + classC.getClassCode());
        System.out.println("Student     : " + classC.getStudent());
    }
}
