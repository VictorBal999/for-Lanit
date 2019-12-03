
package faculty.students;

public class Count implements Students {
    private final int amount;

    public Count(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format(String.valueOf(amount));
    }
}