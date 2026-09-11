

public class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;

        isEnrolled = true;
    }

    void isStudying(){
        System.out.println(this.name + " is studying");
    }

    public static void main(String[] args) {
        Student first = new Student("Sam", 20, 8.4);
        Student second = new Student("Shreysi", 20, 8);


        System.out.println(first.name);
        System.out.println(second.name);
        System.out.println(second.age);
        System.out.println(second.gpa);
        System.out.println(second.isEnrolled);
        System.out.println(first.age);

        first.isStudying();
    }

    
}
