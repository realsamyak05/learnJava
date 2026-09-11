public class Person{
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Tom", "Riddle");
        Student std1 = new Student("Harry", "Potter", 4.6);

        System.out.println(std1.first + " " + std1.last + " " + std1.gpa);
    }
}

class Student extends Person{
    double gpa;
    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }
}
