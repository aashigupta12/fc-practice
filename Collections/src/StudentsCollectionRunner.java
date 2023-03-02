import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class AscendingStudentComparator implements Comparator<Student> {

    //for asc stu1, stu2
    //for desc stu2 stu1
    @Override
    public int compare(Student stu1, Student stu2) {
        return Integer.compare(stu1.getId(), stu2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1,"Aashi"),
                                            new Student(102, "Mukul"),
                                            new Student(3, "Yash"));

        List<Student> studentsAl = new ArrayList<>(students);
        System.out.println(studentsAl);

//method1
        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("Asc - " + studentsAl);

        //method2
        Collections.sort(studentsAl);
        System.out.println("Desc - "  + studentsAl);

    }
}
