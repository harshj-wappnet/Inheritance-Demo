//simple demo of Hierarchical inheritance
class Main1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();
        Doctor doctor = new Doctor();

        student.show();
        student.show1();
        teacher.show2();
        doctor.show3();

    }
}

//base class or parent class
class Person {
    void show() {
        System.out.println("I am a person");
    }
}

//child class 1
class Student extends Person {
    void show1() {
        System.out.println("I am a Student who is person");
    }
}

//child class 2
class Teacher extends Person {
    void show2() {
        System.out.println("I am a Teacher who is person");
    }
}

//child class 3
class Doctor extends Person {
    void show3() {
        System.out.println("I am a Doctor who is person");
    }
}