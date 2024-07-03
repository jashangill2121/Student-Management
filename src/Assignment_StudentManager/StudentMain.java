package Assignment_StudentManager;


public class StudentMain {
    public static void main(String[] args) {
                Student s1 = new Student("Alice",45,77721,"Java", new double[]{85, 90, 92});
                Student s2 = new Student("Bob",25,77722,"Maths", new double[]{78, 82, 88});
                Student s3 = new Student("Charlie",22,77707,"Java2", new double[]{50, 50, 9});

                StudentManager.addStudent(s1);

                StudentManager.displayAllStudents();

                StudentManager.findStudentByRollNumber(77722);

                StudentManager.displayTopStudent();

                System.out.println(s1);
                System.out.println(s2);
                System.out.println(s3);


    }

}
