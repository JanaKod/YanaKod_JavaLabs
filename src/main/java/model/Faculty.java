package model;

import java.util.List;
import java.util.Objects;

public class Faculty extends Object  {
    private String name;
    private Human head;
    private Human boss;
    private int maxDepartmentsCount;
    private List<Department> departments;

    public Human getBoss() {
        return boss;
    }

    public void setBoss(Human boss) {
        this.boss = boss;
    }

    public int getMaxDepartmentsCount() {
        return maxDepartmentsCount;
    }

    public void setMaxDepartmentsCount(int maxDepartmentsCount) {
        this.maxDepartmentsCount = maxDepartmentsCount;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "boss=" + boss +
                ", maxDepartmentsCount=" + maxDepartmentsCount +
                ", departments=" + departments +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        Faculty faculty = (Faculty) o;
        return maxDepartmentsCount == faculty.maxDepartmentsCount &&
                boss.equals(faculty.boss) &&
                departments.equals(faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boss, maxDepartmentsCount, departments);
    }

}