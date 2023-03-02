
// Encapsulation : binding data with methods
class Student{
    private int roll;
    private String name;

    //getters and setter

    public void setRoll(int r){
        roll = r;
    }

    public int getRoll(){
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.name = "Aashi"; //since private modifier is in use
//        s1.roll = 67;
        s1.setRoll(45);
        s1.setName("Aashi");

        System.out.println(s1.getRoll());
        System.out.println(s1.getName());

    }
}
