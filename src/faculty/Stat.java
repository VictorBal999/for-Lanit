package faculty;

import faculty.group.Group;
import faculty.students.Students;

import java.util.ArrayList;
import java.util.List;

public class Stat {
    List<Group> groupList = new ArrayList<>();

    public void addGroup(Group group) {
        groupList.add(group);

    }

    public List<Students> getStatistic() {
        List<Students> student = new ArrayList<>();
        int max = 0;
        int max2=0;
        Group nameMark = groupList.get(0);
        Group nameCount = groupList.get(0);;
        for (Group group : groupList) {
            Students students = group.getStat();
            Students students2 = group.getStat2();
            int i = Integer.parseInt(String.valueOf(students));
            if(i > max) { max = i; nameMark= group;
            }
            int j = Integer.parseInt(String.valueOf(students2));
            if(j > max2) { max2 = j; nameCount= group;
            }
            System.out.println(group + " средняя оценка " + students);
            System.out.println(group + " количество студентов в группе " + students2);
            student.add(students);
        }
        System.out.println("Самый высокий балл " + max + " у " + nameMark);
        System.out.println("Самое большое число людей "+ max2 + " в " + nameCount );
        return student;
    }
}