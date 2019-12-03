package faculty.group;

import faculty.students.AvgMark;
import faculty.students.Count;
import faculty.students.Students;

import java.util.Random;

public class Info implements Group {
    private final String name;
    private int mark = new Random().nextInt(5) + 1;
    private int amount = new Random().nextInt(25) + 1;

    public Info(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Группа: " + name;
    }


    @Override
    public Students getStat() {
        Students avgMark = new AvgMark(mark);
        return avgMark;
    }

    public  Students getStat2() {
        return new Count(amount);
    }

}