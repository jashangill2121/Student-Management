package Assignment_StudentManager;

public class StudentManager extends Student {

    static Student[] students = new Student[5];
    static int studentCount =0;

    public StudentManager(Student[] students) {
        super();
        this.students = students;
    }

    public static void addStudent(Student student) {
        studentCount++;

    }

    static void displayAllStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(i);
        }

    }

   static Student findStudentByRollNumber(int rollNumber) {
        for (int i = 0; i < students.length; i++) {

            if (getRollNumber() == rollNumber) {
                System.out.println(getName());
            } else {
                System.out.println("Student does not exist");
            }

        }
        return null;
    }

   static void displayTopStudent() {
        double highestGrade = getGrades()[0];

        for (int i = 0; i < getGrades().length; i++) {

            if (getGrades()[i] > highestGrade)
                highestGrade = getGrades()[i];

        }
        System.out.println("Top student is " + getName());
    }
}
