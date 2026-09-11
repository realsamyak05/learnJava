

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Student first = new Student("Sam", 20, 8.4);
        Student second = new Student("Shreysi", 20, 8);


        System.out.println(first.name);
    }

    
}
