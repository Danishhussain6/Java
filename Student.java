class Student {

    String name;
    int age;

    // Constructor overloading
    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String n) {
        name = n;
        age = 18;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method overloading
    void display() {
        System.out.println(name + " " + age);
    }

    void display(String course) {
        System.out.println(name + " " + age + " " + course);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ali");
        Student s3 = new Student("Rahul", 21);

        s1.display();
        s2.display();
        s3.display("CSE");
    }
}
