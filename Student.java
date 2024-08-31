import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Student {
    String name;
    int age;
    String studentdetails;

    Student(String name, int age, String studentdetails) {
        this.name = name;
        this.age = age;
        this.studentdetails = studentdetails;
    }

    public static void main(String[] args) {
        // Using Supplier to create a new ArrayList instance
        Supplier<List<Integer>> arrayListSupplier = ArrayList::new;
        List<Integer> arrayList = arrayListSupplier.get();
        arrayList.forEach(System.out::println);
        // Using another functional interface like Supplier to create a Student instance
        Supplier<Student> studentSupplier = () -> new Student("John", 20, "Detail");
        Student student = studentSupplier.get();
        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.studentdetails);
    }
}
