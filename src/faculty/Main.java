
package faculty;

import faculty.group.Info;
import faculty.students.Students;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Stat stat = new Stat();
        stat.addGroup(new Info("A-01-01"));
        stat.addGroup(new Info("A-01-02"));
        stat.addGroup(new Info("A-01-03"));
        stat.addGroup(new Info("A-01-04"));
        stat.addGroup(new Info("A-01-05"));
        List<Students> statistic = stat.getStatistic();
        System.out.println(statistic);
    }
}