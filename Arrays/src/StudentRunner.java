import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Aashi",97,98,100);
//        Student student1 = new Student("Yash",97,98);
//        Student student2 = new Student("Mukul",97,98,100, 67);


        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);

        int sum = student.getSumOfMarks();
        System.out.println("sum of marks : " + sum);

        int maxMark = student.getMaxMark();
        System.out.println(maxMark);

        int minMark = student.getMinMark();
        System.out.println(minMark);

        BigDecimal average = student.getAvgMark(); //98.33333...
        System.out.println(average);

        System.out.println(student);

        student.addNewMark(35);
        System.out.println(student);
        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}
