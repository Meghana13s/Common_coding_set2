package commonly.asked;

public class Subject {

    private String subName;

    public String getSubName() {
        return subName;
    }

    public Subject(String subName, int marks) {
        this.subName = subName;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subName='" + subName + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private int marks;
}
