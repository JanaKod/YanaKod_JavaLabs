package model;

import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private Human head;
    private int maxGroupsCount;
    private List<Group> groups;

    public int getMaxGroupsCount() {
        return maxGroupsCount;
    }

    public void setMaxGroupsCount(int maxGroupsCount) {
        this.maxGroupsCount = maxGroupsCount;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "maxGroupsCount=" + maxGroupsCount +
                ", groups=" + groups +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return maxGroupsCount == that.maxGroupsCount &&
                groups.equals(that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxGroupsCount, groups);
    }

}