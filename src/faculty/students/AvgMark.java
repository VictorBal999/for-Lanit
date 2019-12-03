package faculty.students;

public class AvgMark implements Students {
    private final int mark;

    public AvgMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(mark));
    }
}