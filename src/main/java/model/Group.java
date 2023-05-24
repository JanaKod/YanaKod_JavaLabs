package model;

import java.util.List;
import java.util.Objects;

public class Group {
    private String name;
    private Human head;
    private int maxStudentsCount;
    List<Student> students;

    public int getMaxStudentsCount() {
        return maxStudentsCount;
    }

    public void setMaxStudentsCount(int maxStudentsCount) {
        this.maxStudentsCount = maxStudentsCount;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "maxStudentsCount=" + maxStudentsCount +
                ", students=" + students.toString() +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Group)) return false;
        Group group = (Group) o;
        return maxStudentsCount == group.maxStudentsCount &&
                students.equals(group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxStudentsCount, students);
    }

}