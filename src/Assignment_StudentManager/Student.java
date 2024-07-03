package Assignment_StudentManager;


import java.util.Arrays;

public class Student {
       private static String name;
       private int age;
       private static int rollNumber;
       private String course;
       private static double [] grades;

    public Student(String name, int age, int rollNumber, String course, double[] grades) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.course = course;
        this.grades = grades;
    }

    public Student() {

    }


    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double calculateAverageGrade(){

        double sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum = sum + grades[i];

        }

        return sum/grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", course='" + course + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    void displayInfo(){

        System.out.println("Name :" + getName() +", Age :" + getAge() + ", Roll no. : " + getRollNumber() + ", Average grade : " + calculateAverageGrade());


    }
}
