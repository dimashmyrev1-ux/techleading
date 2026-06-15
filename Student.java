import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //--------------- Геттеры-----------------------
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    //--------------- Сеттеры-----------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
//--------------------------------------------------
    public String toString() {
        return "Student{" + "name='" + name + ", age=" + age + ", grade=" + grade + '}';
    }

    public boolean equals(Object o) {
        Student student = (Student) o;
        if (age == student.age && grade == student.grade && Objects.equals(name, student.name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Иван", 20, 4);
        Student student2 = new Student("Мария", 22, 5);
        Student student3 = new Student("Иван", 20, 4);
        Student student4 = new Student("Алексей", 21, 3);

        System.out.println("Информация о студентах:");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("\nСравнение студентов:");
        System.out.println("student1 равен student2? " + student1.equals(student2));
        System.out.println("student1 равен student3? " + student1.equals(student3));
        System.out.println("student2 равен student4? " + student2.equals(student4));

        student4.setGrade(4);
        System.out.println("\nПосле изменения оценки Алексея: " + student4);
    }
}