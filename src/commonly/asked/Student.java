package commonly.asked;

import java.util.List;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    private String name;

    public Student(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    private List<Subject> subjects;
}
