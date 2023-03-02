import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {

    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    Student(String name, int... marks){
        this.name = name;

        for(int mark:marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks(){
        return marks.size();
    }

    public int getSumOfMarks(){
        int sum = 0;
        for(int mark: marks){
            sum = sum + mark;
        }
        return sum;
    }

    public int getMaxMark(){
        int max = Integer.MIN_VALUE;
        for(int mark: marks){
            if(mark > max){
                max = mark;
            }
        }

        return max;
        //alt way
//        return Collections.max(marks);
    }

    public int getMinMark(){
        return Collections.min(marks);
    }

    public BigDecimal getAvgMark(){
        int sum = getSumOfMarks();
        int number = getNumberOfMarks();
        BigDecimal avg = new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

        //98.333333333 Precision(3) 98.334 Rounding mode
        return avg;
    }

    public String toString(){
        return name + marks;
    }

    public void addNewMark(int mark){
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index){
        marks.remove(index);
    }
}
