import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Иван", 20, 4));
        students.add(new Student("Мария", 22, 5));
        students.add(new Student("Алексей", 17, 3));
        students.add(new Student("Ольга", 19, 5));
        students.add(new Student("Дмитрий", 16, 2));
        students.add(new Student("Екатерина", 18, 4));

        System.out.println("Список всех студентов");

        for (Student s : students) {
            System.out.println(s);
        }

        students.remove(new Student("Алексей", 17, 3));
        System.out.println("\nУдалён Дмитрий");

        students.remove(0);
        System.out.println("Удалён студент с индексом 0");

        System.out.println("\nСписок после удалений");
        for (Student s : students) {
            System.out.println(s);
        }

//stream API
        List<Student> adults = students.stream()
                .filter(s -> s.getAge() > 18).toList();

        System.out.println("\nСтуденты старше 18 лет");
        adults.forEach(System.out::println);


        HashMap<String, Integer> gradeMap = new HashMap<>();


        for (Student s : students) {
            gradeMap.put(s.getName(), s.getGrade());
        }

        System.out.println("\nHashMap:\nИмя: оценка ");
        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        String bestStudent = null;
        int maxGrade = 0;

        for (Map.Entry<String, Integer> entry : gradeMap.entrySet()) {
            if (entry.getValue() > maxGrade) {
                maxGrade = entry.getValue();
                bestStudent = entry.getKey();
            }
        }

        System.out.println("\nСтудент с максимальной оценкой:");
        System.out.println(bestStudent + " с оценкой " + maxGrade);

    }
}