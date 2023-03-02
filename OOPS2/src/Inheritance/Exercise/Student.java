package Inheritance.Exercise;

public class Student extends Person{
    private String college;
    private int classCollege;

    public Student(String name, String college){
        super(name);
        this.college = college;
    }
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getClassCollege() {
        return classCollege;
    }

    public void setClassCollege(int classCollege) {
        this.classCollege = classCollege;
    }
}
